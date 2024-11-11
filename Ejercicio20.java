
public class Ejercicio20 {
    public static void main(String[] args) {
        // Número de filas y columnas del tablero
        int tamaño = 8;

        // Recorremos las filas
        for (int i = 0; i < tamaño; i++) {
            // Recorremos las columnas de cada fila
            for (int j = 0; j < tamaño; j++) {
                // Si la suma de la fila y la columna es par, poner "B" (blanco)
                if ((i + j) % 2 == 0) {
                    System.out.print("B ");
                } else {
                    // Si no es par, poner "N" (negro)
                    System.out.print("N ");
                }
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}