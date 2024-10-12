package playablecharacter;

import mathing.RandomNumberGenerator;

public class Character {
	RandomNumberGenerator r = new RandomNumberGenerator();
	private String name;
	private Integer level;
	private Integer hp;
   
	public Character() {
	}
	public Character(String name, Integer level, Integer hp) {
		this.name = name;
		this.level = level;
		this.hp = hp;
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevel() {
	   return this.level;
	}

	public void setLevel(Integer level) {
     	this.level = level;
	}

	public Integer getHp() {
		return this.hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}	

	public void showCurrentStatus() {
		System.out.println("-------------");
		System.out.println("Character: " + this.name);
		System.out.println("Level: " + String.valueOf(this.level));
		System.out.println("Health points: " + String.valueOf(this.hp));
		System.out.println("-------------");
	}
	//el multiplicador de daño es el nivel del personaje.
	public Integer doHarm(Integer multiplier) {
	   return r.generateNumber(8)*multiplier;
   }
   public Integer takeDamage(Integer damage) {
      this.hp = this.hp - damage;
      return this.hp;
   }

   public Integer healing() {
      return this.hp + 20;
   }
}