package ud2.ejerciciosfunciones;

import java.util.Scanner;

// CARLOS DE LA TORRE ABOAL

/*Diseña una función que calcule y muestre la superficie y el volumen de una esfera.
   Superficie = 4pi * radio2
   Volumen = (4pi / 3) * radio3*/

public class EP0411 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%.2f metros cuadrados%n", superficieEsfera(5));
        System.out.printf("%.2f metros cúbicos%n", volumenEsfera(4));
        sc.close();
    }

    public static double superficieEsfera(double radio) {

        double superficieEsfera = 4 * Math.PI * Math.pow(radio, 2);
        return superficieEsfera;
    }

    public static double volumenEsfera(double radio) {

        double volumenEsfera = (4 * Math.PI / 3) * Math.pow(radio, 3);
        return volumenEsfera;
    }

}
