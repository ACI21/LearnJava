/**
 * 
 */
package basicos;

enum armas {
	espada, daga, arco
}
/**
 * 
 */
public class guerrero extends humano {
	
	private String arma;
	private String armadura;
	private armas a;
	private humano[] humanito;
	

	public guerrero(String nombre, int edad, String extremidades,int arma, String armadura) {
		super(nombre, edad, extremidades);
		// TODO Auto-generated constructor stub
		switch (arma) {
		case 1:
			this.arma = armas.espada.toString();
			break;
		case 2:
			this.arma = armas.daga.toString();
			break;

		default:
			break;
		}
		this.armadura = armadura;
	}

	public guerrero(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "guerrero [arma=" + arma + ", armadura=" + armadura + ", a=" + a + "]"
				+ super.toString();
	}
	
	
	
	

	

}
