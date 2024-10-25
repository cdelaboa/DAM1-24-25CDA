package ud2.ejercicioscondicionales;

import java.util.*;

public class EP0213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales. El número de animales que alimentar (todos de la misma especie) es
         * numAnimales, y sabemos que cada animal come una media de kilosPorAnimal. 
         
         * Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de alimento suficiente para cada animal. 
         * En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales.
         * Nota: Evitar que la aplicación realice divisiones por cero.
         */
          
         //Entrada de datos
         double comidaDiaria, numAnimales, kilosPorAnimal;

         System.out.println("Cuánta comida para animales comprais diariamente ");
         comidaDiaria = sc.nextDouble();
         System.out.println("Cuántos animales teneis que alimentar?");
         numAnimales = sc.nextDouble();
         System.out.println("Cuanto come un animal de media?");
         kilosPorAnimal = sc.nextDouble();
        sc.close();

        //Proceso
        double kilosComidaTotal = numAnimales * kilosPorAnimal;
        double racionPorAnimal = comidaDiaria / numAnimales;

        if(kilosComidaTotal < comidaDiaria) {
            System.out.println("Disponemos de comida suficiente" );
        } else {
            System.out.println("No hay suficiente comida por lo cual, la ración para cada animal va a ser de " + racionPorAnimal );
        }

    }
}
