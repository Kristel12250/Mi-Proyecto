package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner Calificaciones = new Scanner(System.in);

        double suma = 0;
        int contador = 1;

        while (contador <= 6) {
            System.out.println("Ingrese la nota del estudiante " + contador + ": ");
            double nota = Calificaciones.nextDouble();
            //System.out.println("Nota ingresada: " + nota);
            suma += nota;
            contador++;
        }

        double promedio = suma / 6;
        // Redondear a 2 decimales
        promedio = Math.round(promedio * 100.0) / 100.0;

        System.out.println("Promedio del grupo: " + promedio);

        if (promedio >= 7) {
            System.out.println("El grupo en general APROBÓ.");
        } else {
            System.out.println("El grupo en general REPROBÓ.");
        }

        Calificaciones.close();
    }
}
