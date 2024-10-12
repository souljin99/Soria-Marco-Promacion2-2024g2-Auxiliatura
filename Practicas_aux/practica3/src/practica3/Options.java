package practica3;

import java.util.Scanner;

import clashes.FightCharacter;
import mathing.RandomNumberGenerator;
import mobs.Enemy;
import playablecharacter.Character;

public class Options {
	Scanner in = new Scanner(System.in);
	RandomNumberGenerator r = new RandomNumberGenerator();
	public void optionsEnemy(Character chart, Enemy en) {
		Integer op;
		do {
			System.out.println("1.- Provoke.");
			System.out.println("2.- Attack.");
			System.out.println("3.- Show my current stats.");
			System.out.println("4.- Show enemy health points.");
			System.out.println("5.- Leave Battle");
			System.out.println("  - If you leave the battle now, your lost hp will not be recovered.");
			op=in.nextInt();
			switch(op){
				case 1:
					switch(r.generateNumber(3)) {
						case 1:
							System.out.println("It's all you have!?");
							break;
						case 2:
							System.out.println("I'm not impressed but you can keep trying....");
							break;
						case 3:
							System.out.println("The fight is not over yet so get ready....");
							break;
					}
					break;
				case 2:
					Integer x = chart.doHarm(chart.getLevel());
					en.setHp(en.getHp()-x);
					System.out.println("You just did a " + x + " hit damage.");
					break;
				case 3:
					chart.showCurrentStatus();
					break;
				case 4:
					System.out.println(en.getName() + " health points: " + en.getHp() + ".");
					break;
				case 5:
					break;
				default:
					System.out.println("Try again....");
			}
		}while(op==1||op==3||op==4);
	}
	public void optionsCharacterCombat(Character chart, Character npc) {
		FightCharacter fc = new FightCharacter();
		Integer op;
		do {
			System.out.println("1.- Attack.");
			System.out.println("2.- Show my current stats.");
			System.out.println("3.- Show enemy stats.");
			System.out.println("4.- Leave Combat");
			System.out.println("  - If you leave the combat now, your lost hp will not be recovered.");
			op=in.nextInt();
			switch(op){
				case 1:
					fc.chartAttack(chart, npc);
					break;
				case 2:
					chart.showCurrentStatus();
					break;
				case 3:
					npc.showCurrentStatus();
					break;
				case 4:
					break;
				default:
					System.out.println("Try again....");
			}
		}while(op==2||op==3);
	}
}
