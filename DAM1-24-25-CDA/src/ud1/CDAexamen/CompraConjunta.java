package ud1.CDAexamen;

// Carlos de la Torre Aboal
import java.util.Scanner;

public class CompraConjunta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ¿Cuánto dinero va a poner el primero? (en euros)");
        double dineroAmigo1 = sc.nextDouble();
        System.out.println(" ¿Cuánto dinero va a poner el primero? (en euros)");
        double dineroAmigo2 = sc.nextDouble();
        System.out.println(" ¿Cuánto dinero va a poner el primero? (en euros)");
        double dineroAmigo3 = sc.nextDouble();

        System.out.println(" Introduce el precio del artículo (en euros)");
        double precio = sc.nextDouble();
        sc.nextLine();

        double dineroRecaudado = dineroAmigo1 + dineroAmigo2 + dineroAmigo3;

        boolean compra = (dineroRecaudado > precio);

        double dineroSobrante = dineroRecaudado - precio;
        double dineroQueFalta = precio - dineroRecaudado;

        System.out.printf("El dinero que falta es: ", compra, dineroQueFalta, dineroSobrante);
        sc.close();
    }
}