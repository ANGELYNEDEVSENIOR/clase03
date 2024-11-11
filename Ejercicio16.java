//Escriba un programa que permita ingresar un número mientras estos sean negativos. Detener cuando el número
// ingresado sea positivo y de cómo resultado la cantidad de números negativos ingresados.
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counterNegative = 0;
        int numero;

        // Bucle que se ejecuta mientras el número ingresado sea negativo
        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                counterNegative++;  // Incrementa el contador si el número es negativo
            }
        } while (numero < 0);  // Detiene el ciclo cuando se ingresa un número positivo

        // Mostrar la cantidad de números negativos ingresados
        System.out.println("Cantidad de números negativos ingresados: " + counterNegative);
        
        scanner.close();
    }
}