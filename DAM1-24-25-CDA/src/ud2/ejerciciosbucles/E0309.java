package ud2.ejerciciosbucles;
import java.util.*;
public class E0309 {
public static void main(String[] args) {

    /*Implementar una aplicación que pida al usuario un número comprendido entre 1 y
    10. Hay que mostrar la tabla de multiplicar de dicho número, asegurándose de que el
    número introducido se encuentra en el rango establecido. */

    Scanner sc = new Scanner(System.in);

    int num, numbase;
    int mult = 1;
    System.out.println("Dime un número comprendido entre 1 y 10..");
    numbase = sc.nextInt();
    sc.close();
    if (numbase > 1 && numbase < 10) {
        System.out.println("Buen número, ahora vamos a mostrarte su tabla de multiplicar ...");
        while (mult <= 10) {
            num =numbase * mult;
            System.out.println(num);
            mult++;
            

        }
    } else 
    System.out.println("Ese número no es válido para el programa, prueba otra vez");

}
   

    }

        
    


