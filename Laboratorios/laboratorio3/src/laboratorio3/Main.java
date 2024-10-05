package laboratorio3;

public class Main {
   public static void main(String[] args) {
      ElectricVehicle myEV = new ElectricVehicle("Tesla", "Model 3", 50000.0D, 75.0D, 500);
      myEV.start();
      myEV.displayInfo();
      myEV.displayRange();
      myEV.stop();
   }
}