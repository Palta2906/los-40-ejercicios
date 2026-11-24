public class AnalisisNumeros {
    public static void main(String[] args) {
        int cantidadEncontrada = 0;

        System.out.println("--- Lista de números válidos (1 al 500, sin múltiplos de 2, 3 ni 5) ---");

        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                continue;
            }

            System.out.print(i + " ");
            cantidadEncontrada++;
        }

        System.out.println("\n\n--- Resumen ---");
        System.out.println("Cantidad encontrada: " + cantidadEncontrada);
    }
}