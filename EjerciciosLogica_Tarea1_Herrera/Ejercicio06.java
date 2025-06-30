package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner votacion = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = votacion.nextInt();
        votacion.nextLine(); // Limpiar buffer

        System.out.println("¿Presenta cédula? (si/no): ");
        String respuesta = votacion.nextLine().trim().toLowerCase();

        boolean tieneCedula = respuesta.equals("si");

        if (edad >= 16 && tieneCedula) {
            System.out.println("Puede votar.");
        } else if (edad < 16) {
            System.out.println("No puede votar porque no tiene la edad mínima.");
        } else if (!tieneCedula) {
            System.out.println("No puede votar porque no presenta cédula.");
        } else {
            System.out.println("Entrada inválida.");
        }

        votacion.close();
    }
}
