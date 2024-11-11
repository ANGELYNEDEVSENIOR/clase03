
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);

        int numero;

        // Bucle que continúa hasta que se ingrese un número negativo
        while (true) {
            // Solicitar al usuario que ingrese un número
            System.out.println("Puedes escribir un numero negtivo para terminar");
            System.out.print("Ingresa un número: ");
            numero = scanner.nextInt();

            // Verificar si el número es negativo para terminar el ciclo
            if (numero < 0) {
                break;
            }

            // Calcular y mostrar el cubo del número
            int cubo = numero * numero * numero;
            System.out.println("El cubo de " + numero + " es: " + cubo);
        }

        // Mensaje de despedida cuando el ciclo termina
        System.out.println("Se ha ingresado un número negativo. El programa ha terminado.");

        // Cerrar el scanner
        scanner.close();
    }
}