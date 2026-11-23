import java.util.Scanner;

public class SistemaPedidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pedidosProcesados = 0;
        Integer numeroPedidoUrgente = null;

        System.out.println("Procesamiento de pedidos (marque 'S' si es urgente, 'N' si no):");

        while (true) {
            System.out.print("Número de pedido: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número entero válido para el pedido.");
                scanner.next();
                scanner.nextLine();
                continue;
            }

            int numeroPedido = scanner.nextInt();
            scanner.nextLine();

            System.out.print("¿Es urgente? (S/N): ");
            String urgente = scanner.nextLine().trim().toUpperCase();

            pedidosProcesados++;

            if (urgente.equals("S") || urgente.equals("SI") || urgente.equals("URGENTE")) {
                numeroPedidoUrgente = numeroPedido;
                break;
            }
        }

        System.out.println("\n--- Resultado del Sistema de Pedidos ---");
        System.out.println("Número del pedido urgente: " + numeroPedidoUrgente);
        System.out.println("Pedidos procesados: " + pedidosProcesados);

        scanner.close();
    }
}