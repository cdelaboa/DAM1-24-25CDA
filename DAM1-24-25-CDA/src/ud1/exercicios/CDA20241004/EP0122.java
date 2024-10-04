package ud1.exercicios.CDA20241004;

import java.util.Scanner;

public class EP0122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una temperatura dada en grados Farenheit ");
        double farenheit = scanner.nextInt();

        //Fórmula
       

        double gradosCentigrados;
        gradosCentigrados = 5 / 9.0 * (farenheit - 32);
        System.out.println("Por lo cual la temperatura en grados centígrados será de: " + gradosCentigrados);




        scanner.close();
        
    }
}
