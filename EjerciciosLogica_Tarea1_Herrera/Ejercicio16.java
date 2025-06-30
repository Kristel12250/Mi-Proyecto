package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner sensores = new Scanner(System.in);

        int fueraDeRango = 0;

        for (int i = 1; i <= 50; i++) {
            System.out.print("Ingrese valor del sensor " + i + ": ");
            int valor = sensores.nextInt();

            if (valor > 100 || valor < 0) {
                fueraDeRango = fueraDeRango + 1;
            }
        }

        System.out.println("Cantidad de sensores fuera de rango: " + fueraDeRango);

        sensores.close();
    }
}
