package clashes;

import mathing.RandomNumberGenerator;
import mobs.Boss;
import mobs.Enemy;
import mobs.Vampire;
import mobs.Zombie;
import playablecharacter.Character;
import practica3.Options;

public class FightEnemies {
	Options op = new Options();
	RandomNumberGenerator r = new RandomNumberGenerator();
	public void fightMob(Character chart, Enemy en) {
		System.out.println("The battle begins....");
		while(chart.getHp()>0 && en.getHp()>0) {
			op.optionsEnemy(chart, en);
			System.out.println(en.getName().toUpperCase() + " is attacking....");
			chart.setHp(chart.getHp()-en.toAttack());
		}
		if (en.getHp()<=0) {
			if (chart.getLevel()==10) {
				System.out.println("Your level is at the maximum.");
				chart.setHp(chart.getHp() + 10);
				System.out.println("You got ten HP points for your victory.");
			} else {
				chart.setLevel(chart.getLevel() + 1);
				chart.setHp(chart.getHp() + 10);
				System.out.println("You went up one level, and got ten HP points");
			}
		} else {
			System.out.println("You lost, start the game again.");
		}
	}
	public void fightBoss(Character chart, Boss boss) {
		if(chart.getLevel()>=8) {
			boss.talk();
			while(chart.getHp()>0 && boss.getHp()>0) {
				//la probabilidad de dar un golpe critico es del 50%.
				//El boss siempre da el primer golpe.
				System.out.println("The battle begins....");
				if(r.generateNumber(2)==2) {
					chart.setHp(chart.getHp()-boss.criticalHit());
					System.out.println(boss.getName().toUpperCase() + " has landed a critical hit.");
				} else {
					System.out.println("The boss is attacking....");
					chart.setHp(chart.getHp()-boss.toAttack());
				}
				op.optionsEnemy(chart, boss);
			} 
		} else {
			System.out.println("You level is not enough, try figthing some mobs to level up.");
		}
	}
}
