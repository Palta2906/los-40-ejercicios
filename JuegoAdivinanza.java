import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Entre 1 y 100
        int intentos = 0;

        System.out.println("Adivina el numero secreto entre 1 y 100!");

        while (true) {
            System.out.print("Ingresa tu numero: ");
            int intentoUsuario = sc.nextInt();
            intentos++;

            if (intentoUsuario == numeroSecreto) {
                break;
            } else if (intentoUsuario < numeroSecreto) {
                System.out.println("El numero secreto es MAYOR.");
            } else {
                System.out.println("El numero secreto es MENOR.");
            }
        }

        System.out.println("\nNumero de intentos usados: " + intentos);
        System.out.println("Felicitaciones! Adivinaste el numero " + numeroSecreto + ".");

        sc.close();
    }
}