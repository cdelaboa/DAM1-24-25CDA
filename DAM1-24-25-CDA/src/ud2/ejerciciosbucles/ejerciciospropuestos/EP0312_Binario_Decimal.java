package ud2.ejerciciosbucles.ejerciciospropuestos;

import java.util.Scanner;

public class EP0312_Binario_Decimal {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  Modifica el programa anterior (EP0311) para que el usuario
    //pueda introducir un número en binario y el programa muestre su conversión a decimal.
    int n= 0;
    System.out.println("Introduce un número en binario ");
    int binario = sc.nextInt();
    System.out.println("Cuántas cifras tiene el número binario ");
    int cifrasBinario = sc.nextInt();
    System.out.println("Ahora vamos a pasarlo a decimal ");

    for (int i= 0; n < cifrasBinario; i++ ) {
        System.out.println("El número decimal es: " );
    }
    

    sc.close();
}
}
