package ud2.ejercicioscondicionales;

import java.util.*;

public class EP0219_GradosRadianes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double degrees;
        double rango = 0;
        System.out.println("Cuántos grados tiene tu ángulo?...");
        degrees = sc.nextDouble();
        sc.close();
        if (degrees < 0) {
            System.out.println("Tenemos que transformarlo a dicho rango " + rango);
            rango = 360 - degrees;
        }
    }

}
