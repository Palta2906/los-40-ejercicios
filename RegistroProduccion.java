import java.util.Scanner;

public class RegistroProduccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalProducido = 0;
        int horasRegistradas = 0;

        while (true) {
            System.out.print("Ingrese produccion de la hora (0 para detener): ");
            int produccion = sc.nextInt();

            if (produccion == 0) {
                break;
            }

            totalProducido += produccion;
            horasRegistradas++;
        }

        System.out.println("\n--- Resumen de Produccion ---");
        System.out.println("Total producido: " + totalProducido);
        System.out.println("Cantidad de horas registradas: " + horasRegistradas);

        sc.close();
    }
}