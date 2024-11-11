
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del diamante
        System.out.print("Introduce el tamaño del diamante : ");
        int tamaño = scanner.nextInt();

        // Verificar que el tamaño sea impar y mayor que 0
        if (tamaño <= 0 || tamaño % 2 == 0) {
            System.out.println("El tamaño debe ser un número entero positivo e impar.");
        } else {
            // Calculamos la mitad del tamaño para ayudar en la alineación
            int mitad = tamaño / 2;

            // Imprimir la parte superior (incluyendo la línea central)
            for (int i = 0; i <= mitad; i++) {
                // Imprimir espacios antes de los asteriscos
                for (int j = 0; j < mitad - i; j++) {
                    System.out.print(" ");
                }
                // Imprimir los asteriscos
                for (int j = 0; j < (2 * i + 1); j++) {
                    System.out.print("*");
                }
                // Salto de línea después de cada fila
                System.out.println();
            }

            // Imprimir la parte inferior
            for (int i = mitad - 1; i >= 0; i--) {
                // Imprimir espacios antes de los asteriscos
                for (int j = 0; j < mitad - i; j++) {
                    System.out.print(" ");
                }
                // Imprimir los asteriscos
                for (int j = 0; j < (2 * i + 1); j++) {
                    System.out.print("*");
                }
                // Salto de línea después de cada fila
                System.out.println();
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}