//Escriba un programa que permita ingresar una letra 
//e identifique si la letra es mayúscula o minúscula.

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Por favor escribe una letra:");
        //aqui pedimos una letra y la almacenamos en char
        char letra = Scanner.next().charAt(0);
        // Character.isUpperCase(letra): Este método verifica si la letra es mayúscula.
        if (Character.isUpperCase(letra)) {
            System.out.println("La letra" + letra + " es mayúscula.");
     //Character.isLowerCase(letra): Este método verifica si la letra es minúscula.
        } else if (Character.isLowerCase(letra)) {
            System.out.println("La letra " + letra + " es minúscula.");
        } else {
            System.out.println("Lo que ingresaste ingresado no es una letra.");
        }

        Scanner.close();
} 
    

}
