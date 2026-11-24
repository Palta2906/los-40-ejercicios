import java.util.Scanner;

public class EjercicioIntegrador1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNotas = 200;
        int notaAprobatoria = 11;

        int cantidadValidas = 0;
        double sumaNotas = 0;
        double notaMaxima = Double.NEGATIVE_INFINITY;
        double notaMinima = Double.POSITIVE_INFINITY;
        int aprobados = 0;
        int desaprobados = 0;

        System.out.println("Registro de hasta " + maxNotas + " notas (0 a 20). Si ingresa 20, finaliza:");

        for (int i = 1; i <= maxNotas; i++) {
            System.out.print("Nota " + i + ": ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida, ignorada.");
                scanner.next();
                continue;
            }

            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 20) {
                System.out.println("Nota fuera del rango (0 - 20), ignorada.");
                continue;
            }

            cantidadValidas++;
            sumaNotas += nota;

            if (nota > notaMaxima) {
                notaMaxima = nota;
            }
            if (nota < notaMinima) {
                notaMinima = nota;
            }

            if (nota >= notaAprobatoria) {
                aprobados++;
            } else {
                desaprobados++;
            }

            if (nota == 20.0) {
                System.out.println("Nota 20 registrada. Finalizando proceso...");
                break;
            }
        }

        System.out.println("\n--- Estadísticas Finales ---");
        System.out.println("Cantidad de notas válidas: " + cantidadValidas);
        if (cantidadValidas > 0) {
            System.out.printf("Promedio: %.2f%n", (sumaNotas / cantidadValidas));
            System.out.printf("Nota máxima: %.2f%n", notaMaxima);
            System.out.printf("Nota mínima: %.2f%n", notaMinima);
        } else {
            System.out.println("Promedio: 0.00");
            System.out.println("Nota máxima: N/A");
            System.out.println("Nota mínima: N/A");
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);

        scanner.close();
    }
}