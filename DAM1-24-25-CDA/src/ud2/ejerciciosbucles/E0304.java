package ud2.ejerciciosbucles;

import java.util.*;

public class E0304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alturaArbol = 0;
        int etiquetAlturaArbol= 0;

        while (alturaArbol != -1) {
            System.out.println("Dime la altura del árbol");
        alturaArbol = sc.nextDouble();
        etiquetAlturaArbol = etiquetAlturaArbol ++;
        }

        System.out.println("El árbol más alto es el: " + etiquetAlturaArbol);
        sc.close();
    }
}
