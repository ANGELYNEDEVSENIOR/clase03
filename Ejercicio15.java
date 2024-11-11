
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("BIENVENIDOS A ESTA APP DONDE SABREMOS SI TU NUMERO");
        System.out.println("ES NEGATIVO, POSITIVO O CERO");
        int numero;

        // Bucle que continuará hasta que se ingrese el número 0
        while (true) {
            // Solicitar al usuario que ingrese un número
            System.out.print("Ingresa un número: ");
            numero = scanner.nextInt();

            // Si el número es 0, terminamos el programa
            if (numero == 0) {
                break;
            }

            // Verificar si el número es positivo o negativo
            if (numero > 0) {
                System.out.println("tu número es positivo.");
            } else {
                System.out.println("tu número es negativo.");
            }
        }

        // Mensaje cuando el ciclo termina (cuando el usuario ingresa 0)
        System.out.println("Se ha ingresado el número cero. El programa ha terminado.");

        // Cerrar el scanner
        scanner.close();
    }
}