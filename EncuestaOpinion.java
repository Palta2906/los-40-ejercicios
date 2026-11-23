import java.util.Scanner;

public class EncuestaOpinion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalRespuestas = 0;
        int sumaPuntajes = 0;

        System.out.println("Ingrese respuestas del 1 al 5 (ingrese 0 para finalizar):");

        while (true) {
            System.out.print("Respuesta: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.next();
                continue;
            }

            int respuesta = scanner.nextInt();

            if (respuesta == 0) {
                break;
            } else if (respuesta >= 1 && respuesta <= 5) {
                totalRespuestas++;
                sumaPuntajes += respuesta;
            } else {
                System.out.println("Respuesta fuera de rango. Debe ser entre 1 y 5 (o 0 para salir).");
            }
        }

        System.out.println("\n--- Resultados de la Encuesta ---");
        System.out.println("Total de respuestas: " + totalRespuestas);

        if (totalRespuestas > 0) {
            double promedio = (double) sumaPuntajes / totalRespuestas;
            System.out.printf("Promedio de satisfacción: %.2f%n", promedio);
        } else {
            System.out.println("Promedio de satisfacción: 0.00 (sin respuestas registradas)");
        }

        scanner.close();
    }
}