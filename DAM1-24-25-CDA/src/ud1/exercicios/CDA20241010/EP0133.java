package ud1.exercicios.CDA20241010;

import java.util.Scanner;

public class EP0133 {
    public static void main(String[] args) {
        // Desarrolla un programa en Java que convierta unidades de almacenamiento entre
        // bytes,
        // kilobytes (KB), megabytes (MB) y gigabytes (GB). Solicita al usuario la
        // cantidad de datos y
        // la unidad de origen y destino.
        // ● 1 KB = 1024 bytes
        // ● 1 MB = 1024 KB
        // ● 1 GB = 1024 MB
        // El programa deberá realizar la conversión correspondiente y mostrar el
        // resultado.

        Scanner sc = new Scanner(System.in);

        final int BYTES_KB = 1024;
        final int KB_MB = 1024;
      

        int unidadOrigen, unidadDestino;

        System.out.println(" Introduce la unidad de origen ");
        unidadOrigen = sc.nextInt();
        sc.nextLine();

        char unidadMedida;
        System.out.println(" Introduce la unidad de medida de origen :   (KB / MB / GB) ");
        unidadMedida = sc.nextLine().charAt(0);

        unidadDestino = unidadMedida == 'K' || unidadMedida == 'k' ? unidadOrigen * BYTES_KB : unidadOrigen * KB_MB ;

        String unidadMedidaDestino = unidadMedida == 'K' || unidadMedida == 'k' ? "megabyte" : "kilobyte" ;

        System.out.printf("La cantidad en la medida de destino es %.3f %s %n", unidadDestino, unidadMedidaDestino);

        sc.close();
    }
}
