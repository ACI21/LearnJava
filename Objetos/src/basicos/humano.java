/**
 * 
 */
package basicos;

import java.util.Objects;

/**
 * 
 */
public class humano {
	
	private String nombre;
	private int edad;
	private String extremidades;
	
	public humano(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.extremidades = null;
	}
	
	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param extremidades
	 */
	public humano(String nombre, int edad, String extremidades) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.extremidades = extremidades;
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getExtremidades() {
		return extremidades;
	}

	public void setExtremidades(String extremidades) {
		this.extremidades = extremidades;
	}

	@Override
	public String toString() {
		return "humano [nombre=" + nombre + ", edad=" + edad + ", extremidades=" + extremidades + "]";
	}
	
	
	
}
