package ejercicio3;

public class Cow extends Animal implements Producer {

	public Cow(String name, Integer age) {
		super(name, age);
	}

	@Override
	public void produce() {
		System.out.println("The Cow " + this.name + " is producing milk.");
	}

	@Override
	public void makeSound() {
		System.out.println(this.name + ": moo");
	}
	
}
