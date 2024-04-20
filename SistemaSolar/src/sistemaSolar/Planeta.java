package sistemaSolar;
public class Planeta extends CuerpoCeleste {

    public Planeta(String nombre, double periodoOrbital) {
        super(nombre, periodoOrbital, TipoCuerpoCeleste.PLANETA);
    }

    @Override
    public boolean addSatelite(CuerpoCeleste satelite) {
        return super.addSatelite(satelite);
    }


}
