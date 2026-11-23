import java.util.Scanner;

public class ControlTemperaturaIndustrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lecturas = 0;
        boolean alertaCritica = false;
        double temperaturaCritica = 0;

        while (true) {
            System.out.print("Ingrese temperatura (°C): ");
            double temp = sc.nextDouble();
            lecturas++;

            if (temp > 95.0) {
                alertaCritica = true;
                temperaturaCritica = temp;
                break;
            }
        }

        System.out.println("\n--- Monitoreo Detenido ---");
        if (alertaCritica) {
            System.out.println("Temperatura critica encontrada: " + temperaturaCritica + " °C");
        }
        System.out.println("Numero de lecturas realizadas: " + lecturas);

        sc.close();
    }
}