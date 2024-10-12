package ejercicio1;

public class EspecialCard extends Card implements Actionable {

	public EspecialCard(Integer value, String club) {
		super(value, club);
	}

	@Override
	public void performAction() {
		System.out.println("The special card make an action.");
	}

	@Override
	public void play() {
		System.out.println("The special card has been played.");
	}

}
