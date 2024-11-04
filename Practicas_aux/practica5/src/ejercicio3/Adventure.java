package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Adventure {
	private List<Task> tasks = new ArrayList<>();
	public void addTask(Task task) {
		tasks.add(task);
	}
	public void start() {
		for(Task task : tasks) {
			task.execute();
		}
	}
}
