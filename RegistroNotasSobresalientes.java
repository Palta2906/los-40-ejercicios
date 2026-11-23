import java.util.Scanner;

public class RegistroNotasSobresalientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        double suma = 0;
        double maxima = Double.NEGATIVE_INFINITY;
        double minima = Double.POSITIVE_INFINITY;

        while (true) {
            System.out.print("Ingrese una nota (20 para finalizar): ");
            double nota = sc.nextDouble();

            if (nota == 20) {
                break;
            }

            cantidad++;
            suma += nota;
            if (nota > maxima) {
                maxima = nota;
            }
            if (nota < minima) {
                minima = nota;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de notas registradas: " + cantidad);
        if (cantidad > 0) {
            System.out.println("Promedio de notas: " + (suma / cantidad));
            System.out.println("Nota maxima: " + maxima);
            System.out.println("Nota minima: " + minima);
        } else {
            System.out.println("Promedio de notas: 0.0");
            System.out.println("Nota maxima: N/A");
            System.out.println("Nota minima: N/A");
        }

        sc.close();
    }
}