package ud2.ejerciciosfunciones;

import java.util.Scanner;

// CARLOS DE LA TORRE ABOAL
public class EP0413 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Muestra el número de números pares que quieres que te muestre el programa ");
        int n = sc.nextInt();
        System.out.printf("%nLos números son los siguientes: %n");
        muestraPares(n);
        sc.close();
    }

    public static void muestraPares(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i * 2);
        }
    }

}
