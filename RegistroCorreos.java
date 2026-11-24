import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroCorreos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> correosValidos = new ArrayList<>();

        System.out.println("Ingrese correos electrónicos (escriba FIN para terminar):");

        while (true) {
            System.out.print("Correo: ");
            String correo = scanner.nextLine().trim();

            if (correo.equalsIgnoreCase("FIN")) {
                break;
            }

            if (!correo.contains("@")) {
                System.out.println("Correo inválido (falta '@'), ignorado.");
                continue;
            }

            correosValidos.add(correo);
        }

        System.out.println("\n--- Registro de Correos ---");
        System.out.println("Lista de correos válidos:");
        if (correosValidos.isEmpty()) {
            System.out.println("Ninguno");
        } else {
            for (String c : correosValidos) {
                System.out.println("- " + c);
            }
        }

        scanner.close();
    }
}