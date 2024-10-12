package ejercicio3;

public abstract class Animal {
	protected String name;
	protected Integer age;
	public Animal(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void makeSound();
	
	public void showInfo() {
		System.out.println("Name: " + this.name + ", Age: " + this.age);
	}
}
