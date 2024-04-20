package sistemaSolar;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CuerpoCeleste {
    public enum TipoCuerpoCeleste {
        ESTRELLA, PLANETA, PLANETA_ENANO, LUNA, COMETA, ASTEROIDE
    }

    private String nombre;
    private double periodoOrbital;
    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipoCuerpo;

    public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.satelites = new HashSet<>();
        this.tipoCuerpo = tipoCuerpo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public Set<CuerpoCeleste> getSatelites() {
        return new HashSet<>(this.satelites);
    }

    public TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }

    public boolean addSatelite(CuerpoCeleste satelite) {
        if (satelite.getTipoCuerpo() == TipoCuerpoCeleste.LUNA) {
            return satelites.add(satelite);
        } return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre,tipoCuerpo) + 17;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if (!(obj instanceof CuerpoCeleste)) {
            return false;
        }
        CuerpoCeleste cc2 = (CuerpoCeleste) obj;
        return Objects.equals(this.nombre,cc2.nombre) && this.tipoCuerpo == cc2.tipoCuerpo;
    }

    @Override
    public String toString() {
        return nombre + ": " + tipoCuerpo + ", " + periodoOrbital;
    }


}
