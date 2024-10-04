package ud1.ejercicios;

import java.util.Scanner;

public class EP0112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuánto mide la base de nuestro triángulo? /cm");
        double base = scanner.nextDouble();

        System.out.println("¿Cuál es la altura de nuestro triángulo? /cm");
        double high = scanner.nextDouble();

        double area = (base * high) / 2;
        System.out.println("Entonces el área de nuestro triángulo es: " + area );
      

        scanner.close();

    }

}
