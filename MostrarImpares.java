public class MostrarImpares {
    public static void main(String[] args) {
        System.out.println("--- Lista de números impares (1 al 100) ---");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();
    }
}