package laboratorio3;

public class Vehicle {
   private String brand;
   private String model;
   private double price;

   public Vehicle(String brand, String model, double price) {
      this.brand = brand;
      this.model = model;
      this.price = price;
   }

   public void start() {
      System.out.println(this.brand + " " + this.model + " is starting....");
   }

   public void stop() {
      System.out.println(this.brand + " " + this.model + " is stoping....");
   }

   public void displayInfo() {
      System.out.println("Brand: " + this.brand + ", Model: " + this.model + ", Price: " + this.price);
   }
}