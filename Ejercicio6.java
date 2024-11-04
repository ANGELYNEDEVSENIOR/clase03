//Escriba un programa que permita ingresar un número y determine si es divisible por dos y siete.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
 Scanner Scanner = new Scanner(System.in);
 System.out.println("Bienvenido");
 System.out.println("Por favor escribe un numero: ");
 int numero = Scanner.nextInt();  
// si el numero % divido entre dos da cero y el numero al % dividirse
 // en 7 es igual a cero, el numero es divisible por dos y siete.
 if (numero % 2 == 0 && numero % 7 == 0) {
 System.out.println(numero + " es divisible por 2 y 7.");
// de lo contrario el numero no es divisible entre dos y siete
 } else {
 System.out.println(numero + " no es divisible por 2 y 7.");
}

Scanner.close(); 
}
}
