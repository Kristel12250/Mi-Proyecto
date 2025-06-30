package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.println("Ingrese puntaje del participante: ");
        int puntaje = datos.nextInt();

        if (puntaje >= 80) {
            System.out.println("¡Ganó medalla!");
        } else {
            System.out.println("Quedó como finalista.");
        }

        datos.close();
    }
}
