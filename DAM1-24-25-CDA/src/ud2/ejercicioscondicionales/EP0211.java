package ud2.ejercicioscondicionales;

import java.util.*;

public class EP0211 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Escribe una aplicación que solicite al usuario un número comprendido entre 0
         * y
         * 9999. La aplicación tendrá que indicar si el número introducido es capicúa.
         */

         System.out.println(" Introduce un número");
         int num = sc.nextInt();
         sc.close();

         System.out.println(" Vamos a ver si es capicúa");

         if (esCapicua(num)) {
            System.out.println("El número " + num + " es capicúa.");
        } else {
            System.out.println("El número " + num + " no es capicúa.");
        }
    }

    // Método para comprobar si un número es capicúa
    public static boolean esCapicua(int numero) {
        String numeroStr = Integer.toString(numero);
        String reversoStr = new StringBuilder(numeroStr).reverse().toString();
        return numeroStr.equals(reversoStr);
    }
}
