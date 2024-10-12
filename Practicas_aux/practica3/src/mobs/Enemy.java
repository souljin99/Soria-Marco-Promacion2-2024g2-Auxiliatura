package mobs;

public class Enemy {
   public String name;
   public Integer hp;
   public Integer baseDamage;

   public Enemy(String name, Integer hp, Integer baseDamage) {
      this.name = name;
      this.hp = hp;
      this.baseDamage = baseDamage;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Integer getHp() {
      return this.hp;
   }

   public void setHp(Integer hp) {
      this.hp = hp;
   }

   public Integer getBaseDamage() {
      return this.baseDamage;
   }

   public void setBaseDamage(Integer baseDamage) {
      this.baseDamage = baseDamage;
   }

   public Integer toAttack() {
      return this.baseDamage;
   }

   public void takeDamage(Integer damage) {
      this.hp = this.hp - damage;
   }

   public boolean itsAlive() {
      return this.hp > 0;
   }
}