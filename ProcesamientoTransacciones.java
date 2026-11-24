import java.util.Scanner;

public class ProcesamientoTransacciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double montoMinimo = 10.0;
        int transaccionesValidas = 0;
        double totalProcesado = 0;

        System.out.println("Ingrese montos en S/ (se ignoran < S/ 10; ingrese -1 para terminar):");

        while (true) {
            System.out.print("Monto (S/): ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ingrese un monto numérico válido.");
                scanner.next();
                continue;
            }

            double monto = scanner.nextDouble();

            if (monto == -1) {
                break;
            }

            if (monto < montoMinimo) {
                System.out.println("Monto menor a S/ 10, ignorado.");
                continue;
            }

            transaccionesValidas++;
            totalProcesado += monto;
        }

        System.out.println("\n--- Procesamiento de Transacciones ---");
        System.out.printf("Total procesado: S/ %.2f%n", totalProcesado);
        System.out.println("Cantidad de transacciones válidas: " + transaccionesValidas);

        scanner.close();
    }
}