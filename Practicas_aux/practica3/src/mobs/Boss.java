package mobs;

import java.util.Random;

import mathing.RandomNumberGenerator;

public class Boss extends Enemy {
   private Integer damageMultiplier;
   RandomNumberGenerator r = new RandomNumberGenerator();

   public Boss(String name, Integer hp, Integer baseDamage, Integer damageMultiplier) {
      super(name, hp, baseDamage);
      this.damageMultiplier = damageMultiplier;
   }

   public Integer getDamageMultiplier() {
	return damageMultiplier;
   }

   public void setDamageMultiplier(Integer damageMultiplier) {
	   this.damageMultiplier = damageMultiplier;
   }

   public void talk() {
	   Integer opt = r.generateNumber(3);
	   System.out.println(this.name + ": ");
	   switch(opt) {
	   		case 1:
	   			System.out.println("¡YOU HAVE NO POWER HERE!");
	   			break;
	   		case 2:
	   			System.out.println("¡YOUR LUCK RAN OUT!");
	   			break;
	   		case 3:
	   			System.out.println("--inserte frase epica--");
	   			break;
      }

   }

   public Integer criticalHit() {
      return baseDamage * damageMultiplier;
   }
}