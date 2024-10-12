package ejercicio1;

public class NormalCard extends Card {

	public NormalCard(Integer value, String club) {
		super(value, club);
	}

	@Override
	public void play() {
		System.out.println("The normal card has been played.");
	}
}
