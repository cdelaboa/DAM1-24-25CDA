package ud2.ejerciciosbucles;

import java.util.*;

public class E0301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada

        int num = 1; // Inicializar para evitar fallos
        boolean par;
        String msjPar;
        String mensajePos;
        

        while (num != 0) {
            System.out.println("\nDime un número ");
            num = sc.nextInt();

            double cuadrado = Math.pow(num, 2);
            par = num % 2 ==0;
            if (par == true) {
                msjPar = "par";
            } else {
                msjPar = "impar";
            }
            boolean positivo = num >0;
            if (positivo == true) {

                mensajePos = "positivo";
                               
            } else {
                mensajePos = "negativo";
            }

            System.out.println("\nEl cuadrado de este número es: " + cuadrado + " es " + msjPar + " y es " + mensajePos);
        }
        sc.close();
    }
}
