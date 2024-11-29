package ud2.ejemplos;

//Programa que pide dos números y un operador y muestra el resultado de la operación
import java.util.*;
import java.io.*;

public class Ejemplo3Switch {
    public static void main(String[] args) throws IOException {
        int a, b, Resultado = 0;
        char operador;
        boolean calculado = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero: ");
        a = sc.nextInt();
        System.out.print("Introduzca otro numero entero: ");
        b = sc.nextInt();
        System.out.print("Introduzca un operador (+,-,*,/): ");
        operador = (char) System.in.read();
       //sc.nextLine();
       // operador = sc.nextLine().charAt(0);
       sc.close();
        switch (operador) {
            case '-':
                Resultado = a - b;
                break;
            case '+':
                Resultado = a + b;
                break;
            case '*':
                Resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    Resultado = a / b;
                } else {
                    System.out.println("\nNo se puede dividir por cero");
                    calculado = false;
                }
                break;
            default:
                System.out.println("\nOperador no valido");
                calculado = false;
        }
        if (calculado) {
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}
