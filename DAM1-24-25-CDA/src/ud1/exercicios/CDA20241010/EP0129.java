package ud1.exercicios.CDA20241010;

import java.util.Scanner;

public class EP0129 {
    public static void main(String[] args) {
        // Escribe un programa que tome como entrada un número entero e indique qué
        // cantidad hay que sumarle para que el resultado sea múltiplo de 7. Un ejemplo:
        // A 2 hay que sumarle 5 para que el resultado (2+5=7) sea múltiplo de 7.
        // A 13 hay que sumarle 1 para que el resultado (13+1=14) sea múltiplo de 7.

        Scanner sc = new Scanner(System.in);

        byte num;

        System.out.println(" Dime un número entero cualquiera ");
        num = sc.nextByte();

        double multiplo = (num % 7) 
         (num / 7);

        System.out.println(" Por lo cual el múltiplo de 7 más próximo a tu número es " + multiplo);


        sc.close();
    }
}
