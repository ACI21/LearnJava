package polimorfismo;

public class principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent rod;
		Rat rat;
		Mouse mou;
		
		rod = new Rat(); // OK
		//mou = new Rat(); // Son hermanas
		//rat = new Rodent(); // hijo no puede ser padre
		//rat = new FieldMouse(); // rat no puede ser sobrino
		rod = new FieldMouse(); // OK
		//mou = new Rodent(); // Hijo no puede ser padre
		rat = new LabRat(); // OK
		//rat = new Mouse(); //Son hermanas
	}

}
