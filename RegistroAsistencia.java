import java.util.Scanner;

public class RegistroAsistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAsistentes = 0;

        System.out.println("Ingrese nombres de estudiantes (escriba FIN para terminar):");

        while (true) {
            System.out.print("Estudiante: ");
            String nombre = scanner.nextLine().trim();

            if (nombre.equalsIgnoreCase("FIN")) {
                break;
            }

            if (!nombre.isEmpty()) {
                totalAsistentes++;
            } else {
                System.out.println("El nombre no puede estar vacío.");
            }
        }

        System.out.println("\n--- Resumen de Asistencia ---");
        System.out.println("Total de asistentes registrados: " + totalAsistentes);

        scanner.close();
    }
}