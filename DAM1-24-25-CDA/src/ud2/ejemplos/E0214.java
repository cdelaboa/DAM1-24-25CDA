package ud2.ejemplos;
import java.util.*;
public class E0214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Crear una aplicación que solicite al usuario una fecha (día, mes, año)
         y muestre la fecha correspondiente al día siguiente.  */

         int dia, mes, año;
         System.out.println(" Dime la fecha del año que quieras ( especificando día, mes y año)");
         dia = sc.nextInt();
         mes = sc.nextInt();
         año = sc.nextInt();
         sc.close();

         System.out.println("Es el "+ dia + "de" + mes + "del" + año);

         System.out.println("Vamos a añadirle un día");
         dia = dia + 1;

         if (dia == 30) {
            dia = 1;
            mes = mes + 1;
         }
        
         System.out.printf("Es el %dde%ddel%d", dia, mes, año);

    }
}
