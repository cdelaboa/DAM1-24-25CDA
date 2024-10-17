package ud2.ejemplos;

import java.util.*;

public class E0206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enunciado: Solicitar dos números y mostrar cuál es el mayor o si son iguales.

        double num1;
        double num2;

        System.out.println(" Dime 2 números... ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        sc.close();

        System.out.println("------------------------------");
        System.out.println("Cuál de los dos será mayor? ...");

        System.out.println("Entonces, ...");
        if (num1 > num2) {
            System.out.println("el mayor es " + num1);

        } else if (num1 < num2) {
            System.out.println("el mayor es " + num2);
        }else {
            System.out.println("son el mismo número");
        }

    }
}
