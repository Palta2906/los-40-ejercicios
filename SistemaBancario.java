import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limite = 100000.0;
        int registrosProcesados = 0;
        Double transferenciaDetectada = null;

        System.out.println("Ingrese el monto de las transferencias en S/ (ingrese -1 para terminar):");

        while (true) {
            System.out.print("Monto de transferencia (S/): ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Por favor, ingrese un monto numérico válido.");
                scanner.next();
                continue;
            }

            double monto = scanner.nextDouble();

            if (monto == -1) {
                break;
            }

            registrosProcesados++;

            if (monto > limite) {
                transferenciaDetectada = monto;
                break;
            }
        }

        System.out.println("\n--- Resumen del Análisis Bancario ---");
        if (transferenciaDetectada != null) {
            System.out.printf("Transferencia detectada: S/ %.2f (supera S/ %.2f)%n", transferenciaDetectada, limite);
        } else {
            System.out.println("Transferencia detectada: Ninguna transferencia superó el límite.");
        }

        System.out.println("Cantidad de registros procesados: " + registrosProcesados);

        scanner.close();
    }
}