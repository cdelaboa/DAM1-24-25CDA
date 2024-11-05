package ud2.ejerciciosbucles;
import java.util.*;
public class E0306 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará
    //todos los números del 1 al n.
    int n;
    System.out.println("Hasta que número quieres aprender a contar? ");
    n = sc.nextInt();
    System.out.println("");
    sc.close();
    for (int i=1; i <= n; i++) {
     System.out.printf("%d, ", i); 
    }
    }

}

