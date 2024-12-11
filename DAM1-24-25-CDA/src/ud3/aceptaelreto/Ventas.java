package ud2.aceptaelreto;

import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {

        System.out.println(comprobacionMedia());

    }
    public static double cuentaPorDia(double dia1, double dia2, double dia3, double dia4, double dia5, double dia6) {
        while (dia1 != -1) {
            
        }
    }
    public static String comprobacionMedia() {
        Scanner sc = new Scanner(System.in);
        String comprobacionMedia;
        System.out.println("¿Cuánta caja has hecho el martes? ");
        double cajaMartes = sc.nextDouble();
        System.out.println("¿Cuánta caja has hecho el miércoles? ");
        double cajaMiercoles = sc.nextDouble();
        System.out.println("¿Cuánta caja has hecho el jueves? ");
        double cajaJueves = sc.nextDouble();
        System.out.println("¿Cuánta caja has hecho el viernes? ");
        double cajaViernes = sc.nextDouble();
        System.out.println("¿Cuánta caja has hecho el sábado? ");
        double cajaSabado = sc.nextDouble();
        System.out.println("¿Cuánta caja has hecho el domingo? ");
        double cajaDomingo = sc.nextDouble();
        double mediaTotalDias = (cajaMartes + cajaMiercoles + cajaJueves + cajaViernes + cajaSabado) / 5;
        if (mediaTotalDias > cajaDomingo)
            comprobacionMedia = "NO";
        else
            comprobacionMedia = "SI";

        return comprobacionMedia;

    }
}
