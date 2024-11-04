//Escriba un programa que permita ingresar un número real e identifique si el número es negativo, 
//positivo o cero.
//{}

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Por favor escribe un numero: ");
        int numero = Scanner.nextInt();
        if (numero < 0) {
            System.out.println("este numero es NEGATIVO!");
        } else if (numero > 0) {
            System.out.println("Este numero es POSITIVO!");
        } else {
            System.out.println("el numero es CERO!");
        }
        Scanner.close();

    }

}