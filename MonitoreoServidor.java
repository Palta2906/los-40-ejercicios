import java.util.Scanner;

public class MonitoreoServidor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limiteMs = 5000;
        int registrosProcesados = 0;
        Integer tiempoCritico = null;

        System.out.println("Ingrese tiempos de respuesta en ms (ingrese -1 para terminar):");

        while (true) {
            System.out.print("Tiempo (ms): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número entero válido.");
                scanner.next();
                continue;
            }

            int tiempo = scanner.nextInt();

            if (tiempo == -1) {
                break;
            }

            registrosProcesados++;

            if (tiempo > limiteMs) {
                tiempoCritico = tiempo;
                break;
            }
        }

        System.out.println("\n--- Resultado del Monitoreo ---");
        if (tiempoCritico != null) {
            System.out.println("Tiempo crítico: " + tiempoCritico + " ms");
        } else {
            System.out.println("Tiempo crítico: Ninguno (todos fueron <= " + limiteMs + " ms)");
        }
        System.out.println("Registros procesados: " + registrosProcesados);

        scanner.close();
    }
}