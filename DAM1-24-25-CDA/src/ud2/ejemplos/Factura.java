package ud2.ejemplos;

import java.util.*;

public class Factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enunciado
        /*
         * Escribe un programa para emitir la factura de compra de un producto,
         * introduciendo el precio del producto y el número de unidades compradas. La
         * factura deberá añadir al total un IVA (Impuesto del Valor Añadido) del 21%.
         * Si el precio final con IVA es superior a 100 euros se aplicará un descuento
         * del 5%.
         * 
         * Ejemplos para pruebas:
         * Precio = 10 €, Unidades = 5 => Precio Final = 60,50 €
         * Precio = 20 €, Unidades = 7 => Precio Final = 160,93 €
         * 
         */

      
         double precio;
         double producto;
         double numUnidadesCompradas;
         double precioConDescuento;
         double precioIVA;

         System.out.println(" Dime el precio del producto... ");
         producto=sc.nextDouble();
         System.out.println(" Y cuántas unidades... ");
         numUnidadesCompradas=sc.nextDouble();
         sc.close();

        precio = producto * numUnidadesCompradas;
        precioIVA = precio + precio * 0.21;
        precioConDescuento = precioIVA - precioIVA * 0.05;
         
         System.out.println(" La factura es de:... ");
         if (precio <100) {
            System.out.println( precioIVA );
         } else  {
            System.out.println(precioConDescuento);


         }

        
         
    }

}
