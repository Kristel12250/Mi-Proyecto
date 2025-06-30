package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        double[] notas = new double[4];
        double suma = 0;
        boolean tieneMenorA4 = false;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese nota " + (i + 1) + ": ");
            notas[i] = datos.nextDouble();

            suma += notas[i];

            if (notas[i] < 4) {
                tieneMenorA4 = true;
            }
        }

        double promedio = suma / notas.length;

        System.out.printf("Promedio: %.2f\n", promedio);

        if (promedio >= 7 && !tieneMenorA4) {
            System.out.println("Resultado: APROBADO");
        } else {
            System.out.println("Resultado: REPROBADO");
        }

        datos.close();
    }
}

