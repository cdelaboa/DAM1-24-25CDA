package ud2.ejerciciosfunciones;
// CARLOS DE LA TORRE

import java.util.Scanner;

public class EP0414 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("La cantidad total de segundos es " + cantidadEnSegundos(2,3 , 40) + " segundos");
        sc.close(); 
    }
    public static int cantidadEnSegundos(int days, int hours, int minutes) {
        int cantidadEnSegundos = days * (3600 * 24) + hours * 3600 + minutes * 60;
        return cantidadEnSegundos;
    }
}
