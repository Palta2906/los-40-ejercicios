import java.util.Scanner;

public class SistemaClientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalRegistros = 0;
        int clientesValidos = 0;

        System.out.println("Ingrese datos de clientes (escriba FIN en nombre para terminar):");

        while (true) {
            System.out.print("Nombre del cliente: ");
            String nombre = scanner.nextLine().trim();

            if (nombre.equalsIgnoreCase("FIN")) {
                break;
            }

            System.out.print("Correo o teléfono: ");
            String contacto = scanner.nextLine().trim();

            totalRegistros++;

            if (nombre.isEmpty() || contacto.isEmpty()) {
                System.out.println("Datos incompletos, cliente ignorado.");
                continue;
            }

            clientesValidos++;
        }

        System.out.println("\n--- Sistema de Clientes ---");
        System.out.println("Cantidad de clientes válidos: " + clientesValidos);
        if (totalRegistros > 0) {
            double porcentaje = (clientesValidos * 100.0) / totalRegistros;
            System.out.printf("Porcentaje de registros válidos: %.2f%%%n", porcentaje);
        } else {
            System.out.println("Porcentaje de registros válidos: 0.00%");
        }

        scanner.close();
    }
}