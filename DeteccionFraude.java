import java.util.Scanner;

public class DeteccionFraude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double umbralSospechoso = 50000.0;
        int operacionesRevisadas = 0;
        Double montoSospechoso = null;

        System.out.println("Ingrese movimientos financieros (ingrese 0 para finalizar sin alertas):");
        System.out.println("Regla de alerta: monto > " + umbralSospechoso + " o monto negativo.");

        while (true) {
            System.out.print("Monto del movimiento: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ingrese un monto numérico válido.");
                scanner.next();
                continue;
            }

            double monto = scanner.nextDouble();

            if (monto == 0) {
                break;
            }

            operacionesRevisadas++;

            if (monto > umbralSospechoso || monto < 0) {
                montoSospechoso = monto;
                break;
            }
        }

        System.out.println("\n--- Resultado de Detección de Fraude ---");
        if (montoSospechoso != null) {
            System.out.printf("Monto sospechoso: %.2f%n", montoSospechoso);
        } else {
            System.out.println("Monto sospechoso: Ninguno");
        }
        System.out.println("Número de operaciones revisadas: " + operacionesRevisadas);

        scanner.close();
    }
}