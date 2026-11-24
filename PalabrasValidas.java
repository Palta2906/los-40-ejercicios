import java.util.Scanner;

public class PalabrasValidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadValidas = 0;

        System.out.println("Ingrese palabras (se ignoran las de menos de 5 caracteres; escriba FIN para salir):");

        while (true) {
            System.out.print("Palabra: ");
            String palabra = scanner.nextLine().trim();

            if (palabra.equalsIgnoreCase("FIN")) {
                break;
            }

            if (palabra.length() < 5) {
                System.out.println("Palabra con menos de 5 caracteres, ignorada.");
                continue;
            }

            cantidadValidas++;
        }

        System.out.println("\n--- Palabras Válidas ---");
        System.out.println("Cantidad de palabras válidas: " + cantidadValidas);

        scanner.close();
    }
}