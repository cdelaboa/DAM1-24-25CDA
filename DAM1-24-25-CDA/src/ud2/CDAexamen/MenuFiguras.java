package ud2.CDAexamen;

import java.util.Scanner;

// CARLOS DE LA TORRE ABOAL
import java.util.Scanner;

public class MenuFiguras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int errores = 0;

        while (true) {
            // Mostrar menú
            mostrarMenu();

            // Leer opción del usuario
            int opcion = leerEntero(scanner);

            if (opcion == -1) {
                errores++;
                if (errores >= 3) {
                    System.out.println("Ha alcanzado el límite de errores. El programa terminará.");
                    break;
                }
                System.out.println("Opción inválida. Errores acumulados: " + errores);
                continue;
            }

            switch (opcion) {
                case 0:
                    System.out.println("Gracias por usar el programa. ¡Hasta pronto!");
                    return;

                case 1:
                    manejarTriangulo(scanner);
                    break;

                case 2:
                    manejarRectangulo(scanner);
                    break;

                default:
                    errores++;
                    if (errores >= 3) {
                        System.out.println("Ha alcanzado el límite de errores. El programa terminará.");
                        return;
                    }
                    System.out.println("Opción inválida. Errores acumulados: " + errores);
                    break;
            }
        }
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("0. SALIR");
        System.out.print("Elija una opción: ");
    }

    private static int leerEntero(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Indicador de error
        }
    }

    private static void manejarTriangulo(Scanner scanner) {
        System.out.print("Introduzca un número entero entre 2 y 20 para el triángulo: ");
        int niveles = leerEntero(scanner);

        if (niveles < 2 || niveles > 20) {
            System.out.println("Número fuera de rango. Intente de nuevo.");
            return;
        }

        dibujarTriangulo(niveles);
    }

    private static void manejarRectangulo(Scanner scanner) {
        System.out.print("Introduzca el número de filas (entre 2 y 20): ");
        int filas = leerEntero(scanner);
        System.out.print("Introduzca el número de columnas (entre 2 y 20): ");
        int columnas = leerEntero(scanner);

        if (filas < 2 || filas > 20 || columnas < 2 || columnas > 20) {
            System.out.println("Uno o ambos números están fuera de rango. Intente de nuevo.");
            return;
        }

        dibujarRectangulo(filas, columnas);
    }

    private static void dibujarTriangulo(int niveles) {
        for (int i = 1; i <= niveles; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void dibujarRectangulo(int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
