package ud1.exercicios.ejerciciosprueba;

import java.util.Scanner;

public class EP0132 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    final double M2_HR = 10000;
    final double PIESCUADRADOS_M2 = 10.7639;

    double areaOrigen, areaDestino;

   
    System.out.print("Introduce la masa de origen: ");
    areaOrigen = sc.nextDouble();
    sc.nextLine();

    /*byte unidadMedida;
    System.out.print("Introduce la unidad de medida de origen: (1 = Kilos, 2 = Libras): ");
    unidadMedida = sc.nextByte();*/

    char unidadMedida;
    System.out.print("Introduce la unidad de medida de origen: (H = hectáreas, M = metros cuadrados): ");
    unidadMedida = sc.nextLine().charAt(0);
    sc.close();

    areaDestino = unidadMedida == 'H' ? areaOrigen * M2_HR : areaOrigen * PIESCUADRADOS_M2;

    String unidadMedidaDestino = unidadMedida == 'H' ? "pies cuadrados " : "metros cuadrados";

    System.out.printf("La masa en la medida de destino es %.3f %s %n", areaDestino, unidadMedidaDestino);



}
}
