/**
 * 
 */
package tarea5_1;

/**
 * 
 */
public abstract class ClaseAbstracta {

	public ClaseAbstracta() {
		System.out.println("Este es un constructor de clase abstracta");
	}
	
	public abstract void abstract_method();
	
	public void no_abstract_method() {
		System.out.println("Este es un método normal de clase abstracta");
	}
}
