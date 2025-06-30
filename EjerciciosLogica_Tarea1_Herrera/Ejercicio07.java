package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner tienda = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto 1: ");
        double precio1 = tienda.nextDouble();

        System.out.println("Ingrese el precio del producto 2: ");
        double precio2 = tienda.nextDouble();

        System.out.println("Ingrese el precio del producto 3: ");
        double precio3 = tienda.nextDouble();

        double total = precio1 + precio2 + precio3;

        // Aplicar descuento si total > 150
        if (total > 150) {
            total = total - (total * 0.15);
        }

        tienda.nextLine();

        System.out.println("¿Paga con tarjeta? (si/no): ");
        String pagoTarjeta = tienda.nextLine().trim().toLowerCase();

        if (pagoTarjeta.equals("si")) {
            total = total + (total * 0.02);
        }

        System.out.printf("Monto final a pagar: $%.2f%n", total);

        tienda.close();
    }
}
