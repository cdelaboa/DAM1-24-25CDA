package ud2.ejemplos;

import java.util.*;

public class Ejemplo4Switch {
    public static void main(String[] args) {
        int numeroDia;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero del día de la semana (1 a 7): ");
        numeroDia = sc.nextInt();
        sc.close();
        switch (numeroDia) {
            case 2, 3, 4, 5:
                System.out.println("Tenemos clase de programación");
                break;
            case 1:
                System.out.print("Vaya, que pena, ");
                System.out.print("hoy es lunes y no tenemos clase de programación");
                break;
            case 6, 7:
                System.out.println("Estoy deseando que llegue el lunes!!");
                break;
            default:
                System.out.println("Número de día no válido");
        }
    }
}