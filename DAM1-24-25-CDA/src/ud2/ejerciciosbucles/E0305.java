package ud2.ejerciciosbucles;

import java.util.*;

public class E0305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);  // Generar un número aleatorio entre 0 y 99
    
        int suma = num + num;
        int acierto = 0;
        int fallo = 0;
        int respuesta;

        System.out.println("Aquí tienes tu primer número " + num);
        System.out.println("Y aquí el segundo " + num);
        System.out.println("Ahora cúanto suman estos dos números? ");
        respuesta = sc.nextInt();

        do{
        System.out.println("Ahora súmale a este" + num);
        respuesta = sc.nextInt();
            System.out.println("Has acertado, continúas...");
            acierto++;      
        } while (respuesta == suma);
     
    
    System.out.println("Has fallado, tu número de aciertos es " + acierto);

  }
}
}
        /* 
        if (respuesta == suma) {
            System.out.println("Es correcto");
        } else {
            System.out.println("No es correcto");
            System.out.println("Prueba otra vez");
        }
            */
        /*while (respuesta == suma) {
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
 */
             
    


