
    import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);

        // Leer los dos números de los hermanos que llegaron a tiempo
        System.out.print("Ingresa los números de los hermanos que llegaron a tiempo: ");
        int hermano1 = scanner.nextInt();
        int hermano2 = scanner.nextInt();

        // Llamar a la función para determinar el hermano que llegó tarde
        int hermanoTarde = encontrarHermanoTarde(hermano1, hermano2);

        // Imprimir el número del hermano que llegó tarde
        System.out.println("El hermano que llegó tarde es: " + hermanoTarde);

        // Cerrar el scanner
        scanner.close();
    }

    // Función para determinar el hermano que llegó tarde
    public static int encontrarHermanoTarde(int hermano1, int hermano2) {
        // Los hermanos son 1, 2 y 3. El que falta es el que llegó tarde.
        if (hermano1 != 1 && hermano2 != 1) return 1;
        if (hermano1 != 2 && hermano2 != 2) return 2;
        return 3; // Si ninguno de los anteriores es el que falta, entonces es el hermano 3.
    }
}

