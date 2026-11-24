import java.util.Scanner;

public class ControlVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ventasValidas = 0;
        double totalVendido = 0;

        System.out.println("Ingrese montos de venta (se ignoran negativos; ingrese -1 para terminar):");

        while (true) {
            System.out.print("Monto de venta: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ingrese un monto numérico válido.");
                scanner.next();
                continue;
            }

            double venta = scanner.nextDouble();

            if (venta == -1) {
                break;
            }

            if (venta < 0) {
                System.out.println("Venta negativa ignorada.");
                continue;
            }

            ventasValidas++;
            totalVendido += venta;
        }

        System.out.println("\n--- Control de Ventas ---");
        System.out.printf("Total vendido: %.2f%n", totalVendido);
        System.out.println("Cantidad de ventas válidas: " + ventasValidas);

        scanner.close();
    }
}