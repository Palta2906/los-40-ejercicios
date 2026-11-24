import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RegistroPagos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Double> pagosVistos = new HashSet<>();

        double totalAcumulado = 0;

        System.out.println("Ingrese montos de pago (se ignoran repetidos; ingrese -1 para finalizar):");

        while (true) {
            System.out.print("Monto de pago: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ingrese un monto numérico válido.");
                scanner.next();
                continue;
            }

            double pago = scanner.nextDouble();

            if (pago == -1) {
                break;
            }

            if (pagosVistos.contains(pago)) {
                System.out.println("Pago repetido (" + pago + "), ignorado.");
                continue;
            }

            pagosVistos.add(pago);
            totalAcumulado += pago;
        }

        System.out.println("\n--- Registro de Pagos ---");
        System.out.printf("Total acumulado: %.2f%n", totalAcumulado);
        System.out.println("Cantidad de pagos únicos: " + pagosVistos.size());

        scanner.close();
    }
}