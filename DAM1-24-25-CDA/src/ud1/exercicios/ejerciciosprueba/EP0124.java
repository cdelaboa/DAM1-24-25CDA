package ud1.exercicios.ejerciciosprueba;

import java.util.Scanner;

public class EP0124 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    final double LITROS_GALONES = 3.78541;
    final  double GALONES_LITROS = 1 * LITROS_GALONES;

    double cantidadOrigen, cantidadDestino;

    System.out.print("Introduce la cantidad de origen: ... ");
    cantidadOrigen = sc.nextDouble();
    sc.nextLine();

    char unidadMedida;
        System.out.print("Introduce la unidad de medida de origen: (L = litros, G = galones): ");
        unidadMedida = sc.nextLine().charAt(0);
        sc.close();

        cantidadDestino = unidadMedida == 'L' || unidadMedida == 'l' ? cantidadOrigen * LITROS_GALONES: cantidadOrigen * GALONES_LITROS;
        
        String unidadMedidaDestino = unidadMedida == 'L' || unidadMedida == 'l' ? "galones" : "litros";

        System.out.printf("La cantidad en la medida de destino es %.2f %s %n", cantidadDestino, unidadMedidaDestino);
    
    
    
    
    
    
    
    
    
    
    
   
}}
