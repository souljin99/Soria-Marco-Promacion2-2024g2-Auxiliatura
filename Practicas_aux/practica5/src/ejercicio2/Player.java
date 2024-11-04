package ejercicio2;

public class Player {
	private String name;
	private Integer points;
	
	public Player(String name, Integer points) {
		this.name = name;
		this.points = points;
	}
	
	public void applyBonus(BonusCalculator calculator) {
		points = calculator.calculate(points);
	}
	public void showData() {
        System.out.println("Name: " + name + ", Points: " + points);
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	
	
}
