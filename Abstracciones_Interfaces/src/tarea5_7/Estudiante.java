/**
 * 
 */
package tarea5_7;

/**
 * 
 */
public class Estudiante implements Comparable<Estudiante>{

	String nombre;
	int edad;
	int altura;
	
	/**
	 * @param nombre
	 * @param edad
	 * @param altura
	 */
	public Estudiante(String nombre, int edad, int altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public int compareTo(Estudiante otroEstudiante) {
		
		int compararAlturas = otroEstudiante.getAltura() - this.altura;
		
		if(compararAlturas != 0) {
			return compararAlturas;
		}
		
		return this.edad - otroEstudiante.getEdad();
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + "]";
	}
}
