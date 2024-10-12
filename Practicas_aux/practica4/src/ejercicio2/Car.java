package ejercicio2;

public class Car extends Vehicle {

	public Car(String brand, String model, Integer maximumSpeed) {
		super(brand, model, maximumSpeed);
	}

	@Override
	public void accelerate() {
		System.out.println("The car " + this.brand + " just accelerated.");
	}
	
}
