import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CompetenciaDeportiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> puntajes = new HashMap<>();

        int metaPuntos = 100;
        String ganador = null;
        int puntajeFinal = 0;

        System.out.println("Meta: " + metaPuntos + " puntos. Ingrese participante y puntos:");

        while (ganador == null) {
            System.out.print("Nombre del participante: ");
            String participante = scanner.nextLine().trim();

            if (participante.isEmpty()) {
                System.out.println("El nombre no puede estar vacío.");
                continue;
            }

            System.out.print("Puntos obtenidos: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número entero válido.");
                scanner.next();
                scanner.nextLine();
                continue;
            }

            int puntos = scanner.nextInt();
            scanner.nextLine();

            int nuevoTotal = puntajes.getOrDefault(participante, 0) + puntos;
            puntajes.put(participante, nuevoTotal);

            System.out.println("Puntaje actual de " + participante + ": " + nuevoTotal);

            if (nuevoTotal >= metaPuntos) {
                ganador = participante;
                puntajeFinal = nuevoTotal;
            }
        }

        System.out.println("\n--- Resultado de la Competencia ---");
        System.out.println("Ganador: " + ganador);
        System.out.println("Puntaje final: " + puntajeFinal);

        scanner.close();
    }
}