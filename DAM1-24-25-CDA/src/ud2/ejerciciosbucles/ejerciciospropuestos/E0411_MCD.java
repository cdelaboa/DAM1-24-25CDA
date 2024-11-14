package ud2.ejerciciosbucles.ejerciciospropuestos;

import java.util.Scanner;

public class E0411_MCD {

    public static int mcd(int a, int b) {
    
        if (a == 0) 
            return b;

         else if (b == 0) 
            return a;

         else if (a >= b) 
            return mcd(a - b, b);

         else 
            return mcd(a, b - a);
        
        
    }

    public static void main(String[] args) {
       /*  int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime dos números ");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        System.out.println("Ahora comprabaremos cuál es su máximo común divisor ");
        System.out.println(mcd(a, b)); 
        */
        System.out.println(mcd(30,5));
    }
}
