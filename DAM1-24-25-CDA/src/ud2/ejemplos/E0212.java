package ud2.ejemplos;

import java.util.*;

public class E0212 {
    public static void main(String[] args) {
        /*
         * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay
         * que
         * tener en cuenta que existen meses con 28, 30 y 31 días (no se considerarán
         * los años
         * bisiestos)
         */
        
        Scanner sc = new Scanner(System.in);
         System.out.println(" Dime una fecha completa (día, mes y año)");
         System.out.println("Primero,  día: ");
         int dia= sc.nextInt();
         System.out.println("Segundo, mes: ");
         int mes= sc.nextInt();
         System.out.println("Tercero, año: ");
         int año= sc.nextInt();
         sc.close();

        /*  switch (dia) {
            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31 ->
            System.out.println(" EL DÍA ES CORRECTO");
         }
         switch (mes) {
            case 1,2,3,4,5,6,7,8,9,10,11,12 ->
            System.out.println(" EL MES ES CORRECTO");
         }
         switch (año){ 
         case 2020, 2021, 2022, 2023 ->
            System.out.println(" EL AÑO ES CORRECTO");
    }
        
         */
         if (mes <= 12 && dia <=31 && año>=1) {
            System.out.println(" La fecha es correcta");
         } else {
            System.out.println(" La fecha es incorrecta");
         }
            
    }
}
