import java.util.Scanner;

public class EvaluacionExamenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int respuestasValidas = 0;
        int aciertos = 0;

        System.out.println("Ingrese respuesta del alumno y respuesta correcta (deje vacío o '-' si no respondió; 'FIN' para terminar):");

        while (true) {
            System.out.print("Respuesta del alumno: ");
            String respAlumno = scanner.nextLine().trim();

            if (respAlumno.equalsIgnoreCase("FIN")) {
                break;
            }

            if (respAlumno.isEmpty() || respAlumno.equals("-")) {
                System.out.println("Pregunta sin responder, ignorada.");
                continue;
            }

            System.out.print("Respuesta correcta: ");
            String respCorrecta = scanner.nextLine().trim();

            respuestasValidas++;
            if (respAlumno.equalsIgnoreCase(respCorrecta)) {
                aciertos++;
            }
        }

        System.out.println("\n--- Evaluación de Exámenes ---");
        System.out.println("Número de respuestas válidas: " + respuestasValidas);
        if (respuestasValidas > 0) {
            double porcentajeAciertos = (aciertos * 100.0) / respuestasValidas;
            System.out.printf("Porcentaje de aciertos: %.2f%%%n", porcentajeAciertos);
        } else {
            System.out.println("Porcentaje de aciertos: 0.00%");
        }

        scanner.close();
    }
}