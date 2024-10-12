package ejercicio2;

public class Motorcycle extends Vehicle implements Turbo {

	public Motorcycle(String brand, String model, Integer maximumSpeed) {
		super(brand, model, maximumSpeed);
	}

	@Override
	public void activateTurbo() {
		System.out.println("The motorcycle " + this.brand + " just activated the turbo.");
	}

	@Override
	public void accelerate() {
		System.out.println("The motorcycle " + this.brand + " just acelerate.");
	}

}
