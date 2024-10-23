package ud2.ejemplos;

import java.util.*;

public class E0213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour, min, sec;
        System.out.println(" Dime la hora del día que quieras ( especificando horas, minutos y segundos)");
        hour = sc.nextInt();
        min = sc.nextInt();
        sec = sc.nextInt();
        sc.close();

        System.out.println("Son las "+ hour + ":" + min + ":" + sec);

        System.out.println("Vamos a añadirle un segundo");
        sec = sec + 1;

        if (sec == 60) {
            sec = 0;
            min = min + 1;
        }
        if (min == 60) {
            min = 0;
            hour = hour + 1;
        }
        if (hour == 24) {
            sec = 0;
            min = 0;
            hour = 0;
        }

        System.out.printf("Son las %02d:%02d:%02d", hour, min, sec);


        /*
         * pasar todo a segundos
         * final double HORA_SEGUNDO = hora * 3600;
         * final double MINUTO_SEGUNDO = minuto * 60;
         * 
         * double horaPlusOneSecond = HORA_SEGUNDO + MINUTO_SEGUNDO + segundo ++;
         * 
         * System.out.println(" La hora +  1 segundo  " + horaPlusOneSecond);
         * 
         * double hour, min, sec;
         * hour = horaPlusOneSecond / 3600;
         * min = horaPlusOneSecond / 60;
         * sec = min % 60;
         * 
         * System.out.println(" La hora cambiada es ");
         * System.out.printf("%.0f:%.0f:%.0f", hour, min, sec);
         * 
         */
    }
}
