package ud2.ejemplos;

import java.util.*;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enunciado
        /*
         * Haz un programa que pida por teclado un número de año y que
         * muestre un mensaje indicando si el año es bisiesto o no.
         * Investiga el agoritmo para calcular si un año es bisiesto o no.
         * “Año bisiesto es el divisible entre 4, salvo que sea año secular es decir
         * divisible por 100, en cuyo
         * caso también ha de ser divisible entre 400.”
         */

        int anho;
        System.out.println("Dime un año");
        anho = sc.nextInt();
        sc.close();

        System.out.println("El año que me has proporcionado es ");
        if (anho % 400 == 0) {
            System.out.println("Bisiesto");
        } else if (anho % 100 == 0) {
            System.out.println("No bisiesto");
        } else if (anho % 4 == 0) {
            System.out.println("Bisiesto");
        } else {
            System.out.println(" No bisiesto");
        }

    }
}
