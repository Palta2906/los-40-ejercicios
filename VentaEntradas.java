import java.util.Scanner;

public class VentaEntradas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int metaEntradas = 500;
        int totalVendido = 0;
        int numeroVentas = 0;

        System.out.println("Meta: " + metaEntradas + " entradas. Ingrese cantidad por venta:");

        while (totalVendido < metaEntradas) {
            System.out.print("Entradas en esta venta: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número entero válido.");
                scanner.next();
                continue;
            }

            int cantidad = scanner.nextInt();

            if (cantidad <= 0) {
                System.out.println("Ingrese una cantidad mayor a 0.");
                continue;
            }

            totalVendido += cantidad;
            numeroVentas++;
            System.out.println("Acumulado actual: " + totalVendido + "/" + metaEntradas);
        }

        System.out.println("\n--- Resumen de Venta de Entradas ---");
        System.out.println("Total vendido: " + totalVendido);
        System.out.println("Número de ventas realizadas: " + numeroVentas);

        scanner.close();
    }
}