import java.util.Scanner;

public class EstadisticaTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int validas = 0;
        double sumaTemp = 0;
        double tempMax = Double.NEGATIVE_INFINITY;
        double tempMin = Double.POSITIVE_INFINITY;

        System.out.println("Ingrese temperaturas en °C (válidas entre -10°C y 50°C; ingrese 999 para terminar):");

        while (true) {
            System.out.print("Temperatura (°C): ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ingrese un valor numérico válido.");
                scanner.next();
                continue;
            }

            double temp = scanner.nextDouble();

            if (temp == 999) {
                break;
            }

            if (temp < -10.0 || temp > 50.0) {
                System.out.println("Temperatura fuera del rango (-10°C a 50°C), ignorada.");
                continue;
            }

            validas++;
            sumaTemp += temp;

            if (temp > tempMax) {
                tempMax = temp;
            }
            if (temp < tempMin) {
                tempMin = temp;
            }
        }

        System.out.println("\n--- Estadística de Temperaturas ---");
        if (validas > 0) {
            System.out.printf("Temperatura promedio: %.2f°C%n", (sumaTemp / validas));
            System.out.printf("Temperatura máxima: %.2f°C%n", tempMax);
            System.out.printf("Temperatura mínima: %.2f°C%n", tempMin);
        } else {
            System.out.println("No se registraron temperaturas válidas.");
        }

        scanner.close();
    }
}