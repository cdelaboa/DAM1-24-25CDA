package ud2.ejemplos;

import java.util.*;

public class E0209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num;
        System.out.print(" Dime el número que quieras...");
        num = sc.nextLong();
        sc.close();
        System.out.println("--------------------------------------------");

        System.out.print(" El número  " + num);
        if (num < 10 && num>-10) {
            System.out.print(" tiene 1 cifra");
        } else if (num < 100 && num >-100) {
            System.out.print(" tiene 2 cifras");
        } else if (num < 1000 && num >-1000) {
            System.out.print(" tiene 3 cifras");
        } else if (num < 10000 && num >-10000) {
            System.out.print(" tiene 4 cifras ");
        } else if (num < 100000 && num >-100000) {
            System.out.print(" tiene 5 cifras ");
        } else {
            System.out.print(" número no válido");
        }
    }
}
