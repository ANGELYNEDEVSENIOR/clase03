import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar los tres números al usuario
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        // Llamar a la función para ordenar y concatenar los números
        String resultado = ordenarYConcatenar(num1, num2, num3);

        // Imprimir el resultado
        System.out.println("Resultado en orden ascendente: " + resultado);

        // Cerrar el scanner
        scanner.close();
    }

    // Función para ordenar los números y concatenarlos como texto
    public static String ordenarYConcatenar(int num1, int num2, int num3) {
        // Crear un arreglo para almacenar los números
        int[] numeros = {num1, num2, num3};

        // Ordenar el arreglo
        java.util.Arrays.sort(numeros);

        // Concatenar los números como texto
        String resultado = Integer.toString(numeros[0]) + Integer.toString(numeros[1]) + Integer.toString(numeros[2]);

        return resultado;
    }
}