package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el numero de directores a asistir....");
		Integer d = in.nextInt();
		while (!(d>=1) || !(d<=100)) {
			System.out.println("El numero de directores deben ser como maximo 100"
					+ ", y debe haber almenos un director.");
			System.out.println("Ingrese la cantidad de nuevo....");
			d = in.nextInt();
		}
		System.out.println("ahora ingrese la cantidad de minutos que durara la conferencia....");
		Integer m = in.nextInt();
		while (!(m>=1) || !(m<=1000)) {
			System.out.println("La cantidad de minutos de la conferencia debe ser de mil minutos como maximo"
					+ " y debe durar al menos un minuto.");
			System.out.println("Ingrese de nuevo los minutos...");
			m = in.nextInt();
			while (m<((d*2)-1)) {
				System.out.println("No puede haber mas directores que minutos disponibles");
				m = in.nextInt();
			}
		}
		while (m<((d*2)-1)) {
			System.out.println("No puede haber mas directores que minutos disponibles");
			m = in.nextInt();
		}
		m = m-(d-1);
		System.out.println("La duracion del discurso de"
				+ " cada director debe de ser " + m/d);
	}

}
