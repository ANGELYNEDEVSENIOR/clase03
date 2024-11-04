//Escriba un programa que le permita ingresar tres números 
//e imprima en la consola el más grande de ellos.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
       Scanner Scanner = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Por favor escribe tres numero");
        System.out.println("escribe el numero Uno: ");
        int numeroUno = Scanner.nextInt();
        System.out.println("escribe el numero Dos: ");
        int numeroDos = Scanner.nextInt();
        System.out.println("escribe el numero Tres: ");
        int numeroTres = Scanner.nextInt();
        int mayor;
        //tenemos que encontrar cual es el mayor de los tres numeros
        if (numeroUno >= numeroDos && numeroUno >= numeroTres) {
        System.out.println("El numero Uno es el numero mas grande");   
        mayor = numeroUno; 
        }else if (numeroDos >= numeroUno && numeroDos >= numeroTres) {
        System.out.println("El numero dos es el numero mas grande"); 
        mayor = numeroDos;   
        }else{
        System.out.println("El numero tres es el numero mas grande");   
        mayor = numeroTres; 
        }
System.out.println("el numero mas grande es: "+mayor);
Scanner.close();
    }
}
