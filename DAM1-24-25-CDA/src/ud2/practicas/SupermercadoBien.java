package ud2.practicas;

import java.util.Scanner;

public class SupermercadoBien {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    try {
        System.out.printf("¿Cuál es el precio del producto? ( pulsa 0 para finalizar)");
        double precioProducto = sc.nextDouble();
        System.out.println("Y ahora cuántas unidades quieres de ese producto ");
        int unidades = sc.nextInt();

} catch (IllegalArgumentException e) {
    System.out.println("Has introducido un número con más de dos decimales");
    System.out.println(e.toString());
}

}


}


}
