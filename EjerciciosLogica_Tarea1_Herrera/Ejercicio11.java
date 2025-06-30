package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner tabla = new Scanner(System.in);

        System.out.println("Ingrese un número para ver su tabla de multiplicar: ");
        int numero = tabla.nextInt();

        System.out.println("\nTabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        tabla.close();
    }
}
