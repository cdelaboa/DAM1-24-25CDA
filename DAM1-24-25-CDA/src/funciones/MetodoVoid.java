package ud2.funciones;

import java.util.Scanner;

public class MetodoVoid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.print("Introduce cadena de texto: ");
        cadena = sc.nextLine();
        System.out.println("Ahora dime el carácter que quieres utilizar para bordear el mensaje ");
        String ch = sc.nextLine();
        sc.close();
        cajaTexto(cadena, ch); // llamada al método
    }

    // método que muestra un String rodeado por un borde
    public static void cajaTexto(String str, String ch) {
        int n = str.length(); // longitud del String
        
        imprimirLinea(n, ch);
        System.out.println(ch + " " + str + " " + ch); // cadena con un borde en cada lado
        imprimirLinea(n, ch);
    }

    public static void imprimirLinea(int n, String ch) {
        for (int i = 1; i <= n + 4; i++) { // borde de arriba
            System.out.print(ch);
        }
        System.out.println();
 }
}

