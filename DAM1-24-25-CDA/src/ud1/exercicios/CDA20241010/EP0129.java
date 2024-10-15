package ud1.exercicios.CDA20241010;

import java.util.Scanner;

public class EP0129 {
    public static void main(String[] args) {

        {
<<<<<<< HEAD

            // Crear un objeto Scanner para la entrada de datos
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario que ingrese un número entero
            System.out.print("Introduce un número entero: ");
            int numero = scanner.nextInt();

            // Calcular cuánto hay que sumarle para que sea múltiplo de 7 usando el operador
            // ternario
            int resto = numero % 7;
            int cantidadASumar = (resto == 0) ? 0 : 7 - resto;

            // Mostrar el resultado
            System.out.println(
                    "A " + numero + " hay que sumarle " + cantidadASumar + " para que el resultado sea múltiplo de 7.");

            // Cerrar el Scanner
=======
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();

            // Calculamos la cantidad que hay que sumar
            int cantidadASumar = (numero % 7 == 0) ? 0 : (7 - (numero % 7));

            System.out.printf("A %d hay que sumarle %d para que el resultado (%d + %d) sea múltiplo de 7.%n",
                    numero, cantidadASumar, numero, cantidadASumar);

>>>>>>> 399c5b9af1f01022cccff17b87553c67361d6527
            scanner.close();
        }
    }

}
