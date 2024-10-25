package ud2.ejemplos;
import java.util.*;
public class E0214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Crear una aplicación que solicite al usuario una fecha (día, mes, año)
         y muestre la fecha correspondiente al día siguiente.  */

         int dia, mes, anho;
         boolean hayQueIncrementarMes = false;
         System.out.println(" Dime la fecha del año que quieras ( especificando día, mes y año)");
         System.out.println("DÍA: ");
         dia = sc.nextInt();
         System.out.println("MES: ");
         mes = sc.nextInt();
        System.out.println("AÑO: ");
         anho = sc.nextInt();
         sc.close();

         System.out.println("Es el "+ dia + " del " + mes + " del " + anho);

         System.out.println("Vamos a añadirle un día");
         dia++;
        

         switch (mes) {
            case 1,3,5,7,8,10,12:
                if (dia > 31) hayQueIncrementarMes = true;
                break;
            case 2:
                if (dia > 28) hayQueIncrementarMes = true;
                break;

            case 4,6,9,11:
                if(dia> 30) hayQueIncrementarMes = true;
                break;
           
         }
         
         if (hayQueIncrementarMes) {
            dia = 1;
            mes++;
            
            if (mes > 12) {
            mes = 1;
            anho++;
         }

        
         
        
         System.out.printf("Por lo cual será el %d del %d del %d", dia, mes, anho);

        }
    }
}

