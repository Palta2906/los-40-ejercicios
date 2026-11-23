import java.util.Scanner;

public class ControlCalidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rangoMin = 10.0;
        double rangoMax = 20.0;
        int piezasRevisadas = 0;
        Double medidaIncorrecta = null;

        System.out.println("Rango permitido: [" + rangoMin + " - " + rangoMax + "]. Ingrese medidas:");

        while (true) {
            System.out.print("Medida de la pieza: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ingrese un valor numérico válido.");
                scanner.next();
                continue;
            }

            double medida = scanner.nextDouble();
            piezasRevisadas++;

            if (medida < rangoMin || medida > rangoMax) {
                medidaIncorrecta = medida;
                break;
            }
        }

        System.out.println("\n--- Control de Calidad ---");
        if (medidaIncorrecta != null) {
            System.out.println("Medida incorrecta: " + medidaIncorrecta);
        } else {
            System.out.println("Medida incorrecta: Ninguna");
        }
        System.out.println("Cantidad de piezas revisadas: " + piezasRevisadas);

        scanner.close();
    }
}