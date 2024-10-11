package ud1.exercicios.CDA20241010;

import java.util.Scanner;

public class EP0129 {
    public static void main(String[] args) {

        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();

            // Calculamos la cantidad que hay que sumar
            int cantidadASumar = (numero % 7 == 0) ? 0 : (7 - (numero % 7));

            System.out.printf("A %d hay que sumarle %d para que el resultado (%d + %d) sea múltiplo de 7.%n",
                    numero, cantidadASumar, numero, cantidadASumar);

            scanner.close();
        }
    }

}
