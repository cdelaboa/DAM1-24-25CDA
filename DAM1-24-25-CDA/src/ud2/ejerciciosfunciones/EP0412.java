package ud2.ejerciciosfunciones;
// CARLOS DE LA TORRE

import java.util.Scanner;

public class EP0412 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%.2f", distancia(1, 2, 3, 4));
        sc.close();
    }

    public static double distancia(double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt((Math.pow(x1 - x2, 2)) + (Math.pow(y1 - y2, 2)));
        return distancia;
    }
}
