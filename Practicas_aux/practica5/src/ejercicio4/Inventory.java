package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Obj> objects = new ArrayList<>();
	
	public void addObject(Obj object) {
		objects.add(object);
    }
	public List<Obj> filteObjects(ObjectFilter filter) {
        List<Obj> filteredObjects = new ArrayList<>();
        for (Obj object : objects) {
            if (filter.filterBy(object)) {
            	filteredObjects.add(object);
            }
        }
        return filteredObjects;
    }
}
