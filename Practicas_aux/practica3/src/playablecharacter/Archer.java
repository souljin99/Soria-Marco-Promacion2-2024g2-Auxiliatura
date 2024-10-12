package playablecharacter;

public class Archer extends Character {
   private Integer skill;

   public Archer(String name, Integer level, Integer hp, Integer skill) {
      super(name, level, hp);
      this.skill = skill;
   }

   public void shootArrow() {
      System.out.println("The archer " + this.getName() + " has shot an arrow.");
   }

   public Integer getSkill() {
      return this.skill;
   }

   public void setSkill(Integer skill) {
      this.skill = skill;
   }

   public void showCurrentStatus() {
      System.out.println("-------------");
      System.out.println("Level: " + String.valueOf(this.getLevel()));
      System.out.println("Health points: " + String.valueOf(this.getHp()));
      System.out.println("Current skill: " + String.valueOf(this.skill));
      System.out.println("-------------");
   }
}