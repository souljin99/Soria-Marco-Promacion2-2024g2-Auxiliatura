package mobs;

public class Zombie extends Enemy {
   public Zombie(String name, Integer hp, Integer baseDamage) {
      super(name, hp, baseDamage);
   }

   public Integer toAttack() {
      this.setHp(this.hp + 5);
      return this.baseDamage;
   }
}