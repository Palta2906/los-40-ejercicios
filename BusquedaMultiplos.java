public class BusquedaMultiplos {
    public static void main(String[] args) {
        int numero = 1;
        int numeroEncontrado = -1;

        while (true) {
            if (numero % 17 == 0 && numero % 23 == 0) {
                numeroEncontrado = numero;
                break;
            }
            numero++;
        }

        System.out.println("--- Búsqueda de Múltiplos (17 y 23) ---");
        System.out.println("Número encontrado: " + numeroEncontrado);
    }
}