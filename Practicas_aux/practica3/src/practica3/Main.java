package practica3;

import java.util.Scanner;

import clashes.FightCharacter;
import clashes.FightEnemies;
import mathing.RandomNumberGenerator;
import mobs.Boss;
import mobs.Enemy;
import mobs.Vampire;
import mobs.Zombie;
import playablecharacter.Archer;
import playablecharacter.Character;
import playablecharacter.Warrior;
import playablecharacter.Wizard;

public class Main {
   public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
      Integer option;
      RandomNumberGenerator r = new RandomNumberGenerator();
      System.out.println("----game's name----");
      System.out.println("_This is a game of fast combat game. You will create a character, but your stats will be random.");
      do {
    	  System.out.println(" Select your character type to start the game: ");
    	  System.out.println("1.- Wizard.");
    	  System.out.println("2.- Archer.");
    	  System.out.println("3.- Warrior.");
    	  System.out.println("4.- Exit the game");
    	  option = in.nextInt();
    	  in.nextLine();
    	  switch(option) {
    	  	case 1:
    	  		System.out.println("¡Welcome to the path of magic!, what is your name?");
         		Wizard wizard = new Wizard(in.nextLine(), r.generateNumber(10), r.generateNumber(100), r.generateNumber(200));
         		fun(wizard);
         		break;
         	case 2:
         		System.out.println("Welcome, archer, to the paths of wind and precision!, what is your name?");
         		Archer archer = new Archer(in.nextLine(), r.generateNumber(10), r.generateNumber(100), r.generateNumber(200));
         		fun(archer);
         		break;
         	case 3:
         		System.out.println("Welcome, noble warrior, to the path of battle and honor!, what is your name?");
         		Warrior warrior = new Warrior(in.nextLine(), r.generateNumber(10), r.generateNumber(100), r.generateNumber(200));
         		fun(warrior);
         		break;
         	case 4:
         		System.out.println("Exiting....");
         		break;
         	default:
         		System.out.println("Invalid option. Please try again.");
         }
      } while(option != 4);

   }

   static void fun(Character characther) {
	  FightEnemies nf = new FightEnemies();
	  Boss boss = new Boss("King Voltrium", 500, 10, 2);
      Scanner in = new Scanner(System.in);
      System.out.println("-Well " + characther.getName().toUpperCase() + ", these are your current stats....");
      characther.showCurrentStatus();
      System.out.println("-Now lets start the game. What you wanna do?");
      Integer op;
      do {
    	  System.out.println("1.- Combat against another character.");
          System.out.println("2.- Combat against enemies of the world.");
          System.out.println("  -Fight enemies to level up.");
          System.out.println("3.- Boss challenge.");
          System.out.println("  -You need to be at least level 8.");
          System.out.println("4.- Go back.");
          op = in.nextInt();
          in.nextLine();
    	  switch(op) {
      		case 1:
      			fightMenu(characther);
      			break;
      		case 2:
      			enemiesMenu(characther);
      			break;
      		case 3:
      			System.out.println("----The Battle begins----");
      			nf.fightBoss(characther, boss);
      			break;
      		case 4:
      			break;
      		default:
      			System.out.println("Try again.");
      }
      }while(op!=4);
   }
   static void fightMenu(Character chart) {
	   Character winner =new Character();
	   Scanner in = new Scanner(System.in);
	   FightCharacter f = new FightCharacter();
	   RandomNumberGenerator r = new RandomNumberGenerator();
	   Wizard npc1 = new Wizard("Muson", 10, 80, 200);
	   Warrior npc2 = new Warrior("Torum", 7, 100, 190);
	   Archer npc3 = new Archer("Legolias", 9, 70, 195);
	   Integer option;
	   do {
		   System.out.println("These are the strongest characters in their respective fields. Choose carefully.");
		   System.out.println("1.- " + npc1.getName().toUpperCase() + " the most powerful Wizard, right hand of the demon king.");
		   npc1.showCurrentStatus();
		   System.out.println("2.- " + npc2.getName().toUpperCase() + " the strongest Warrior in north of Teyvat.");
		   npc2.showCurrentStatus();
		   System.out.println("3.- " + npc3.getName().toUpperCase() + " the most skilled Archer since the fall of remuria.");
		   npc3.showCurrentStatus();
		   System.out.println("4.- Show my current stats.");
		   option = in.nextInt();
		   switch (option) {
	   		case 1:
	   			System.out.println("Starting the fight....");
	   			winner = f.fighthing(chart, npc1);
	   			System.out.println("----The winner is " + winner.getName().toUpperCase() + "----");
	   			break;
	   		case 2:
	   			System.out.println("Starting the fight....");
	   			winner = f.fighthing(chart, npc1);
	   			System.out.println("The winner is " + winner.getName().toUpperCase() + "----");
	   			break;
	   		case 3:
	   			System.out.println("Starting the fight....");
	   			winner = f.fighthing(chart, npc1);
	   			System.out.println("The winner is " + winner.getName().toUpperCase() + "----");
	   			break;
	   		case 4:
	   			System.out.println("My stats: ");
	   			chart.showCurrentStatus();
	   			break;
	   		case 5:
	   			break;
		   }
	   }while (option!=5);
   }
   static void enemiesMenu(Character chart) {
	   Scanner in = new Scanner(System.in);
	   FightEnemies fe = new FightEnemies();
	   RandomNumberGenerator r = new RandomNumberGenerator();
	   Enemy vamp1 = new Vampire("Nosferatus", r.generateNumber(150), 5);
	   Enemy vamp2 = new Vampire("Ororon", r.generateNumber(150), 6);
	   Enemy zomb1 = new Zombie("Rob zombie", r.generateNumber(90), 3);
	   Enemy zomb2 = new Zombie("Jhon carpenter", r.generateNumber(90), 2);
	   Integer option;
	   do {
		   System.out.println("----Choose an enemy to fight.----");
		   System.out.println("1.- Zombie.");
		   System.out.println("2.- Vampire.");
		   System.out.println("3.-Go back.");
		   option = in.nextInt();
		   switch(option) {
		   	case 1:
		   		if (r.generateNumber(2)==1) {
		   			System.out.println("You are going to fight the zombie called " + zomb2.getName().toUpperCase() + ".");
		   			fe.fightMob(chart, zomb2);
		   		} else {
		   			System.out.println("You are going to fight the zombie called " + zomb1.getName().toUpperCase() + ".");
		   			fe.fightMob(chart, zomb1);
		   		}
		   		break;
		   	case 2:
		   		if (r.generateNumber(2)==1) {
		   			System.out.println("You are going to fight the zombie called " + vamp1.getName().toUpperCase() + ".");
		   			fe.fightMob(chart, vamp1);
		   		} else {
		   			System.out.println("You are going to fight the zombie called " + vamp2.getName().toUpperCase() + ".");
		   			fe.fightMob(chart, vamp2);
		   		}
		   		break;
		   	case 3:
		   		break;
		   	default:
		   		System.out.println("Try again.");
		   }
	   }while(option!=3);
   }
}