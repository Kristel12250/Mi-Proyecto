package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner credenciales = new Scanner(System.in);

        // Datos correctos predefinidos (puedes cambiarlos)
        String usuarioCorrecto = "kristel";
        String claveCorrecta = "Doky";

        System.out.println("Ingrese su nombre de usuario: ");
        String usuarioIngresado = credenciales.nextLine();

        System.out.println("Ingrese su contraseña: ");
        String claveIngresada = credenciales.nextLine();

        if (usuarioIngresado.equals(usuarioCorrecto) && claveIngresada.equals(claveCorrecta)) {
            System.out.println("Bienvenido " + usuarioIngresado);
        } else {
            System.out.println("La información ingresada no es correcta.");
        }

        credenciales.close();
    }
}
