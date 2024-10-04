package ud1.ejercicios;

import java.util.Scanner;

/** Un economista te ha encargado un programa para realizar cálculos con el IVA. La
aplicación debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla
el importe correspondiente al IVA y al total.
 */
public class EP0111 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("¿Cuánto cuesta tu producto?");
        double price = scanner.nextDouble();

        System.out.println("¿Cuánto porcentaje de IVA se le añade a tu producto?");
        int IVA = scanner.nextInt();


        double importIVA = IVA * 0.1;
        System.out.println("El importe correspondiente al IVA será de: " + importIVA);
    
        double finalPrice;
        finalPrice = price + importIVA;
        System.out.println("Por lo cual el precio final del producto será de: " + finalPrice);

        scanner.close();

    }
}
