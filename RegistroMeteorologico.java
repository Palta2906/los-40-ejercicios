import java.util.Scanner;

public class RegistroMeteorologico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int registrosValidos = 0;
        double precipitacionAcumulada = 0;

        System.out.println("Ingrese registros de lluvia en mm (se ignoran negativos; ingrese 999 para terminar):");

        while (true) {
            System.out.print("Precipitación (mm): ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ingrese un valor numérico válido.");
                scanner.next();
                continue;
            }

            double lluvia = scanner.nextDouble();

            if (lluvia == 999) {
                break;
            }

            if (lluvia < 0) {
                System.out.println("Registro de lluvia negativo, ignorado.");
                continue;
            }

            registrosValidos++;
            precipitacionAcumulada += lluvia;
        }

        System.out.println("\n--- Registro Meteorológico ---");
        System.out.printf("Precipitación acumulada: %.2f mm%n", precipitacionAcumulada);
        if (registrosValidos > 0) {
            System.out.printf("Promedio: %.2f mm%n", (precipitacionAcumulada / registrosValidos));
        } else {
            System.out.println("Promedio: 0.00 mm");
        }

        scanner.close();
    }
}