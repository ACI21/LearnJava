package polimorfismo;

public class MainPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monovolumen m = new Monovolumen("el nuevo", 3);
		Coupe c = new Coupe("el nuevo", 3);
		Deportivo d = new Deportivo("el nuevo", 3);

		m.arrancar();
		m.acelerar();
		m.frenar();
		c.arrancar();
		c.acelerar();
		c.frenar();
		d.arrancar();
		d.acelerar();
		d.frenar();
	
	}

}



class Coche {
	private String modelo;
	private boolean motor;
	private int ruedas;
	private int cilindros;
	
	public Coche(String modelo, int cilindros) {
		this.cilindros = cilindros;
		this.modelo = modelo;
		motor = true;
		ruedas = 4;
	}
	
	public void arrancar() {
		System.out.println("Motor de coche encendido.");
	}
	
	public void acelerar() {
		System.out.println("Acelerando coche...");
	}
	
	public void frenar() {
		System.out.println("Frenando coche...");
	}
	
}


class Monovolumen extends Coche{

	public Monovolumen(String modelo, int cilindros) {
		super(modelo, cilindros);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void arrancar() {
		System.out.println("Motor de monovolumen encendido.");
	}
	
	@Override
	public void acelerar() {
		System.out.println("Acelerando monovolumen...");
	}
	@Override
	public void frenar() {
		System.out.println("Frenando monovolumen...");
	}
	
}

class Coupe extends Coche{

	public Coupe(String modelo, int cilindros) {
		super(modelo, cilindros);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void arrancar() {
		System.out.println("Motor de coupe encendido.");
	}
	
	@Override
	public void acelerar() {
		System.out.println("Acelerando coupe...");
	}
	@Override
	public void frenar() {
		System.out.println("Frenando coupe...");
	}
}

class Deportivo extends Coche{

	public Deportivo(String modelo, int cilindros) {
		super(modelo, cilindros);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void arrancar() {
		System.out.println("Motor de deportivo encendido.");
	}
	
	@Override
	public void acelerar() {
		System.out.println("Acelerando deportivo...");
	}
	@Override
	public void frenar() {
		System.out.println("Frenando deportivo...");
	}
}


