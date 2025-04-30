
import java.util.Scanner;

public class ContrasenaSegura {

    /**
     * Verifica si una contraseña cumple con los criterios de seguridad.
     * @param contrasena La cadena ingresada por el usuario.
     * @return true si la contraseña es segura, false en caso contrario.
     */
    public static boolean esContrasenaSegura(String contrasena) {
        if (contrasena.length() < 10) {
            return false;
        }

        boolean tieneLetra = false;
        boolean tieneDigito = false;
        boolean tieneSimbolo = false;

        for (char c : contrasena.toCharArray()) {
            if (Character.isLetter(c)) {
                tieneLetra = true;
            } else if (Character.isDigit(c)) {
                tieneDigito = true;
            } else {
                tieneSimbolo = true;
            }
        }

        return tieneLetra && tieneDigito && tieneSimbolo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una contraseña para verificar si es segura:");
        String contrasena = scanner.nextLine();

        if (esContrasenaSegura(contrasena)) {
            System.out.println(" La contraseña es segura.");
        } else {
            System.out.println(" La contraseña NO es segura.");
            System.out.println("Requisitos:");
            System.out.println("- Al menos 10 caracteres");
            System.out.println("- Al menos una letra");
            System.out.println("- Al menos un dígito");
            System.out.println("- Al menos un símbolo que no sea letra ni número");
        }

        scanner.close();
    }
}
