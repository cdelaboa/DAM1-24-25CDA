package ud1.ejercicios;

import java.util.Scanner;

public class EP0113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el valor de a ");
        double a = scanner.nextDouble();

        System.out.println("Dime el valor de b ");
        double b = scanner.nextDouble();

        System.out.println("Dime el valor de c ");
        double c = scanner.nextDouble();

        System.out.println("Dime el valor de x también");
        double x = scanner.nextDouble();

        double y = a * Math.pow(x, 2) + b * x + c;
        System.out.println(" El resultado de esta ecuación de segundo grado sería: " + y);

        scanner.close();
        
    }
    
}
