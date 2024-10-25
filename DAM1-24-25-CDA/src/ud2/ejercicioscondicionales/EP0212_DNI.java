package ud2.ejercicioscondicionales;

import java.util.*;

public class EP0212_DNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Con este programa acertaré la letra de tu DNI solamente diciéndome el tu número...");
        System.out.println("Entonces dime cual es tu número de DNI");
        int numDNI = sc.nextInt();
        sc.close();

        int letra = numDNI % 23;

        switch (letra) {
            case 0:
                System.out.println("La letra es la T");
                break;
            case 1:
                System.out.println("La letra es la R");
                break;
            case 2:
                System.out.println(" Entonces, la letra es la W");
                break;
            case 3:
                System.out.println(" La letra es la A");
                break;
            case 4:
                System.out.println(" La letra es la G");
                break;
            case 5:
                System.out.println(" La letra es la M");
                break;
            case 6:
                System.out.println(" La letra es la Y");
                break;
            case 7:
                System.out.println(" La letra es la F");
                break;
            case 8:
                System.out.println(" La letra es la P");
                break;
            case 9:
                System.out.println(" La letra es la D");
                break;
            case 10:
                System.out.println(" La letra es la X");
                break;
            case 11:
                System.out.println(" La letra es la B");
                break;
            case 12:
                System.out.println(" La letra es la N");
                break;
            case 13:
                System.out.println(" La letra es la J");
                break;
            case 14:
                System.out.println(" La letra es la Z");
                break;
            case 15:
                System.out.println(" La letra es la S");
                break;
            case 16:
                System.out.println(" La letra es la Q");
                break;
            case 17:
                System.out.println(" La letra es la V");
                break;
            case 18:
                System.out.println(" La letra es la H");
                break;
            case 19:
                System.out.println(" La letra es la L");
                break;
            case 20:
                System.out.println(" La letra es la C");
                break;
            case 21:
                System.out.println(" La letra es la K");
                break;
            case 22:
                System.out.println(" La letra es la E");
                break;
            default:
                System.out.println(" No válido");
                break;
        }
        System.out.println(" He acertado?");

    }

}
