package unico;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* Diseñar un programa que muestre, para cada número 
		 introducido por teclado, si es par, si es positivo, 
		 y su cuadrado. El proceso terminará cuando el número 
		 introducido por teclado sea 0.
		 */

		Scanner leer = new Scanner(System.in);
		int num;
		String mensaje;
		int cuadrado;
		
		System.out.print("Introduzca un número ");
		num = Integer.parseInt(leer.nextLine());
		
			mensaje = (num % 2 == 0) ? "Es par," : "No es par,";
					
			mensaje += (num < 0) ? " no es positivo," : " es positivo,";
			
			mensaje += " su cuadrado vale " + (num * num);
			
			System.out.println("El número " + num);
			System.out.println(mensaje);
			System.out.print("Introduzca un número[0 para salir] ");
			
			num = Integer.parseInt(leer.nextLine());
		
	}

}
