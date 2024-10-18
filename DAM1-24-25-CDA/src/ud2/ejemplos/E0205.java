package ud2.ejemplos;

import java.util.*;

public class E0205 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir los dos números
        System.out.print("Ingresa los números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        System.out.println("------------------------------------------------");
        
        // Mostrar los números en orden decreciente
        if (num1 > num2) {
            System.out.println("Orden decreciente: " + num1 + ", " + num2);
        } else {
            System.out.println("Orden decreciente: " + num2 + ", " + num1);
        }
        
        
    }
}


