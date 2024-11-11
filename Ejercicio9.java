import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("Bienvenido a nuestra tienda de camisas");
        System.out.println("¿Cuantas camisas quieres comprar?");
        int counter = scanner.nextInt();

        if(counter > 1 && counter < 50){
            System.out.println("El precio por unidad es de $50.000 pesos");
        } 
        else if(counter > 50 && counter < 100 ){
            System.out.println("El precio por unidad es de $45.000 pesos");
        }
        else if(counter > 100 && counter < 150 ){
            System.out.println("El precio por unidad es de $40.000 pesos");
        }
        else if(counter > 150 && counter < 200 ){
            System.out.println("El precio por unidad es de $35.000 pesos");
        }
        else if(counter > 200 ){
            System.out.println("El precio por unidad es de $25.000 pesos");
        } else {
            System.out.println("Esta cantidad es INVALIDA");
        }

        scanner.close();

    }
}