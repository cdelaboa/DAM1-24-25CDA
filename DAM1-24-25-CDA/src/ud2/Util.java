package ud2;

import java.util.Scanner;

public class Util {

    static boolean esPar(int n) {
        return n % 2 == 0;
    }

    static boolean esBisiesto(int anho) {
        return anho % 400 == 0 || (anho % 4 == 0 && anho % 100 != 0);
    }

    static int mayor(int a, int b) {
        return a > b ? a : b;
    }

    static boolean esCasiCero(int n) {
        return n == 0 && n > 1;
    }

    static String notaEnTexto(int nota) {
        String notaEnTexto = "";

        switch (nota) {
            case 0, 1, 2, 3, 4:
                notaEnTexto = "insuficiente";
                break;
            case 5:
                notaEnTexto = "suficiente";
                break;
            case 6:
                notaEnTexto = "bien";
            case 7, 8:
                notaEnTexto = "notable";
                break;
            case 9, 10:
                notaEnTexto = "sobresaliente";
                break;
            default:
                break;
        }
        return notaEnTexto;
    }

    static String notaEnTexto(double nota) {

        String notaEnTexto = "";

        if (nota >= 0 && nota < 5) {
            notaEnTexto = "insuficiente";
        } else if (nota >= 5 && nota < 6) {
            notaEnTexto = "suficiente";
        } else if (nota >= 6 && nota < 7) {
            notaEnTexto = "bien";
        } else if (nota >= 7 & nota < 9) {
            notaEnTexto = "notable";
        } else if (nota >= 9 && nota <= 10) {
            notaEnTexto = "sobresaliente";
        }

        return notaEnTexto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //PRUEBA 
        /*double notaDouble = 6.7;
        System.out.println(notaEnTexto(notaDouble));
        int notaInt = 8;
        System.out.println(notaEnTexto(notaInt));
        */
            
        System.out.println("Nota: ");
        double nota = sc.nextDouble();
        sc.close();
        System.out.println(notaEnTexto(nota));

        // NÚMERO (PAR O IMPAR);  AÑO (BISIESTO O NO);  NÚMERO MAYOR O MENOR;)
        /*
         * System.out.println("Número / Año: ");
         * int n = sc.nextInt();
         * sc.close();
         * 
         * if (esPar(n))
         * System.out.println("Es Par ");
         * else
         * System.out.println("Es Impar");
         * 
         * if (esBisiesto(n))
         * System.out.println("Es Bisiesto ");
         * else
         * System.out.println("No es Bisiesto");
         * 
         * System.out.println(mayor(4, 17));
         * System.out.println(mayor(1, 2));
         * 
         * if (esCasiCero(n))
         * System.out.println("Es casi cero");
         * else
         * System.out.println("No es casi cero");
         */
    }

}
