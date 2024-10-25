package ud2.ejercicioscondicionales;
import java.util.*;
public class EP0215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largo, ancho;
        System.out.println("Dame las medidas del triángulo");
        System.out.println("Primero largo ");
        largo = sc.nextInt();
        System.out.println("Ahora el ancho ");
        ancho = sc.nextInt();
        sc.close();


        //PROCESO
        int area = largo * ancho;
        if(largo< 0 && ancho < 0) {
            System.out.println("No seas así, vuelve a iniciar el programa");
        } else {
            System.out.println("El área de tu triángulo es de: " + area + "metros cuadrados");
        }
        

        }
}

