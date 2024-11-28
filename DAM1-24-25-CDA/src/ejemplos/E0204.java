package ud2.ejemplos;

import java.util.*;

public class E0204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Implementar un programa que pida por teclado un número decimal e indique si
         * es un número casi-cero que son aquellos, positivos o negativos, que se acercan a 0
         * por menos de 1
         * unidad, aunque curiosamente el 0 no se considera un número casi-cero.
         * Ejemplos de números
         * casi-cero son el 0,3, el -0,99 o el 0,123; algunos números que no se
         * consideran casi-ceros son: el
         * 12,3, el 0 o el -1.
         */

            double num;
            System.out.println("Dame un número ");
            num =sc.nextDouble();
            sc.close();

            System.out.println(" El número que me has proporcionado es: ");
            if (num==0) {
                System.out.println(" No casi-cero");
            } else if (num>1){
                System.out.println("No casi-cero");
            }else if (num>-1){
                System.out.println("Casi-cero");
            }







    }
}
