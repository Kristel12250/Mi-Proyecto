package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] edades = new int[10];
        int mayoresEdad = 0;
        int edadMax = Integer.MIN_VALUE;
        int edadMin = Integer.MAX_VALUE;

        for (int i = 0; i < edades.length; i++) {
            System.out.print("Ingrese edad de la persona " + (i + 1) + ": ");
            edades[i] = entrada.nextInt();

            if (edades[i] >= 18) {
                mayoresEdad++;
            }

            if (edades[i] > edadMax) {
                edadMax = edades[i];
            }

            if (edades[i] < edadMin) {
                edadMin = edades[i];
            }
        }

        System.out.println("\nListado de edades:");
        for (int edad : edades) {
            System.out.println(edad);
        }

        System.out.println("\nCantidad de mayores de edad: " + mayoresEdad);
        System.out.println("Edad máxima: " + edadMax);
        System.out.println("Edad mínima: " + edadMin);

        entrada.close();
    }
}
