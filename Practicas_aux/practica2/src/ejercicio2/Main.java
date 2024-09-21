package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main (String arg[]) {
		Scanner in = new Scanner(System.in);
		List<String> wordList = new ArrayList<>();
		System.out.println("Igrese la lista de palabras....");
		System.out.println("Escriba la palabra fin para acabar con la lista.");
		String op;
		while (true) {
            op = in.nextLine();
            
            if (op.equalsIgnoreCase("fin")) {
                break;
            }
            wordList.add(op);
        }
		System.out.println("Ingrese la letra de la que desea contar cuantas palabras empiezan por ella.");
		String letter = in.next().toLowerCase();
		Integer cont = wordCounter(wordList, letter);
		System.out.println("La lista de palabras contiene " + cont + " palabras que empiezan por " + letter + ".");
	}
	static  Integer wordCounter(List<String> wordList, String letter) {
		Integer con=0;
		for (String word : wordList) {
			if (!word.isEmpty() && letter.charAt(0) == word.charAt(0)) {
                con++;
            }
		}
		return con;
	}
}
