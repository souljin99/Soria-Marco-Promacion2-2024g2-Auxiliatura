package laboratorio3;

public class ElectricVehicle extends Vehicle {
   private double batteryCapacity;
   private Integer range;

   public ElectricVehicle(String brand, String model, double price, double batteryCapacity, Integer range) {
      super(brand, model, price);
      this.batteryCapacity = batteryCapacity;
      this.range = range;
   }

   public void displayInfo() {
      super.displayInfo();
      System.out.println("Battery capacity: " + this.batteryCapacity + " kWh ");
   }

   public void displayRange() {
      System.out.println("Range: " + String.valueOf(this.range) + " km ");
   }
}