package ud2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionTiposEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        try {
            int n;
            System.out.println("Escribe un número");
            n = sc.nextInt();
            sc.close();
            System.out.println(n);
        } catch (InputMismatchException e) {
            System.out.println("Debes introducir un número");
            System.out.println(e.toString());
        }

    }
}
