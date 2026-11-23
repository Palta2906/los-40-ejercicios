import java.util.Scanner;

public class SimulacionRed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paquetesValidos = 0;
        Integer numeroPaqueteCorrupto = null;

        System.out.println("Simulación de red (ingrese estado: 'V' válido o 'C' corrupto):");

        while (true) {
            System.out.print("Número de paquete: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número entero válido para el paquete.");
                scanner.next();
                scanner.nextLine();
                continue;
            }

            int numeroPaquete = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Estado del paquete (V = válido / C = corrupto): ");
            String estado = scanner.nextLine().trim().toUpperCase();

            if (estado.equals("C") || estado.equals("CORRUPTO")) {
                numeroPaqueteCorrupto = numeroPaquete;
                break;
            } else if (estado.equals("V") || estado.equals("VALIDO") || estado.equals("VÁLIDO")) {
                paquetesValidos++;
            } else {
                System.out.println("Estado no reconocido. Use 'V' o 'C'.");
            }
        }

        System.out.println("\n--- Resultado de la Simulación de Red ---");
        System.out.println("Número del paquete: " + numeroPaqueteCorrupto);
        System.out.println("Paquetes válidos procesados: " + paquetesValidos);

        scanner.close();
    }
}