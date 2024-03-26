/**
 * 
 */
package PuestoFronterizo;

/**
 * 
 */
public class Persona {
	
	private String dni;
	private String nombre;
	
	/**
	 * 
	 */
	public Persona() {
		this("dni");
	}
	
	/**
	 * @param dni
	 */
	public Persona(String dni) {
		this(dni,"nombre");
	}

	/**
	 * @param dni
	 * @param nombre
	 */
	public Persona(String dni, String nombre) {
		setDni(dni);
		setNombre(nombre);
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	private void setDni(String dni) {
		this.dni = dni;
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

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	
	public int count(int i) {
		return 0;
	}
	public int count() {
		return 1;
	}
}
