package playablecharacter;

public class Warrior extends Character {
   private Integer strength;

   public Warrior(String name, Integer level, Integer hp, Integer strength) {
      super(name, level, hp);
      this.strength = strength;
   }

   public void toAttack() {
      System.out.println("The warrior " + this.getName() + "has made an attack.");
   }
   
   public Integer getStrength() {
	return strength;
   }

   public void setStrength(Integer strength) {
	this.strength = strength;
   }

   public void showCurrentStatus() {
	   System.out.println("-------------");
	   System.out.println("Level: " + String.valueOf(this.getLevel()));
	   System.out.println("Health points: " + String.valueOf(this.getHp()));
	   System.out.println("Current strength: " + String.valueOf(this.strength));
	   System.out.println("-------------");
   }
}
