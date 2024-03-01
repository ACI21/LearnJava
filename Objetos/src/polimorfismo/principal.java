/**
 * 
 */
package polimorfismo;

/**
 * 
 */
public class principal {

	/**
	 * @param args
	 */
	public static void main23(String[] args) {
		// TODO Auto-generated method stub
		Tarjeta card = new Vacaciones("Amy");
		card.saludar(); // Todo ok
		
		card = new SanValentin("Bob", 3);
		card.saludar(); // todo ok
		
		card = new Aniversario("cindy", 17);
		card.saludar(); // Compila pero fallo en el constructor
	
		Tarjeta c = new SanValentin("Debby", 8);
		//Aniversario b = new SanValentin("Debby", 8);
		SanValentin v = new SanValentin("Debby", 8);
		//Vacaciones h = new Aniversario("Debby", 8);
		// La primera y la tercera ok
		// Segunda y cuarta fallan porque son clases hermanas
	}

}
