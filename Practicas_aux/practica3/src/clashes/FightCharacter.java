package clashes;

import playablecharacter.Character;
import practica3.Options;
import mathing.RandomNumberGenerator;

public class FightCharacter {
	RandomNumberGenerator r = new RandomNumberGenerator();
	Options x = new Options();
	public Character fighthing(Character chart, Character npc) {
		//empieza la batalla el que tenga menos vida.
		if(chart.getHp() <= npc.getHp()) {
			System.out.println("You start by taking the first blow.");
			System.out.println("");
			System.out.println("");
			System.out.println(chart.getName() + ": ");
			System.out.println("'They say you are one of the best, let's check it out.'");
			x.optionsCharacterCombat(chart, npc);
			while(chart.getHp()>0 && npc.getHp()>0) {
				npcAttack(chart, npc);
				x.optionsCharacterCombat(chart, npc);
			}
		} else {
			System.out.println("The enemy begins by giving the first blow.");
			System.out.println("");
			System.out.println("");
			System.out.println(npc.getName() + ": ");
			System.out.println("'Let's end this quickly'");
			chart.setHp(chart.getHp() - npc.doHarm(npc.getLevel()));
			while(chart.getHp()>0 && npc.getHp()>0) {
				x.optionsCharacterCombat(chart, npc);		
				npcAttack(chart, npc);
			}
		}
		if (chart.getHp()<=0) {
			return npc;
		} else {
			return chart;
		}
	}
	public void npcAttack(Character chart, Character npc) {
		System.out.println("--------Your opponent is attacking.-------");
		Integer option = r.generateNumber(3);
		System.out.println(npc.getName() + ": ");
		switch(option) {
			case 1:
				System.out.println("You will lose not because you are weak, but because I am the most powerful.");
				break;
			case 2:
				System.out.println("That hurts, now prepare yourself and try not to die.");
				break;
			case 3:
				System.out.println("¡Take this!");
		}
		chart.setHp(chart.getHp() - npc.doHarm(npc.getLevel()));
		chart.showCurrentStatus();
	}
	public void chartAttack(Character chart, Character npc) {
		System.out.println("--------Your character is attacking.-------");
		System.out.println(chart.getName() + ": ");
		switch(r.generateNumber(3)) {
			case 1:
				System.out.println("This will be your last mistake. Prepare to meet your end.");
				break;
			case 2:
				System.out.println("Your turn, don't fail or you'll regret it.");
				break;
			case 3:
				System.out.println("I guess I underestimated you, I'll have to get serious.");
		}
		npc.setHp(npc.getHp()-chart.doHarm(chart.getLevel()));
		npc.showCurrentStatus();
	}
}