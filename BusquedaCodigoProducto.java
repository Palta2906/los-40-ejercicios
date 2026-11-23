public class BusquedaCodigoProducto {
    public static void main(String[] args) {
        String[] codigos = {"XYZ987", "LMN456", "ABC123", "DEF789", "GHI321"};
        String codigoBuscado = "ABC123";

        int revisados = 0;
        int posicionEncontrada = -1;

        for (int i = 0; i < codigos.length; i++) {
            revisados++;
            if (codigos[i].equals(codigoBuscado)) {
                posicionEncontrada = i;
                break;
            }
        }

        if (posicionEncontrada != -1) {
            System.out.println("Código '" + codigoBuscado + "' encontrado.");
            System.out.println("Posición del código encontrado: " + (posicionEncontrada + 1) + " (índice " + posicionEncontrada + ")");
        } else {
            System.out.println("Código '" + codigoBuscado + "' no encontrado.");
        }

        System.out.println("Cantidad de códigos revisados: " + revisados);
    }
}