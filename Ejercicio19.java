
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número N
        System.out.print("Ingrese el número: ");
        int N = scanner.nextInt();

        // Verificar que el número ingresado sea positivo
        if (N <= 0) {
            System.out.println("Por favor, ingrese un número mayor que 0.");
        } else {
            // Mostrar los primeros N términos de la sucesión de Fibonacci
            long a = 0, b = 1;  // Los dos primeros números de la sucesión
            System.out.print("Los primeros " + N + " números de la sucesión son: ");
            
            // Si N es 1, solo mostramos el primer número (0)
            if (N >= 1) System.out.print(a + " ");
            // Si N es 2 o más, mostramos los dos primeros números
            if (N >= 2) System.out.print(b + " ");
            
            // Mostrar los números restantes
            for (int i = 3; i <= N; i++) {
                long siguiente = a + b;  // El siguiente número es la suma de los dos anteriores
                System.out.print(siguiente + " ");
                a = b;  // Actualizamos a para que sea el segundo número anterior
                b = siguiente;  // Actualizamos b para que sea el número actual
            }
            System.out.println();  // Salto de línea al final
        }

        scanner.close();
    }
}