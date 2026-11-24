import java.util.Scanner;

public class EjercicioIntegrador2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNotas = 200;
        int notasValidas = 0;
        int notasInvalidas = 0;
        double sumaNotas = 0;
        double notaMaxima = Double.NEGATIVE_INFINITY;
        double notaMinima = Double.POSITIVE_INFINITY;

        System.out.println("Ingrese " + totalNotas + " notas (se ignoran las menores que 0 y mayores que 20):");

        for (int i = 1; i <= totalNotas; i++) {
            System.out.print("Nota " + i + ": ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida, se cuenta como inválida y se ignora.");
                scanner.next();
                notasInvalidas++;
                continue;
            }

            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 20) {
                System.out.println("Nota fuera del rango (0 - 20), ignorada.");
                notasInvalidas++;
                continue;
            }

            notasValidas++;
            sumaNotas += nota;

            if (nota > notaMaxima) {
                notaMaxima = nota;
            }
            if (nota < notaMinima) {
                notaMinima = nota;
            }
        }

        System.out.println("\n--- Resultados del Ejercicio Integrador 2 ---");
        if (notasValidas > 0) {
            System.out.printf("Promedio: %.2f%n", (sumaNotas / notasValidas));
            System.out.printf("Nota máxima: %.2f%n", notaMaxima);
            System.out.printf("Nota mínima: %.2f%n", notaMinima);
        } else {
            System.out.println("Promedio: 0.00");
            System.out.println("Nota máxima: N/A");
            System.out.println("Nota mínima: N/A");
        }
        System.out.println("Cantidad de notas válidas: " + notasValidas);
        System.out.println("Cantidad de notas inválidas: " + notasInvalidas);

        scanner.close();
    }
}