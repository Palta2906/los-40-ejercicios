import java.util.Scanner;

public class EjercicioIntegrador3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadValidos = 0;
        long sumaTotal = 0;
        int numeroMayor = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;

        System.out.println("Ingrese números enteros (negativos se ignoran; 999 finaliza):");

        while (true) {
            System.out.print("Número: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida, se ignora.");
                scanner.next();
                continue;
            }

            int numero = scanner.nextInt();

            if (numero == 999) {
                break;
            }

            if (numero < 0) {
                System.out.println("Número negativo, ignorado.");
                continue;
            }

            cantidadValidos++;
            sumaTotal += numero;

            if (numero > numeroMayor) {
                numeroMayor = numero;
            }
            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }

        System.out.println("\n--- Resultados del Ejercicio Integrador 3 ---");
        System.out.println("Cantidad de números válidos: " + cantidadValidos);
        System.out.println("Suma total: " + sumaTotal);

        if (cantidadValidos > 0) {
            System.out.printf("Promedio: %.2f%n", ((double) sumaTotal / cantidadValidos));
            System.out.println("Número mayor: " + numeroMayor);
            System.out.println("Número menor: " + numeroMenor);
        } else {
            System.out.println("Promedio: 0.00");
            System.out.println("Número mayor: N/A");
            System.out.println("Número menor: N/A");
        }

        scanner.close();
    }
}