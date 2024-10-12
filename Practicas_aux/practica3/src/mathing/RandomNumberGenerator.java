package mathing;

import java.util.Random;

public class RandomNumberGenerator {
	//metodo que me genere un numero aletaorio en un rango de 1 hasta N.
	public Integer generateNumber(Integer n) {
		Random rand = new Random();
        return rand.nextInt(n) + 1;
	}
}
