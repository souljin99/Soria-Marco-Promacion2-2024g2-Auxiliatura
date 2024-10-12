package ejercicio2;

public class ElectricCar extends Vehicle implements Refuel {
	public String batteryCapacity;
	public ElectricCar(String brand, String model, Integer maximumSpeed) {
		super(brand, model, maximumSpeed);
		this.batteryCapacity = batteryCapacity;
	}

	public String getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public void Recharging() {
	}

	@Override
	public void accelerate() {
		
	}
	
}
