import java.util.Scanner;

public class ControlVehicular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int validas = 0;
        double sumaVelocidades = 0;
        double mayorVelocidad = Double.NEGATIVE_INFINITY;

        System.out.println("Ingrese velocidades en km/h (se ignoran < 20 km/h; ingrese -1 para terminar):");

        while (true) {
            System.out.print("Velocidad (km/h): ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ingrese un valor numérico válido.");
                scanner.next();
                continue;
            }

            double velocidad = scanner.nextDouble();

            if (velocidad == -1) {
                break;
            }

            if (velocidad < 20.0) {
                System.out.println("Velocidad menor a 20 km/h, ignorada.");
                continue;
            }

            validas++;
            sumaVelocidades += velocidad;
            if (velocidad > mayorVelocidad) {
                mayorVelocidad = velocidad;
            }
        }

        System.out.println("\n--- Control Vehicular ---");
        if (validas > 0) {
            System.out.printf("Velocidad promedio: %.2f km/h%n", (sumaVelocidades / validas));
            System.out.printf("Mayor velocidad: %.2f km/h%n", mayorVelocidad);
        } else {
            System.out.println("No se registraron velocidades válidas (>= 20 km/h).");
        }

        scanner.close();
    }
}