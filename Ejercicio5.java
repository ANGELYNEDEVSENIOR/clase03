//Escriba un programa que permita ingresar una letra e identifique si es vocal o consonante.

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
 Scanner Scanner = new Scanner(System.in);
 System.out.println("Bienvenido");
        System.out.println("Por favor escribe una letra:");
        //aqui pedimos una letra y la almacenamos en char
        char letra = Scanner.next().charAt(0);
        // Utilizamos un switch para comparar la letra con las vocales
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("La letra " + letra + " es una vocal.");
                break;
            default:
                System.out.println("La letra " + letra + " es una consonante.");

        }

        Scanner.close();
}    
}
