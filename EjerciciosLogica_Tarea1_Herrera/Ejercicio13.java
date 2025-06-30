package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner Ingreso = new Scanner(System.in);
        int suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese número " + i + ": ");
            int numero = Ingreso.nextInt();
            suma += numero;
        }

        System.out.println("La suma total de los 5 números es: " + suma);

        Ingreso.close();
    }
}

