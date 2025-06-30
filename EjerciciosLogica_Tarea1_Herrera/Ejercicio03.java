package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner producto = new Scanner(System.in);

        System.out.println("Precio producto 1: ");
        double p1 = producto.nextDouble();

        System.out.println("Precio producto 2: ");
        double p2 = producto.nextDouble();

        System.out.println("Precio producto 3: ");
        double p3 = producto.nextDouble();

        double total = p1 + p2 + p3;

        if (total > 100) {
            total = total * 0.9;
        }

        System.out.println("Total a pagar: $" + String.format("%.2f", total));

        producto.close();
    }
}
