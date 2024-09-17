package practica3;

import java.util.Scanner;

import math.Vector;
import math.OperacionVectorEscalar;
import math.Operaciones;
import math.OperacionesVectores;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer option;
        
        do {
        	System.out.println("      Seleccione con que clase de datos desea trabajar ...");
            System.out.println("1. Operacion entre dos escalares.");
            System.out.println("2. Operacion entre dos vectores.");
            System.out.println("3. Operacion entre un escalar y un vector.");
            System.out.println("4. Salir.");
            option = in.nextInt();
            
            switch (option) {
            	case 1:
            		System.out.println("Ingrese los numeros escalares");
            		Integer a = in.nextInt();
            		Integer b = in.nextInt();
            		in.nextLine();
            		Operaciones op = new Operaciones();
            		System.out.println("Ingrese la clase de operacion que se realizara");
            		String opcion = in.nextLine();
            		switch (opcion){
            			case "suma":
            				Integer sum = op.suma(a, b);
            				System.out.println(sum);
            				break;
            			case "resta":
            				Integer res = op.resta(a, b);
            				System.out.println(res);
            				break;
            			case "division":
            				Integer div = op.division(a, b);
            				System.out.println(div);
            				break;
            			case "multiplicacion":
            				Integer mult = op.multiplicacion(a, b);
            				System.out.println(mult);
            				break;
            			default:
            				System.out.println("Operacion no valida, escriba de nuevo");
            				break;
            		}
            		break;
            	case 2:
            		System.out.println("Ingrese los valores en 'x' y 'y' del primer vector.");
            		Integer x1 = in.nextInt();
            		Integer y1 = in.nextInt();
            		Vector vector1 = new Vector(x1, y1);
            		System.out.println("Ingrese los valores en 'x' y 'y' del segundo vector.");
            		Integer x2 = in.nextInt();
            		Integer y2 = in.nextInt();
            		Vector vector2 = new Vector(x2, y2);
            		in.nextLine();
            		OperacionesVectores opve = new OperacionesVectores();
            		System.out.println("Ingrese la clase de operacion que se realizara");
            		String opci = in.nextLine();
            		switch (opci){
            			case "suma":
            				Vector sum = opve.suma(vector1, vector2);
            				sum.print();
            				break;
            			case "resta":
            				Vector res = opve.resta(vector1, vector2);
            				res.print();
            				break;
            			case "division":
            				Vector div = opve.division(vector1, vector2);
            				div.print();
            				break;
            			case "multiplicacion":
            				Vector mult = opve.multiplicacion(vector1, vector2);
            				mult.print();
            				break;
            			default:
            				System.out.println("Operacion no valida, escriba de nuevo");
            				break;
            		}
            		break;
            	case 3:
            		System.out.println("Ingrese los valores en 'x' y 'y' del vector.");
            		Integer x = in.nextInt();
            		Integer y = in.nextInt();
            		Vector vector = new Vector(x, y);
            		System.out.println("Ingrese el numero escalar.");
            		Integer es = in.nextInt();
            		in.nextLine();
            		OperacionVectorEscalar opes = new OperacionVectorEscalar();
            		System.out.println("Ingrese la clase de operacion que se realizara");
            		String opc = in.nextLine();
            		switch (opc){
            			case "suma":
            				Vector sum = opes.suma(vector, es);
            				sum.print();
            				break;
            			case "resta":
            				Vector res = opes.resta(vector, es);
            				res.print();
            				break;
            			case "division":
            				if(es==0) {
            					System.out.println("el numero escalar no puede ser 0.");
            				} else {
            					Vector div = opes.division(vector, es);
            					div.print();
            					break;
            					}
            			case "multiplicacion":
            				Vector mult = opes.multiplicacion(vector, es);
            				mult.print();
            				break;
            			default:
            				System.out.println("Operacion no valida, escriba de nuevo");
            				break;
            		}
            		break;
            	case 4:
            		System.out.println("Saliendo....");
            		break;
            	default:
            		System.out.println("Invalid option. Please try again.");
            }
        } while(option != 4);
    }
}