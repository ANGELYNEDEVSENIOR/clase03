import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args) {
        
        System.out.println("¿Cuantos dias tiene el mes?");
        daysOfMonth();
    }
    private static void daysOfMonth(){

        var scanner = new Scanner(System.in);
        System.out.println("BIENVENIDO");
        System.out.println("Por favor, ingresa el numero del mes: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1,3,5,7,8,10,12:
                System.out.println("El mes tiene 31 días");
                break;
            case 4,6,9,11:
                System.out.println("El mes tiene 30 dias");
                break;
            case 2:
                System.out.println("El mes tiene 28 dias");
                break;
            default:
                System.err.println("Opcion invalida");
                System.out.println("La aplicacion ha terminado");
                break;
        }

        scanner.close();
    }



}