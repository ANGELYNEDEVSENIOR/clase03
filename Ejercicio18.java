import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Crear un generador de números aleatorios
        Random rand = new Random();

        // Variables para almacenar las sumas y contar los ceros
        int sumaPositive = 0;
        int sumaNegative = 0;
        int counterPositive = 0;
        int counterNegative = 0;
        int contadorCeros = 0;

        // Generar 120 números aleatorios entre -100 y 100
        for (int i = 0; i < 120; i++) {
            // Generar un número aleatorio entre -100 y 100
            int numero = rand.nextInt(201) - 100;  // (201-100) genera un rango de -100 a 100

            // Clasificar el número y realizar los cálculos correspondientes
            if (numero > 0) {
                sumaPositive += numero;
                counterPositive++;
            } else if (numero < 0) {
                sumaNegative += numero;
                counterNegative++;
            } else {
                contadorCeros++;
            }
        }

        // Calcular las medias de positivos y negativos
        double mediaPositivos = (counterPositive > 0) ? (double) sumaPositive / counterPositive : 0;
        double mediaNegativos = (counterNegative > 0) ? (double) sumaNegative / counterNegative : 0;

        // Imprimir los resultados
        System.out.println("Suma de los valores positivos: " + sumaPositive);
        System.out.println("Suma de los valores negativos: " + sumaNegative);
        System.out.println("Media de los números positivos: " + mediaPositivos);
        System.out.println("Media de los números negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + contadorCeros);
    }
}