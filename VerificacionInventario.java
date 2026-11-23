import java.util.Scanner;

public class VerificacionInventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int registrosValidos = 0;
        String productoConError = null;

        System.out.println("Ingrese producto y stock (un stock negativo detiene el registro):");

        while (true) {
            System.out.print("Nombre del producto: ");
            String producto = scanner.nextLine().trim();

            if (producto.isEmpty()) {
                System.out.println("El nombre del producto no puede estar vacío.");
                continue;
            }

            System.out.print("Cantidad en stock: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número entero válido para el stock.");
                scanner.next();
                scanner.nextLine(); // limpiar salto de línea
                continue;
            }

            int stock = scanner.nextInt();
            scanner.nextLine(); // limpiar salto de línea

            if (stock < 0) {
                productoConError = producto + " (stock: " + stock + ")";
                break;
            }

            registrosValidos++;
        }

        System.out.println("\n--- Verificación de Inventario ---");
        if (productoConError != null) {
            System.out.println("Producto con error: " + productoConError);
        } else {
            System.out.println("Producto con error: Ninguno");
        }
        System.out.println("Cantidad de registros válidos: " + registrosValidos);

        scanner.close();
    }
}