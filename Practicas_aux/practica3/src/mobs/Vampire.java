package mobs;

public class Vampire extends Enemy {
   public Vampire(String name, Integer hp, Integer baseDamage) {
      super(name, hp, baseDamage);
   }

   public Integer toAttack() {
      this.setHp(this.hp + this.baseDamage / 2);
      return this.baseDamage;
   }
}