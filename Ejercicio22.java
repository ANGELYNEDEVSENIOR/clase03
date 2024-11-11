import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        char jugador1;
        char jugador2;
        boolean continueGame = true;
        var scanner = new Scanner(System.in);

        System.out.println("VAMOR A JUGAR PIEDRA, PAPEL O TIJERA!");
        System.out.println("Para jugar, estas son las opciones a ingresar");
        System.out.println("Ingresa P para piedra");
        System.out.println("Ingresa L para papel");
        System.out.println("Ingresa T para tijera");

        do { 
            System.out.println("AHORA JUGUEMOS!!!");
            System.out.println("");
            System.out.print("Turno del jugador 1: ");
            jugador1 = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Turno del jugador 2: ");
            jugador2 = scanner.next().charAt(0);
            scanner.nextLine();

            if(jugador1 == jugador2 ){
                System.out.println("Es un empate");
            } else if(jugador1 == 'P' && jugador2 == 'T' || 
            jugador1 == 'L' && jugador2 == 'P' ||
            jugador1 == 'T' && jugador2 == 'L'){
                System.out.println("El jugador 1 gana la ronda");
            }   else {
                System.out.println("El jugador 2 gana la ronda");
            }

            System.out.println("¿DESEAS SEGUIR JUGANDO?");
            System.out.println("1. QUIERO SEGUIR JUGANDO!!");
            System.out.println("2. QUIERO SALIR!!");
            int option = scanner.nextInt();
            scanner.nextLine();

            if( option == 1){
                continueGame = true;
            } else{
                System.out.println("HASTA LUEGOO!!!");
                continueGame = false;
                scanner.close();
            }
        } while (continueGame);
    }
}