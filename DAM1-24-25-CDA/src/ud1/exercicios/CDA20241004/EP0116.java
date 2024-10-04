package ud1.exercicios.CDA20241004;

import java.util.Scanner;

public class EP0116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Datos
        System.out.println("Dime una distancia en milímetros /mm" );
        double distanceMM = scanner.nextDouble();
        System.out.println("Dime una distancia en centímetros /cm");
        double distanceCM = scanner.nextDouble();
        System.out.println("Por último dime una distancia en metros /m");
        double distanceM = scanner.nextDouble();

        //Programa: Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en
         //centimetros).

         double distanceTotal;
         distanceTotal = (distanceMM/ 10) + distanceCM + (distanceM * 100);
         System.out.println("Por lo cual la suma de las tres longitudes medida en centímetros es de: " + distanceTotal + "cm");




        scanner.close();

    }
}
