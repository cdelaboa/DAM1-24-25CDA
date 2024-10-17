package ud1.exercicios.CDA20241010;

import java.util.Scanner;

public class EP0129 {
    public static void main(String[] args) {

            // Crear un objeto Scanner para la entrada de datos
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario que ingrese un número entero
            System.out.print("Introduce un número entero: ");
            int numero = scanner.nextInt();
                scanner.close();
            // Calcular cuánto hay que sumarle para que sea múltiplo de 7 usando el operador
            // ternario
            int resto = numero % 7;
            int cantidadASumar = (resto == 0) ? 0 : 7 - resto;

            // Mostrar el resultado
            System.out.println(
                    "A " + numero + " hay que sumarle " + cantidadASumar + " para que el resultado sea múltiplo de 7.");

    }

}
