
// El scanner se usa para leer texto desde la consola
import java.util.Scanner;

// Esto de aqui le dice al programa quien es
public class Main {
	
	// Es la función principal
	/**
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
    	/* Se crean variables:
    	 * Variable tipo: boolean (true/false) --> nombre: passwordAccepted
    	 * Variable tipo: String (texto) --> nombre: pass
    	 * Variable tipo: Scanner (escanea texto) --> nombre: key
    	 */
        boolean passwordAccepted = false;
        String pass;
        System.out.println("Enter a password to test its strength.");
        Scanner key = new Scanner(System.in);

        // Bucle while(condicion) --> true
        // Bucle while(condicion) xx> false

        // Bucle while(!condicion) --> false
        // Bucle while(!condicion) xx> true
        while(!passwordAccepted){
        	// Recoger del scanner los datos
            pass = key.nextLine();
            // Confirmamos que la contraseña sea buena
            passwordAccepted = passwordIsGood(pass);
        }
    }

    /**
     * Esta funcion se encarga de comprobar:
     * - Longitud de la pass
     * - Si contiene digitos
     * - Si contiene mayus/minus
     * - Si tiene caracter especial
     * @param pass
     * @return
     */
    public static boolean passwordIsGood(String pass){
    	// El if(condicion) se usa para comprobar datos
    	// if(true) --> OK
    	// if(false) --> K.O
        if(length(pass) && containsDigits(pass) &&
                containsUpLowCase(pass) && hasSpecial(pass)){
            System.out.println("Your password is strong!");
            return true;
        }
        // Si el if() ha fallado se imprime por pantalla este texto
        System.out.println("Weak password.  Try another.");
        return false;
    }

    /**
     * Comprueba si la pass tiene más de 6 caracteres
     * @param pass
     * @return
     */
    public static boolean length(String pass){
        if(pass.length() > 6){
            return true;
        }
        System.out.println("You need at least 6 characters.");
        return false;
    }

    /**
     * Comprueba si tiene digitos
     * @param pass
     * @return
     */
    public static boolean containsDigits(String pass){
        // Este if comprueba si la pass contiene algun numero
    	if(pass.matches(".*\\d.*")){
            return true;
        }
        System.out.println("You need a digit.");
        return false;
    }

    /**
     * Comprueba si tiene mayusculas o minusculas
     * @param pass
     * @return
     */
    public static boolean containsUpLowCase(String pass){
    	// AndreS --> ANDRES : OK // ANDRES --> ANDRES : KO
    	// AndreS --> andres : OK // andres --> andres : KO
        if(!pass.equals(pass.toLowerCase()) && 
        		!pass.equals(pass.toUpperCase())){
            return true;
        }
        System.out.println("You need a lower and upper case letter.");
        return false;
    }

    /**
     * Comprueba si tiene algun caracter especial
     * @param pass
     * @return
     */
    public static boolean hasSpecial(String pass){
        if(!pass.matches("[A-Za-z0-9 ]*")){
            return true;
        }
        System.out.println("You need a special character.");
        return false;
    }

}