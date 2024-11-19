package ud2.practicas;

import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
    



    try {
        Scanner sc = new Scanner(System.in);
        double precioProducto;
        int unidades;
        System.out.println("Introduce el precio del producto (en euros y como máximo dos decimales)");
        precioProducto = sc.nextDouble();
        System.out.println("Y ahora cuántas unidades vas a comprar del producto ");
        unidades = sc.nextInt();
        
    } catch (IllegalArgumentException e){
        System.out.println("Has introducido un número con más de dos decimales");
        System.out.println(e.toString());
    }
    /* 
    String metodoPago;

    double importeTotal = precioProducto * unidades;
    System.out.printf("El importe total es de: %.2f %n", importeTotal);
    System.out.println("Con qué método vas a pagar (efectivo o tarjeta)");
    metodoPago = sc.next().toLowerCase();
    //pagoEnEfectivo = sc.nextBoolean();






    if (metodoPago.equals("tarjeta")) {
        System.out.println("La compra ha sido realiza con éxito, gracias por su compra");
        break:
    } else if (metodoPago.equals("efectivo")) {
        calcularCambio();
        break;
    
    } else {
        System.out.println("Método de pago no válido, por favor elija uno de los métodos correspondientes ");

    }
}
    
    
    public static void calcularCambio () {


    
System.out.println("¿Con cuánto dinero vas a pagar el importe? ");
        importeCliente = sc.nextDouble();
        double precioDevolucion = importeCliente - importeTotal;*/
    }
}
