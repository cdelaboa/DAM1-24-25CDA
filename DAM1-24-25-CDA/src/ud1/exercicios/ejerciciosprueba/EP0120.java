package ud1.exercicios.ejerciciosprueba;

import java.util.Scanner;

public class EP0120 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int niños;
    int adultos;
    final double entradaInfantil = 15.50;
    final double entradaAdulto = 20;

    System.out.println(" Dime cuántas niños sois... ");
    niños = sc.nextInt();

    System.out.println(" Dime cuántos adultos sois... ");
    adultos = sc.nextInt();

    sc.close();

    double importeFinal = (adultos * entradaAdulto) + (niños * entradaInfantil);

    double descuento5 = (importeFinal <= 100) ? importeFinal : (importeFinal -(importeFinal * 0.05));

    System.out.println(" El precio final para entrar es de.." + descuento5 + "euros");
}
}
