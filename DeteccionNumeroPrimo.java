import java.util.Scanner;

public class DeteccionNumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero mayor que 1: ");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println("El numero " + numero + " NO es primo.");
            sc.close();
            return;
        }

        boolean esPrimo = true;
        int primerDivisor = -1;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                primerDivisor = i;
                break;
            }
        }

        System.out.println("\n--- Resultado ---");
        if (esPrimo) {
            System.out.println("El numero " + numero + " ES primo.");
        } else {
            System.out.println("El numero " + numero + " NO es primo.");
            System.out.println("Primer divisor encontrado: " + primerDivisor);
        }

        sc.close();
    }
}