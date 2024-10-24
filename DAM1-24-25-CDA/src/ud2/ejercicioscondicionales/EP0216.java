package ud2.ejercicioscondicionales;
import java.util.*;
public class EP0216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //CDA
        //Utiliza el operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.

        int x;
        System.out.println("Dime un número");
        x = sc.nextInt();

        String respuesta;

        respuesta = x < 0 ? "El valor absoluto de tu número es " + (-x):
                            "El valor absoluto de tu número es " + x;



        System.out.println(respuesta);
    }
}
