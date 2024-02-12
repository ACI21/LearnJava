/**
 * 
 */
package basicos;

import java.util.Arrays;

/**
 * 
 */
enum diasSemana {
	Lunes, Martes
}

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dia = diasSemana.Lunes.toString();
		String[][][] h = new String[7][7][7];
		
		Arrays.sort(h);

		humano humanito = new humano(dia, 0);
		humanito.setNombre("juanito");
		
	    humanito = new humano(dia, 0);

		System.out.println(humanito.toString());
		
		guerrero gg = new guerrero("juanito",12,"brazos",1,"bronce");
		
		System.out.println(gg.toString());

	}

}
