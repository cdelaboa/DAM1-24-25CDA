package ud2.ejercicioscondicionales;

import java.util.*;

public class EP0217_Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Realiza el “juego de la suma”, que consiste en que aparezcan dos números
        // aleatorios
        // (comprendidos entre 1 y 99) que el usuario tiene que sumar.
        // La aplicación debe indicar si el resultado de la operación es correcto o
        // incorrecto.

        // ENTRADA
        Random random = new Random();
        int numeroAleatorio1 = random.nextInt(100);
        int numeroAleatorio2 = random.nextInt(100);
        int suma = numeroAleatorio1 + numeroAleatorio2;

        int respuesta;
        System.out.println("Aquí tienes tu primer número " + numeroAleatorio1);
        System.out.println("Y aquí el segundo " + numeroAleatorio2);
        System.out.println("Ahora cúanto suman estos dos números? ");
        respuesta = sc.nextInt();
        sc.close();

        if (respuesta == suma) {
            System.out.println("Es correcto");
        } else {
            System.out.println("No es correcto");
        }

    }
}
