package ejercicio4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory invt = new Inventory();
        invt.addObject(new Obj("Sword", 3));
        invt.addObject(new Obj("Shield", 5));
        invt.addObject(new Obj("Posion", 1));
        invt.addObject(new Obj("Armor", 20));
        
        System.out.println("Objects that weigh more than 4 units: ");
        List<Obj> heavyObjects = invt.filteObjects(obj -> obj.getWeight() > 4);
        showData(heavyObjects);
        

        System.out.println("Objects whose name begins with 'S':");
        List<Obj> objWS = invt.filteObjects(obj -> obj.getName().startsWith("S"));
        showData(objWS);

        System.out.println("Objects weighing less than 2 unit: ");
        List<Obj> objetosLigeros = invt.filteObjects(obj -> obj.getWeight() < 2);
        showData(objetosLigeros);
    }
    public static void showData(List<Obj> objs) {
    	for (Obj object : objs) {
    		System.out.println(object.getName());
    	}
    }
}
