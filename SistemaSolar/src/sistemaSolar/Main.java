package sistemaSolar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    
	private static Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
    private static Set<CuerpoCeleste> planetas = new HashSet<>();
    
    public static void main(String[] args) {

        CuerpoCeleste mercurio = new Planeta("mercurio", 88);
        sistemaSolar.put(mercurio.getNombre(), mercurio);
        planetas.add(mercurio);
        
        CuerpoCeleste venus = new Planeta("venus", 225);
        sistemaSolar.put(venus.getNombre(), venus);
        planetas.add(venus);
        
        CuerpoCeleste tierra = new Planeta("tierra", 365);
        sistemaSolar.put(tierra.getNombre(), tierra);
        planetas.add(tierra);
        
        CuerpoCeleste marte = new Planeta("marte", 687);
        sistemaSolar.put(marte.getNombre(), marte);
        planetas.add(marte);
        
        CuerpoCeleste jupiter = new Planeta("jupiter", 4332);
        sistemaSolar.put(jupiter.getNombre(), jupiter);
        planetas.add(jupiter);
        
        CuerpoCeleste saturno = new Planeta("saturno", 10759);
        sistemaSolar.put(saturno.getNombre(), saturno);
        planetas.add(saturno);
        
        CuerpoCeleste urano = new Planeta("urano", 30660);
        sistemaSolar.put(urano.getNombre(), urano);
        planetas.add(urano);
        
        CuerpoCeleste neptuno = new Planeta("neptuno", 165);
        sistemaSolar.put(neptuno.getNombre(), neptuno);
        planetas.add(neptuno);
        
        CuerpoCeleste pluton = new Planeta("pluton", 248);
        sistemaSolar.put(pluton.getNombre(), pluton);
        planetas.add(pluton);
        
        CuerpoCeleste luna = new Luna("luna", 27);
        sistemaSolar.put(luna.getNombre(), luna);
        tierra.addSatelite(luna);
        
        CuerpoCeleste deimos = new Luna("deimos", 1.3);
        sistemaSolar.put(deimos.getNombre(), deimos);
        marte.addSatelite(deimos);
        
        CuerpoCeleste phobos = new Luna("phobos", 0.3);
        sistemaSolar.put(phobos.getNombre(), phobos);
        marte.addSatelite(phobos);
        
        CuerpoCeleste io = new Luna("io", 1.8);
        sistemaSolar.put(io.getNombre(), io);
        jupiter.addSatelite(io);
        
        CuerpoCeleste europa = new Luna("europa", 3.5);
        sistemaSolar.put(europa.getNombre(), europa);
        jupiter.addSatelite(europa);
        
        CuerpoCeleste ganymede = new Luna("ganymede", 7.1);
        sistemaSolar.put(ganymede.getNombre(), ganymede);
        jupiter.addSatelite(ganymede);
        
        CuerpoCeleste callisto = new Luna("callisto", 16.7);
        sistemaSolar.put(callisto.getNombre(), callisto);
        jupiter.addSatelite(callisto);
        
        // Se imprimen los planetas
        System.out.println("Nombre de los planetas: ");
        for(CuerpoCeleste planetita : planetas) {
        	System.out.println(planetita.getNombre());
        }
        
        // Imprimir las lunas de marte
        System.out.println("\nLunas de Marte: ");
        CuerpoCeleste planetaMarte = sistemaSolar.get(marte.getNombre());
        if(planetaMarte != null) {
        	Set<CuerpoCeleste> lunasMarte = planetaMarte.getSatelites();
        	for (CuerpoCeleste lunaMarte : lunasMarte) {
				System.out.println(lunaMarte.getNombre());
			}
        }
        
        // La union de todos los lunas y se imprime
        Set<CuerpoCeleste> lunasUnion = new HashSet<>();
        for (CuerpoCeleste cc : sistemaSolar.values()) {
			lunasUnion.addAll(cc.getSatelites());
		}
        System.out.println("\nNombre de las lunas: ");
        for(CuerpoCeleste lunaCC : lunasUnion) {
        	System.out.println(lunaCC.getNombre());
        }
        
        //Crea un planeta Plutón-884. Imprime de nuevo los planetas utilizando el método
        //sobreescrito toString. ¿Se ha agregado este planeta al conjunto? ¿Por qué?
        CuerpoCeleste nuevoPluton = new Planeta("Plutón", 884);
        System.out.println("\nNuevo Plutón agregado: " + planetas.add(nuevoPluton));
        
        //¿Y si lo creamos como un planeta enano en vez de un planeta?
        CuerpoCeleste plutonEnano = new Planeta_Enano("Plutón", 884);
        System.out.println("\nNuevo Plutón Enano agregado: " + planetas.add(plutonEnano));
        
        // diferencias e intersecciones
        Set<CuerpoCeleste> diferencia = new HashSet<>(planetas); 
        diferencia.removeAll(lunasUnion);
        System.out.println("\nDiferencias entre lunas y planetas: ");
        for (CuerpoCeleste cuerpoCeleste : diferencia) {
			System.out.println(cuerpoCeleste.getNombre());
		}
        
        Set<CuerpoCeleste> interseccion = new HashSet<>(planetas); 
        interseccion.retainAll(lunasUnion);
        System.out.println("\nInterseccion entre lunas y planetas: ");
        for (CuerpoCeleste cuerpoCeleste : interseccion) {
			System.out.println(cuerpoCeleste.getNombre());
		}
    }
}