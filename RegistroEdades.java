import java.util.Scanner;

public class RegistroEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int validas = 0;
        int sumaEdades = 0;

        System.out.println("Ingrese edades (18 a 65 válidos; ingrese -1 para finalizar):");

        while (true) {
            System.out.print("Edad: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número entero válido.");
                scanner.next();
                continue;
            }

            int edad = scanner.nextInt();

            if (edad == -1) {
                break;
            }

            if (edad < 18 || edad > 65) {
                System.out.println("Edad fuera del rango (18 - 65), ignorada.");
                continue;
            }

            validas++;
            sumaEdades += edad;
        }

        System.out.println("\n--- Resultados de Edades ---");
        System.out.println("Cantidad válida de personas: " + validas);
        if (validas > 0) {
            System.out.printf("Promedio de edad: %.2f%n", ((double) sumaEdades / validas));
        } else {
            System.out.println("Promedio de edad: 0.00");
        }

        scanner.close();
    }
}