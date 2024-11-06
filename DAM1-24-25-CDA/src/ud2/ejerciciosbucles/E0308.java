package ud2.ejerciciosbucles;
import java.util.*;
public class E0308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*Pedir diez números enteros por teclado y mostrar la media.
      Amplía codificando el número de números como una constante. */
        final int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
        System.out.println("Dime 10 números ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        num5 = sc.nextInt();
        num6 = sc.nextInt();
        num7 = sc.nextInt();
        num8 = sc.nextInt();
        num9 = sc.nextInt();
        num10 = sc.nextInt();
        sc.close();
        

        double suma = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        double media = suma / 10;
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("la media de estos 10 números es " + media);


    }
}
