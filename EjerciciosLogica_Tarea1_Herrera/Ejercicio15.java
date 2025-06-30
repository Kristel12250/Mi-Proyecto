package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int totalVisitas = 0;
        int dias = 30;

        for (int i = 1; i <= dias; i++) {
            System.out.print("Ingrese visitas del día " + i + ": ");
            int visitas = entrada.nextInt();
            totalVisitas = totalVisitas + visitas; // suma total
        }

        double promedio = totalVisitas / (double)dias;

        System.out.println("\nTotal de visitas del mes: " + totalVisitas);
        System.out.println("Promedio diario de visitas: " + promedio);

        entrada.close();
    }
}
