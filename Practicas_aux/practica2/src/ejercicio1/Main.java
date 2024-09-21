package ejercicio1;

import java.util.Scanner;


public class Main {
	public static void main (String arg[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("----Convertor fecha literal a numerica.----");
		System.out.println("Introdusca la feha:");
		System.out.println("(ej: 04 de abril de 2024.)");
		String date = in.nextLine().toLowerCase();
		DateConvertor dc = new DateConvertor();
		dc.dateSparator(date);
		dc.print();
	}
}