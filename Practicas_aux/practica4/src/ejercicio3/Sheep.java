package ejercicio3;

public class Sheep extends Animal implements Producer {

	public Sheep(String name, Integer age) {
		super(name, age);
	}

	@Override
	public void produce() {
		System.out.println("The Sheep " + this.name + " is producing wool.");
	}

	@Override
	public void makeSound() {
		System.out.println(this.name + ": baa");
	}
	
}
