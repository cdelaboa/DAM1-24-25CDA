package ud1.exercicios.ejerciciosprueba;

import java.util.Scanner;

public class EP0130 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(" Dime un número... ");
    int n = sc.nextInt();

    System.out.println(" Dime otro número ... ");
    int m = sc.nextInt();


    int cantidadASumar = (m % n == 0) ? 0 : (m - n);

    System.out.println(" Para que n sea múltiplo de m hay que sumarle... " + cantidadASumar);

    sc.close();
}
}
