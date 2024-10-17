package ud2.ejemplos;

import java.util.*;

public class E0207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enunciado: Pedir tres números y mostrarlos ordenados de mayor a menor.

        int num1, num2, num3;

        System.out.println("Con este programa sabremos el orden de mayor a menor de estos tres números...");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Ingresa el primer número:");
        num1 = sc.nextInt();
        
        System.out.println("Ingresa el segundo número:");
        num2 = sc.nextInt();
        
        System.out.println("Ingresa el tercer número:");
        num3 = sc.nextInt();
        
        sc.close();

        int mayor, medio, menor;

        if (num1 >= num2 && num1 >= num3) {
            mayor =num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }

        } else if (num2 >= num1 && num2 >= num3) {
            mayor =num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;

            } else {
                medio = num3;
                menor = num1;
            }
        } else if (num3 >= num1 && num3 >= num2) {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;

            } else {
                medio = num2;
                menor = num1;
            }
        }

        System.out.println("Los números ordenados de mayor a menor son: ");
    }
}
