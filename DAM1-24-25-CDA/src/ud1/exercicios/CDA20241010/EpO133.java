package ud1.exercicios.CDA20241010;

import java.util.Scanner;

public class EpO133 {
public static void main(String[] args) {
    
 {
     
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Mostrar las opciones de unidades al usuario
        System.out.println("Unidades disponibles:");
        System.out.println("1. Bytes");
        System.out.println("2. Kilobytes (KB)");
        System.out.println("3. Megabytes (MB)");
        System.out.println("4. Gigabytes (GB)");

        // Solicitar al usuario la cantidad de datos
        System.out.print("Introduce la cantidad de datos: ");
        double cantidad = scanner.nextDouble();

        // Solicitar la unidad de origen
        System.out.print("Introduce el número de la unidad de origen (1-4): ");
        int unidadOrigen = scanner.nextInt();

        // Solicitar la unidad de destino
        System.out.print("Introduce el número de la unidad de destino (1-4): ");
        int unidadDestino = scanner.nextInt();

        // Convertir la cantidad a bytes como punto de referencia usando operador ternario
        double bytes = (unidadOrigen == 1) ? cantidad :
                       (unidadOrigen == 2) ? cantidad * 1024 :
                       (unidadOrigen == 3) ? cantidad * 1024 * 1024 :
                       (unidadOrigen == 4) ? cantidad * 1024 * 1024 * 1024 : 0;

        // Convertir de bytes a la unidad de destino usando operador ternario
        double resultado = (unidadDestino == 1) ? bytes :
                           (unidadDestino == 2) ? bytes / 1024 :
                           (unidadDestino == 3) ? bytes / (1024 * 1024) :
                           (unidadDestino == 4) ? bytes / (1024 * 1024 * 1024) : 0;

        // Mostrar el resultado
        String nombreUnidadDestino = (unidadDestino == 1) ? "Bytes" :
                                     (unidadDestino == 2) ? "Kilobytes (KB)" :
                                     (unidadDestino == 3) ? "Megabytes (MB)" :
                                     (unidadDestino == 4) ? "Gigabytes (GB)" : "Unidad no válida";

        System.out.println("Resultado: " + resultado + " " + nombreUnidadDestino);

        // Cerrar el scanner
        scanner.close();
    }
}

}
