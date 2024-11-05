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
        int respuesta;

        System.out.println("Aquí tienes tu primer número " + num);
        System.out.println("Y aquí el segundo " + num);
        System.out.println("Ahora cúanto suman estos dos números? ");
        respuesta = sc.nextInt();
            sc.close();
        do{
        System.out.println("Ahora súmale este" + num);
        respuesta = sc.nextInt();
            System.out.println("Has acertado, continúas...");
            acierto++;      
        } while (respuesta == suma);
     
    
    System.out.println("Has fallado, tu número de aciertos es " + acierto);

  }
}
}
      


