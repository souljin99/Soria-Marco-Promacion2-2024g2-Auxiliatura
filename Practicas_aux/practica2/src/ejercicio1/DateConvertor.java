package ejercicio1;

import java.util.HashMap;
import java.util.List;

public class DateConvertor {
	MonthStorer monthStorer = new MonthStorer();
	NumberDays nd = new NumberDays();
	List<Integer> thirtyOneMonth = nd.getThirtyOneMonth();
	List<Integer> thirtyMonth = nd.getThirtyMonth();
	HashMap<String, Integer> months = monthStorer.getMonths();
	Integer numMonth, numDay;
	String day, month, year;
	
	
	public void dateSparator(String date) {
		String[] parts = date.split(" de ");
	    day = parts[0];
	    month = parts[1];
	    year = parts[2];
	    numDay = Integer.parseInt(day);
	    monthConvertor(month);
	}
	public Integer monthConvertor(String month) {
		if (months.containsKey(month)) {
			numMonth = months.get(month);
		} else {
			numMonth = 0;
		}
		return numMonth;
		
	}
	public void print() {
		if (numMonth == 0) {
			System.out.println("El mes añadido no es valido.");
		} else {
			if (numDay > 0 && numDay < 32) {
				if (thirtyMonth.contains(numMonth)) {
					if(numDay == 31) {
						System.out.println("Este mes solo tiene 30 dias.");
					} else {
						System.out.println(day + "/" + numMonth + "/"  + year);
					}
				} else {
					if(thirtyOneMonth.contains(numMonth)) {
						System.out.println(day + "/" + numMonth + "/"  + year);
					} else {
						if(numDay > 28) {
							System.out.println("El mes de febrero solo tiene 28 dias.");
						} else {
							System.out.println(day + "/" + numMonth + "/"  + year);
						}
					}
				}
			} else {
				System.out.println("El dia añadido no es valido.");
			}
		
		}
	}
}