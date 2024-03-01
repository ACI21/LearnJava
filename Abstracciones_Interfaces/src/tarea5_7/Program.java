/**
 * 
 */
package tarea5_7;

import java.util.Arrays;

/**
 * 
 */
public class Program {

	/*
	 * 
Estudiantes sin ordenar:
1. Patri - Altura: 170 - Edad: 12
2. Manuel - Altura: 173 - Edad: 43
3. Javier - Altura: 189 - Edad: 72
4. Alicia - Altura: 168 - Edad: 52
5. Alberto - Altura: 189 - Edad: 35
Estudiantes sin ordenar:
1. Javier - Altura: 189 - Edad: 72
2. Alberto - Altura: 189 - Edad: 35
3. Manuel - Altura: 173 - Edad: 43
4. Patri - Altura: 170 - Edad: 12
5. Alicia - Altura: 168 - Edad: 52
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante[] alu = {
				new Estudiante("Juan",13,145),
				new Estudiante("Luisa",23,154),
				new Estudiante("Luis",23,155),
				new Estudiante("Maria",266,154),
				new Estudiante("Alicia",99, 132),
				new Estudiante("Margaret",16,176)
		};
		
		System.out.println("Estudiantes sin ordenar:");
		for (int i = 0; i < alu.length; i++) {
			System.out.println(alu[i].toString());
		}
		
		Arrays.sort(alu);
		
		System.out.println("\nEstudiantes ordenados:");
		for (Estudiante estudiante : alu) {
			System.out.println(estudiante.toString());
		}
	}

}
