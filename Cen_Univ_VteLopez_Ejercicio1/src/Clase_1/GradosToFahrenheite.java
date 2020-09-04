/*
 * ============================================================================
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 * ============================================================================
 * Author		: FacuFalcone.
 * Type			: Ejercicio 4.
 * SO			: [Linux]
 * Version		: Beta 1.0.0 [Beta v1.0.0]
 * ============================================================================
 */

package Clase_1;

import java.util.Scanner;

public class GradosToFahrenheite {

	/***
	 * Dada una temperatura en grados centígrados, mostrarla en grados
	 * Fahrenheit.
	 */
	public static void Grados_To_Fahrenheite() {
		double celcius;
		double fahrenheite;
		
		@SuppressWarnings("resource")
		Scanner gradosIn = new Scanner(System.in);
		
		System.out.print("Ingrese grados Celcius: ");
		celcius = gradosIn.nextDouble();
		fahrenheite = (celcius*9/5) + 32;
		
		System.out.println(celcius + "°C representan: " + fahrenheite + "°F.");
	}
	
	public static void main(String[] args) {
		Grados_To_Fahrenheite();
	}
}
