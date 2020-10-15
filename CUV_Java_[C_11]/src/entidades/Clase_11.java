/*
 * Copyright (C) 2020 caidev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package entidades;

/**
 * @author FacuFalcone
 */
public class Clase_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Crear instancia para reservar memoria
		Persona sujeto = new Persona();
		
		//Hardcodeo de datos
		sujeto.setNombre("Facu");
		sujeto.setApellido("Falcone");
		sujeto.setEdad(30);
		
		// Muestra de datos
		System.out.println("Nombre: "+sujeto.getNombre());
		System.out.println("Apellido: "+sujeto.getApellido());
		System.out.println("Edad: "+sujeto.getEdad());
		
		//TODO hardcodear laboratorio y producto
	}
}
