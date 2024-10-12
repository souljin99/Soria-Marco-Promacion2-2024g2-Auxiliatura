package playablecharacter;

public class Wizard extends Character {
   private Integer mana;
   
   public Wizard(String name, Integer level, Integer hp, Integer mana) {
      super(name, level, hp);
      this.mana = mana;
   }

   public void castSpell() {
      System.out.println("The Wizard " + this.getName() + " has cast a spell.");
   }

   public Integer getMana() {
      return this.mana;
   }

   public void setMana(Integer mana) {
      this.mana = mana;
   }

   public void showCurrentStatus() {
      System.out.println("-------------");
      System.out.println("Level: " + String.valueOf(this.getLevel()));
      System.out.println("Health points: " + String.valueOf(this.getHp()));
      System.out.println("Current mana: " + String.valueOf(this.mana));
      System.out.println("-------------");
   }
}