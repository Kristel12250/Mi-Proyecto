package EjerciciosLogica_Tarea1_Herrera;
import java.util.Scanner;
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner sueldo = new Scanner(System.in);

        int sueldoBase = 400;

        System.out.println("Ingrese cuántas horas extra trabajó: ");
        int horasExtra = sueldo.nextInt();

        int sueldoTotal = sueldoBase + (horasExtra * 10);

        System.out.println("El sueldo total es: $" + sueldoTotal);

        sueldo.close();
    }
}
