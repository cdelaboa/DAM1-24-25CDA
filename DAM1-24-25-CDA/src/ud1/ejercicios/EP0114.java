package ud1.ejercicios;

import java.util.Scanner;


public class EP0114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Convertir un número de horas, minutos y segundos introducidos por teclado en un número total de segundos
       int secondsTotal;
       System.out.println("Dime un número de horas ");
       int hours = scanner.nextInt();
       
       System.out.println("Dime cuántos minutos");
       int minutes = scanner.nextInt();

       System.out.println("Y ahora dime cuantos segundos ");
       int seconds = scanner.nextInt();

       //Ahora vamos con el resultado

       secondsTotal = (hours * 3600) + (minutes * 60) + seconds;
       System.out.println("Por lo cual el número de segundos totales que consigues es de: " + secondsTotal);

       scanner.close();
    }



}
