package ejercicio2;

public abstract class Vehicle {
	protected String brand;
	protected String model;
	protected Integer maximumSpeed;
	public Vehicle(String brand, String model, Integer maximumSpeed) {
		this.brand = brand;
		this.model = model;
		this.maximumSpeed = maximumSpeed;
	}
	public abstract void accelerate();
	
	public void showData() {
		System.out.println("Brand: " + this.brand + "Model: " + this.model + "Maximum Speed: " + this.maximumSpeed + ".");
	}
}
