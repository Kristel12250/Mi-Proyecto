package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            suma += i;
        }

        System.out.println("Suma total: " + suma);

        entrada.close();
    }
}
