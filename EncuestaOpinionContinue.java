import java.util.Scanner;

public class EncuestaOpinionContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] frecuencia = new int[6]; // índices 1..5
        int totalValidas = 0;
        int suma = 0;

        System.out.println("Ingrese respuestas del 1 al 5 (se ignoran fuera de rango; ingrese 0 para terminar):");

        while (true) {
            System.out.print("Respuesta: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida, ignorada.");
                scanner.next();
                continue;
            }

            int respuesta = scanner.nextInt();

            if (respuesta == 0) {
                break;
            }

            if (respuesta < 1 || respuesta > 5) {
                System.out.println("Respuesta fuera del rango (1 - 5), ignorada.");
                continue;
            }

            frecuencia[respuesta]++;
            totalValidas++;
            suma += respuesta;
        }

        System.out.println("\n--- Resultados de la Encuesta ---");
        System.out.println("Frecuencia de respuestas:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("  Valor " + i + ": " + frecuencia[i]);
        }

        if (totalValidas > 0) {
            System.out.printf("Promedio: %.2f%n", ((double) suma / totalValidas));
        } else {
            System.out.println("Promedio: 0.00");
        }

        scanner.close();
    }
}