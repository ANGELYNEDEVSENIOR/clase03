import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar el peso de la sandía al usuario
        System.out.print("Ingresa el peso de la sandía en kilogramos: ");
        int peso = scanner.nextInt();

        // Llamar a la función para verificar si es posible dividir
        if (puedeDividirEnPartesPares(peso)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Función para verificar si el peso puede ser dividido en dos partes pares
    public static boolean puedeDividirEnPartesPares(int peso) {
        // El peso debe ser par y mayor que 2
        return peso > 2 && peso % 2 == 0;
    }
}