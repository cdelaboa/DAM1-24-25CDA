package ud2.ejercicioscondicionales;

import java.util.*;
// CDA
public class EP0214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*  Escribe un programa que solicite al usuario un número comprendido entre 1 y 99.
            El programa debe mostrario con letras, por ejemplo, para 56, se verá: “cincuenta y seis”.
        */

        //ENTRADA
        int x;
        System.out.println("Proporciona un número comprendido entre 1 y 99");
        x = sc.nextInt();
        sc.close();

        //PROCESO

        System.out.println("El" + x + "en letras se ve así");

    }
}
