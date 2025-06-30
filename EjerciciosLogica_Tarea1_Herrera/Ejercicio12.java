package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        int contadorPares = 0;

        System.out.println("Números pares del 1 al 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                contadorPares++;
            }
        }

        System.out.println("Cantidad total de pares: " + contadorPares);

        numeros.close();
    }
}
