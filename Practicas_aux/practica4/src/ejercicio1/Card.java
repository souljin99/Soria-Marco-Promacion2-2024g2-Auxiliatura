package ejercicio1;

public abstract class Card {
	protected Integer value;
	protected String club;

	public Card(Integer value, String club) {
		this.value = value;
		this.club = club;
	}
	public abstract void play();
	public void showCard() {
		System.out.println(this.value + this.club);
	}
}
