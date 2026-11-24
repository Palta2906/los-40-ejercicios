import java.util.Scanner;

public class MostrarVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine().trim();

        StringBuilder vocalesEncontradas = new StringBuilder();

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            char lower = Character.toLowerCase(c);

            if (lower != 'a' && lower != 'e' && lower != 'i' && lower != 'o' && lower != 'u') {
                continue;
            }

            if (vocalesEncontradas.length() > 0) {
                vocalesEncontradas.append(", ");
            }
            vocalesEncontradas.append(c);
        }

        System.out.println("\n--- Vocales Encontradas ---");
        if (vocalesEncontradas.length() > 0) {
            System.out.println("Vocales encontradas: " + vocalesEncontradas);
        } else {
            System.out.println("Vocales encontradas: Ninguna");
        }

        scanner.close();
    }
}