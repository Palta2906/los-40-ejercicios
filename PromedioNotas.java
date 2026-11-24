import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNotas = 100;
        int validas = 0;
        double suma = 0;
        double maxNota = Double.NEGATIVE_INFINITY;
        double minNota = Double.POSITIVE_INFINITY;

        System.out.println("Ingrese " + totalNotas + " notas (se ignorarán las que no estén entre 0 y 20):");

        for (int i = 1; i <= totalNotas; i++) {
            System.out.print("Nota " + i + ": ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida, se ignora.");
                scanner.next();
                continue;
            }

            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 20) {
                System.out.println("Nota fuera de rango (0 - 20), ignorada.");
                continue;
            }

            validas++;
            suma += nota;

            if (nota > maxNota) {
                maxNota = nota;
            }
            if (nota < minNota) {
                minNota = nota;
            }
        }

        System.out.println("\n--- Resultados de Notas ---");
        if (validas > 0) {
            System.out.printf("Promedio: %.2f%n", (suma / validas));
            System.out.printf("Nota máxima: %.2f%n", maxNota);
            System.out.printf("Nota mínima: %.2f%n", minNota);
        } else {
            System.out.println("No se ingresaron notas válidas.");
        }

        scanner.close();
    }
}