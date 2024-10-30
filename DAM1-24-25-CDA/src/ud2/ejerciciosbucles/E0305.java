package ud2.ejerciciosbucles;

import java.util.*;

public class E0305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int numeroAleatorio1 = random.nextInt(100);
        int numeroAleatorio2 = random.nextInt(100);
        int suma = numeroAleatorio1 + numeroAleatorio2;
        int acierto = 0;
        int fallo = 0;

        int respuesta;
        System.out.println("Aquí tienes tu primer número " + numeroAleatorio1);
        System.out.println("Y aquí el segundo " + numeroAleatorio2);
        System.out.println("Ahora cúanto suman estos dos números? ");
        respuesta = sc.nextInt();
        sc.close();
        /* 
        if (respuesta == suma) {
            System.out.println("Es correcto");
        } else {
            System.out.println("No es correcto");
            System.out.println("Prueba otra vez");
        }
            */
        while (respuesta == suma) {
            System.out.println("Has acertado");
            acierto = acierto + 1;
            System.out.println("Aquí tienes tu primer número " + numeroAleatorio1);
            System.out.println("Y aquí el segundo " + numeroAleatorio2);
            System.out.println("Ahora cúanto suman estos dos números? ");
            respuesta = sc.nextInt();
                   
            if (respuesta != suma) {
                System.out.println("Has fallado, prueba otra vez");
                fallo = fallo + 1;
                System.out.println("Aquí tienes tu primer número " + numeroAleatorio1);
                System.out.println("Y aquí el segundo " + numeroAleatorio2);
                System.out.println("Ahora cúanto suman estos dos números? ");
                respuesta = sc.nextInt();
        if (fallo == 5) {
                    System.out.println("Se acabó el juego para ti");
                    return;

                }
                
            }
        }
        sc.close();
        
    }
}
    


