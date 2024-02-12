package tema3;

public class Program {

	public static void main(String[] args) {

		String teaTxt = "Tea"; // Apuntan a la cadena
		String b = "Tea";

		if (teaTxt == b) {
			System.out.println("Iguales");
		} else {
			System.out.println("Diferentes");
		}

		String c = new String("Tea"); // Apunta a una nueva cadena en memoria
		if (teaTxt == c) {
			System.out.println("Iguales");
		} else {
			System.out.println("Diferentes");
		}

		String d = c.intern();// Saca el valor de la memoria y lo pasa a cadena
		if (teaTxt == d) {
			System.out.println("Iguales");
		} else {
			System.out.println("Diferentes");
		}
		
		c = teaTxt + ' ' + b;
		System.out.println(c);
		
		// Encuentra la primera posicion en la que aparece la letra
		System.out.println(c.indexOf('T'));
		// Encuentra la primera posicion en la que aparece la letra a 
		// partir de la posicion indicada
		System.out.println(c.indexOf('T',1));
		
		System.out.println(c.charAt(c.length()-1));
		
		System.out.println(c.toUpperCase());
		
		System.out.println(c.substring(c.lastIndexOf('T'),c.lastIndexOf('T')+2));
		
		StringBuilder txt = new StringBuilder(c);
		
	}
}
