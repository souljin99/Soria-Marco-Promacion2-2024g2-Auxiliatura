package ejercicio3;

public class Main {
		public static void main(String[] args) {
	        Adventure advt = new Adventure();
	        
	        advt.addTask(() -> System.out.println("Task 1: turn on the flashlight."));
	        advt.addTask(() -> System.out.println("Task 2: explore the cave."));
	        advt.addTask(() -> System.out.println("Task 3: collect minerals."));
	        advt.addTask(() -> System.out.println("Task 4: go back to camp."));
	        advt.start();
	    }
	}