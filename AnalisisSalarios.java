import java.util.Scanner;

public class AnalisisSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadValidos = 0;
        double sumaSalarios = 0;
        double salarioMasAlto = Double.NEGATIVE_INFINITY;

        System.out.println("Ingrese salarios (se ignoran negativos; ingrese 0 para terminar):");

        while (true) {
            System.out.print("Salario: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ingrese un valor numérico válido.");
                scanner.next();
                continue;
            }

            double salario = scanner.nextDouble();

            if (salario == 0) {
                break;
            }

            if (salario < 0) {
                System.out.println("Salario negativo, ignorado.");
                continue;
            }

            cantidadValidos++;
            sumaSalarios += salario;
            if (salario > salarioMasAlto) {
                salarioMasAlto = salario;
            }
        }

        System.out.println("\n--- Análisis de Salarios ---");
        if (cantidadValidos > 0) {
            System.out.printf("Promedio salarial: %.2f%n", (sumaSalarios / cantidadValidos));
            System.out.printf("Salario más alto: %.2f%n", salarioMasAlto);
        } else {
            System.out.println("No se registraron salarios válidos.");
        }

        scanner.close();
    }
}