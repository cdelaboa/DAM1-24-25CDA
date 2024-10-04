package ud1.ejercicios;

import java.util.Scanner;

public class EP0115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el número de segundos");
        int secondsTotal = scanner.nextInt();

        int hours = (secondsTotal / 3600);
        int minutes = (secondsTotal % 3600 / 60);
        int seconds = (secondsTotal % 60);

        // Resultado
        System.out.println("Horas " + hours);
        System.out.println("Minutos " + minutes);
        System.out.println("Segundos " + seconds);

        scanner.close();
    }
}
