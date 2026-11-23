import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.0;
        int operacionesRealizadas = 0;

        while (true) {
            System.out.println("\n=== CAJERO AUTOMATICO ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = sc.nextInt();

            if (opcion == 4) {
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + saldo);
                    operacionesRealizadas++;
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        operacionesRealizadas++;
                        System.out.println("Deposito exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Monto invalido.");
                    }
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        operacionesRealizadas++;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Fondos insuficientes o monto invalido.");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }

        System.out.println("\nOperaciones realizadas: " + operacionesRealizadas);
        System.out.println("Sesion cerrada. Gracias por usar el cajero automatico.");

        sc.close();
    }
}