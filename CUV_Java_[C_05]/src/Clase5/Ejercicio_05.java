/**
 * 
 */
package Clase5;

import java.util.Scanner;

/**
 * @author Facu
 *
 */
public class Ejercicio_05 {

	/**
	 * Realizar un programa que solicite los valores m�nimo y m�ximo de un rango a
	 * continuaci�n solicitara por teclado un n�mero que debe estar dentro del rango.
	 * Si el valor introducido no pertenece al rango , la aplicaci�n volver� a pedir otro
	 * valor y as� repetida veces hasta que el valor este dentro del rango.
	 */
	public static void NumeroEnRango() {
		int limiteMinimo;
		int limiteMaximo;
		int numero;
		boolean fueraDeRango = true;
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		System.out.print("Ingrese limite minimo de rango: ");
		limiteMinimo = num.nextInt();
		System.out.print("Ingrese limite maximo de rango: ");
		limiteMaximo = num.nextInt();
		
		while(fueraDeRango) {
			System.out.print("Ingrese un numero dentro del rango [" + limiteMinimo + "-" +limiteMaximo + "]: ");
			numero = num.nextInt();
			if(numero>limiteMinimo && numero<limiteMaximo) {
				System.out.println("Perfecto!");
				fueraDeRango = false;
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumeroEnRango();
	}
}
