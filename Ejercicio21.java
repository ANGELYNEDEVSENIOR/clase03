
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar el menú de opciones
        System.out.println("Seleccione el tipo de conversión:");
        System.out.println("1. Millas a Kilómetros");
        System.out.println("2. Kilómetros a Millas");
        System.out.print("Ingrese su opción (1 o 2): ");
        int opcion = scanner.nextInt();

        // Variables para las conversiones
        double millas, kilometros;

        switch (opcion) {
            case 1:  // Millas a Kilómetros
                System.out.print("Ingrese la cantidad de millas: ");
                millas = scanner.nextDouble();
                kilometros = millas * 1.60934;  // Conversión de millas a kilómetros
                System.out.printf("%.2f millas son %.2f kilómetros.\n", millas, kilometros);
                break;

            case 2:  // Kilómetros a Millas
                System.out.print("Ingrese la cantidad de kilómetros: ");
                kilometros = scanner.nextDouble();
                millas = kilometros * 0.621371;  // Conversión de kilómetros a millas
                System.out.printf("%.2f kilómetros son %.2f millas.\n", kilometros, millas);
                break;

            default:
                System.out.println("Opción no válida. Por favor, ingrese 1 o 2.");
                break;
        }

        scanner.close();
    }
}