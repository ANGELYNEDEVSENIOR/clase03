//Escriba un programa que permita ingresar tres números 
//(representan la longitud de una línea) y compruebe si con
 //estos números se puede formar un triángulo.

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double numero1 = Scanner.nextDouble();
//pusimos double para permitir el paso de numeros decimales
        System.out.print("Ingrese el segundo numero: ");
        double numero2 = Scanner.nextDouble();
        System.out.print("Ingrese el tercer numero: ");
        double numero3 = Scanner.nextDouble();
        // Verificamos si se cumple la desigualdad triangular
        if (numero1 + numero2 > numero3 && numero1 + numero3 > numero2
         && numero2 + numero3 > numero1) {
            System.out.println("Se puede formar un triángulo.");
        } else {
            System.out.println("No se puede formar un triángulo.");
        }

        Scanner.close();
    }   
}
