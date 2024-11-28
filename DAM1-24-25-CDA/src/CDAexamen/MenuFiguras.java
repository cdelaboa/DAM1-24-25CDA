package ud2.CDAexamen;

import java.util.Scanner;

// CARLOS DE LA TORRE ABOAL
public class MenuFiguras {
    public static void mostrarMenu(String opcionEscogida) {

        Scanner sc = new Scanner(System.in);
        final int NUM_MAX_ERRORES = 3;
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("0. SALIR");
        opcionEscogida = sc.nextLine();
        sc.close();
        boolean comprobar = false;
        if (comprobar)
            while (comprobar = true) {
                try {

                    System.out.println("1. Triángulo");
                    System.out.println("2. Rectángulo");
                    System.out.println("0. SALIR");
                    opcionEscogida = sc.nextLine();
                    int numErrores;
                    sc.close();
                } catch (IllegalArgumentException e) {
                    System.out.println("Opción inválida");
                    System.out.println(e.toString());
                }
            }

    }

    public static void main(String[] args) {
        int opcionEscogida = 0;
        mostrarMenu(null);
        switch (opcionEscogida) {
            case 1:
                trianguloAsteriscos(5);
            case 0:
            case 2:
                rectanguloAsteriscos(2, 3);
        }
    }

    public static void trianguloAsteriscos(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un número entre 2 y 20");
        num = sc.nextInt();
        sc.close();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rectanguloAsteriscos(int numFilas, int numColumnas) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Di un valor entre 2 y 20 (primero para el número de filas y luego para el de columnas) ");
        numFilas = sc.nextInt();
        numColumnas = sc.nextInt();
        sc.close();

    }
}
