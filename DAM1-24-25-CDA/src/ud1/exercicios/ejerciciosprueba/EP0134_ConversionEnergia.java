package ud1.exercicios.ejerciciosprueba;

import java.util.Scanner;

public class EP0134_ConversionEnergia {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    final double J_CAL = 4.184;
    final double J_KWH = 3600000.00;

    double energiaDestino, energiaOrigen;

    System.out.println("Introduce la energia de origen:");
    energiaOrigen = sc.nextDouble();
    sc.nextLine();

    char unidadEnergia;
        System.out.println("Introduce la unidad de energía de origen: ( J = JULIOS ,C = calorías, K = kilovatios-hora (kWh): ");
        unidadEnergia = sc.nextLine().charAt(0);
        sc.close();

        energiaDestino = unidadEnergia == 'K' ? energiaOrigen * J_CAL: energiaOrigen * J_KWH;

    String unidadEnergiaDestino = unidadEnergia == 'J' 
        ? unidadEnergia 
        : unidadEnergia == 'C' 
            ? unidadEnergia /J_CAL 
            : unidadEnergia == 'K' 
                ? unidadEnergia / J_KWH
                : 

    System.out.printf("La cantidad en la medida de destino es %.2f %s %n", energiaDestino, unidadEnergiaDestino);
}
}
