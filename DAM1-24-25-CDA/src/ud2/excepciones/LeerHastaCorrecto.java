package ud2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerHastaCorrecto {
public static void main(String[] args) {
    // Amplía el programa anterior con un bucle de modo que se continúe
    //solicitando datos de entrada al usuario hasta que el valor introducido sea efectivamente
    //un número del tipo deseado.

    Scanner sc = new Scanner(System.in);
            System.out.println("Escribe un número");
            n = sc.nextInt();
            sc.close();
    boolean comprobar = false;
    if (comprobar)
     while (comprobar = true) {
        try {
            int n ;
            System.out.println("Escribe un número");
            n = sc.nextInt();
            sc.close();
            System.out.println("Has puesto el número " + n + ", es correcto");
        } catch (InputMismatchException e) {
            System.out.println("Debes introducir un número");
            System.out.println(e.toString());
         }
     } 

    
    }
}



