package ud1.exercicios.ejerciciosprueba;

import java.util.Scanner;

public class EP0117 {

    // Un biólogo está realizando un estudio de distintas especies de invertebrados
    // y necesita
    // una aplicación que le ayude a contabilizar el número de patas que tienen en
    // total todos los
    // animales capturados durante una jornada de trabajo. Para ello, te ha
    // solicitado que escribas
    // una aplicación a la que hay que proporcionar:
    // El número de hormigas capturadas (6 patas).
    // El número de arañas capturadas (8 patas).
    // El número de cochinillas capturadas (14 patas).

    // La aplicación debe mostrar el número total de patas.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Dime cuántas hormigas has capturado ");
        int numHormigas = sc.nextInt();

        System.out.println(" Dime cuántas arañas has capturado ");
        int numArañas = sc.nextInt();

        System.out.println(" Dime cuántas cochinillas has capturado ");
        int numCochinillas = sc.nextInt();

        int patasHormiga = numHormigas * 6;
        int patasAraña = numArañas * 8;
        int patasCochinilla = numCochinillas * 14;

        int totalPatas = patasHormiga + patasAraña + patasCochinilla;

        System.out.println(" El número total de patas será..."  + totalPatas );

        sc.close();
    }
}
