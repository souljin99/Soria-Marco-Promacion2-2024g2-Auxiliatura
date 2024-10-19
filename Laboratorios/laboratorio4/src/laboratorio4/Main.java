package laboratorio4;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));
        store.addProduct(new Accessory("Headsets", 100.0)); 
        store.addProduct(new Accessory("Phone Charger", 40.0)); 
        
        System.out.println("Applying 10% disocunt.");
        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        store.applyDiscount(tenPercentDiscount);
        System.out.println("");
        
        System.out.println("Applying 50 dollars discount.");
        Discountable fiftyDollarsDiscount = product -> product.getPrice() - 50.0;
        store.applyDiscount(fiftyDollarsDiscount);
        System.out.println("");
        
        System.out.println("Applying 5% discount.");
        Discountable fivePercentDiscount = product -> product.getPrice() * 0.05;
        store.applyDiscount(fivePercentDiscount);
        System.out.println("");
        
        System.out.println("Applying 15% discount.");
        Discountable fifteenPercentDiscount = product -> product.getPrice() * 0.15;
        store.applyDiscount(fifteenPercentDiscount);
        System.out.println("");
    }
}

