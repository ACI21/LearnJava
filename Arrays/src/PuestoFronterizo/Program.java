/**
 * 
 */
package PuestoFronterizo;

import java.util.Scanner;

/**
 * 
 */
public class Program {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona z[] = new Persona[1];
		int opciones = 0;
		
		do {
			System.out.println("introduce del 1 al 4: ");
			opciones = sc.nextInt();
			switch (opciones) {
			case 1:
				z = AnyadirPersonas(z);
				break;
			case 2:
				MostrarPersonas(z);
				break;
			case 3:
				BusquedaNombre(z);
				break;
			case 4:
				BusquedaDni(z);
				break;
			case 6:
				break;
			default:
				System.out.println("Opcion invalida.");
				break;
		}
			
		}while(opciones != 6);

	}

	private static void BusquedaDni(Persona[] z) {
		// TODO Auto-generated method stub
		System.out.println("Introduce dni a buscar: ");
		String dni = sc.next();
		
		for (int i = 0; i < z.length; i++) {
			if(z[i].getDni().toString().equals(dni)) {
				System.out.println(z[i].toString());
				break;
			}
		}
	}

	private static void BusquedaNombre(Persona[] z) {
		// TODO Auto-generated method stub
		System.out.println("Introduce nombre a buscar: ");
		String nombre = sc.next();
		
		for (int i = 0; i < z.length; i++) {
			if(z[i].getNombre().toString().equals(nombre)) {
				System.out.println(z[i].toString());
			}
		}
	}

	private static void MostrarPersonas(Persona[] z) {
		// TODO Auto-generated method stub
		for (int i = 0; i < z.length; i++) {
			System.out.println(z[i].toString());
		}
	}

	private static Persona[] AnyadirPersonas(Persona[] z) {
		// TODO Auto-generated method stub
		String repetir = "";
		do {
			System.out.println("Introduce dni: ");
			String dni = sc.next();
			System.out.println("Introduce nombre: ");
			String nombre = sc.next();
			
			z[z.length-1] = new Persona(dni, nombre);
			
			System.out.println("Quieres añadir otro? S/N");
			repetir = sc.next();
			if(repetir.equalsIgnoreCase("S")) {
				z = AmpliarAgenda(z);
			}
		}while(repetir.equalsIgnoreCase("S"));
		
		return z;
	}

	private static Persona[] AmpliarAgenda(Persona[] z) {
		// TODO Auto-generated method stub
		Persona aux[] = new Persona[z.length];
		for (int i = 0; i < z.length; i++) {
			aux[i] = z[i];
		}
		z = new Persona[aux.length +1];
		for (int i = 0; i < aux.length; i++) {
			z[i] = aux[i];
		}
		
		return z;
	}


}
