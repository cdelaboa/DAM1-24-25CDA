package ud2.ejerciciosbucles;

import java.util.*;

public class E0303_NumeroSecreto {
    public static void main(String[] args) {
        //Juego Número Secreto
        Scanner sc = new Scanner(System.in);

        Random random = new Random();                    
        int nummRandom = random.nextInt(100);
        int num = 0;
        System.out.println("Dime un número");
        num =sc.nextInt();
        int intento = 0;
       

        while (num!=nummRandom) {
            if (nummRandom > num) {
                if (num == -1) {
                    System.out.println("Respuesta incorrecta, te has rendido");
                    System.out.println("El número secreto era: " + nummRandom);
                    sc.close();
                    return;
                }
                System.out.println("El número es mayor");
                intento = intento + 1;                
            } else {
                System.out.println("El número es menor");
                intento = intento + 1;   
            }
            System.out.println("Dime otro número");
            num = sc.nextInt();
            if (num == nummRandom) {
                System.out.println("Enhorabuena, has acertado el número");
                System.out.printf("Te ha costado %d intentos", intento);
            }
        }
        sc.close();
        
    }
}