package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contadorNegativos = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = entrada.nextInt();

            if (numero < 0) {
                contadorNegativos = contadorNegativos + 1;
            }
        }

        System.out.println("Cantidad de números negativos ingresados: " + contadorNegativos);

        entrada.close();
    }
}
