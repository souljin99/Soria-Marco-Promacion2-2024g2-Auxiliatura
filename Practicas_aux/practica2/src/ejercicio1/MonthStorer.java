package ejercicio1;

import java.util.HashMap;

public class MonthStorer {

	private HashMap<String, Integer> months = new HashMap<>();

	public MonthStorer() {
		months.put("enero", 1);
		months.put("febrero", 2);
		months.put("marzo", 3);
		months.put("abril", 4);
		months.put("mayo", 5);
		months.put("junio", 6);
		months.put("julio", 7);
		months.put("agosto", 8);
		months.put("septiembre", 9);
		months.put("octubre", 10);
		months.put("noviembre", 11);
		months.put("diciembre", 12);
	}

	public HashMap<String, Integer> getMonths() {
		return months;
	}
}