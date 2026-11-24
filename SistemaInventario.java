import java.util.Scanner;

public class SistemaInventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productosDisponibles = 0;

        System.out.println("Ingrese productos y su stock (se ignoran stock = 0; escriba FIN en producto para salir):");

        while (true) {
            System.out.print("Nombre del producto: ");
            String producto = scanner.nextLine().trim();

            if (producto.equalsIgnoreCase("FIN")) {
                break;
            }

            if (producto.isEmpty()) {
                System.out.println("El nombre del producto no puede estar vacío.");
                continue;
            }

            System.out.print("Stock: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número entero válido para el stock.");
                scanner.next();
                scanner.nextLine();
                continue;
            }

            int stock = scanner.nextInt();
            scanner.nextLine();

            if (stock == 0) {
                System.out.println("Producto con stock 0, ignorado.");
                continue;
            }

            productosDisponibles++;
        }

        System.out.println("\n--- Sistema de Inventario ---");
        System.out.println("Total de productos disponibles: " + productosDisponibles);

        scanner.close();
    }
}