import java.util.Scanner;

public class SistemaAccesoSeguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String claveCorrecta = "java2026";
        int maxIntentos = 5;
        boolean accesoConcedido = false;
        int intentoExitoso = 0;

        for (int intento = 1; intento <= maxIntentos; intento++) {
            System.out.print("Intento " + intento + "/" + maxIntentos + " - Ingrese la contrasena: ");
            String claveIngresada = sc.nextLine();

            if (claveIngresada.equals(claveCorrecta)) {
                accesoConcedido = true;
                intentoExitoso = intento;
                break;
            }
        }

        System.out.println("\n--- Estado de Acceso ---");
        if (accesoConcedido) {
            System.out.println("Intento en el que accedio: " + intentoExitoso);
            System.out.println("Acceso concedido. Bienvenido!");
        } else {
            System.out.println("Acceso denegado. Se agotaron los " + maxIntentos + " intentos.");
        }

        sc.close();
    }
}