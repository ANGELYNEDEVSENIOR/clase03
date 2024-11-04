import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        if (edad >= 0 && edad <= 5) {
        System.out.println("Primera infancia");
        } else if (edad >= 6 && edad <= 11) {
        System.out.println("Infancia");
        } else if (edad >= 12 && edad <= 18) {
    System.out.println("Adolescencia");
        } else if (edad >= 19 && edad <= 26) {
        System.out.println("Juventud");
        } else if (edad >= 27 && edad <= 59) {
        System.out.println("Adultez");
        } else {
        System.out.println("Persona mayor");

        }

        scanner.close();
    }
}