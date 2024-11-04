//Escriba un programa que permita ingresar un número e identificar si es par o impar.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Por favor escribe un numero:");
        int numero = Scanner.nextInt();
// tenemos que lograr identificar si es par o es impar
//Se utiliza el operador módulo % para obtener el resto de la división del número entre 2.
//Si el resto es 0, significa que el número es divisible entre 2 y por lo tanto es par.
//Si el resto es 1, significa que el número no es divisible entre 2 y por lo tanto es impar.
if (numero % 2 == 0) {
    System.out.println(numero + " es par.");
} else {
    System.out.println(numero + " es impar.");
}
Scanner.close();

}


    }

