package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner registro = new Scanner(System.in);

            int calificacion = 14;

            System.out.println("Ingrese el porcentaje de asistencia: ");
            double asistencia = registro.nextDouble();

            if (asistencia > 80) {
                calificacion += 2;
            }

            if (calificacion >= 16) {
                System.out.println("APROBADO con " + calificacion);
            } else {
                System.out.println("REPROBADO con " + calificacion);
            }

            registro.close();
        }
    }
