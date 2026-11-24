import java.util.Scanner;

public class ControlAsistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int asistentesValidos = 0;

        System.out.println("Registro de asistencia (escriba FIN en nombre para terminar):");

        while (true) {
            System.out.print("Nombre del estudiante: ");
            String nombre = scanner.nextLine().trim();

            if (nombre.equalsIgnoreCase("FIN")) {
                break;
            }

            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacío.");
                continue;
            }

            System.out.print("¿Está retirado? (S/N): ");
            String retirado = scanner.nextLine().trim().toUpperCase();

            if (retirado.equals("S") || retirado.equals("SI") || retirado.equals("RETIRADO")) {
                System.out.println("Estudiante retirado, ignorado.");
                continue;
            }

            asistentesValidos++;
        }

        System.out.println("\n--- Control de Asistencia ---");
        System.out.println("Cantidad de asistentes válidos: " + asistentesValidos);

        scanner.close();
    }
}