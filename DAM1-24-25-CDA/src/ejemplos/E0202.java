package ud2.ejemplos;
import java.util.*;
public class E0202 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Enunciado: Pedir dos números enteros y decir si son iguales o no.
    //Entrada
    int num1, num2;
    System.out.print("Dame dos números:...");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    sc.close();

    //Salida

    System.out.println(" Los números... ");
    if(num1 == num2) {
            System.out.print("son iguales ");
    } else {
        System.out.println(" no son iguales");
    }

}
}
