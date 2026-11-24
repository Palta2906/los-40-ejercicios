import java.util.Scanner;

public class ProduccionIndustrial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diasActivos = 0;
        double produccionAcumulada = 0;

        System.out.println("Ingrese producción diaria (se ignoran días con 0; ingrese -1 para terminar):");

        while (true) {
            System.out.print("Producción del día: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ingrese un valor numérico válido.");
                scanner.next();
                continue;
            }

            double produccion = scanner.nextDouble();

            if (produccion == -1) {
                break;
            }

            if (produccion == 0) {
                System.out.println("Día con producción 0, ignorado.");
                continue;
            }

            if (produccion < 0) {
                System.out.println("Producción negativa no válida, ignorada.");
                continue;
            }

            diasActivos++;
            produccionAcumulada += produccion;
        }

        System.out.println("\n--- Producción Industrial ---");
        System.out.printf("Producción acumulada: %.2f%n", produccionAcumulada);
        if (diasActivos > 0) {
            System.out.printf("Promedio diario: %.2f%n", (produccionAcumulada / diasActivos));
        } else {
            System.out.println("Promedio diario: 0.00");
        }

        scanner.close();
    }
}