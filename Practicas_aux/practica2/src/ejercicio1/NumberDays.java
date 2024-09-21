package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class NumberDays {
	List<Integer> thirtyOneMonth = new ArrayList<>();
	List<Integer> thirtyMonth = new ArrayList<>();
	public NumberDays() {
		this.thirtyOneMonth = thirtyOneMonth;
		this.thirtyMonth = thirtyMonth;
		thirtyOneMonth.add(1);
		thirtyOneMonth.add(3);
		thirtyOneMonth.add(5);
		thirtyOneMonth.add(7);
		thirtyOneMonth.add(8);
		thirtyOneMonth.add(10);
		thirtyOneMonth.add(12);
		thirtyMonth.add(4);
		thirtyMonth.add(6);
		thirtyMonth.add(9);
		thirtyMonth.add(11);
	}
	public List<Integer> getThirtyOneMonth() {	
		return thirtyOneMonth;
	}
	public List<Integer> getThirtyMonth() {
		return thirtyMonth;
	}
}