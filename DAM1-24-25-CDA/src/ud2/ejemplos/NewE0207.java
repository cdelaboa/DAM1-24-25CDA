package ud2.ejemplos;
import java.util.*;
public class NewE0207 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2, num3;

    // Pedir los tres números
    System.out.println("Ingresa el primer número:");
    num1 = sc.nextInt();
    
    System.out.println("Ingresa el segundo número:");
    num2 = sc.nextInt();
    
    System.out.println("Ingresa el tercer número:");
    num3 = sc.nextInt();
    
    sc.close();

    // Ordenar los números de mayor a menor
    int mayor, medio, menor;

    if (num1 >= num2 && num1 >= num3) {
        mayor = num1;
        if (num2 >= num3) {
            medio = num2;
            menor = num3;
        } else {
            medio = num3;
            menor = num2;
        }
    } else if (num2 >= num1 && num2 >= num3) {
        mayor = num2;
        if (num1 >= num3) {
            medio = num1;
            menor = num3;
        } else {
            medio = num3;
            menor = num1;
        }
    } else {
        mayor = num3;
        if (num1 >= num2) {
            medio = num1;
            menor = num2;
        } else {
            medio = num2;
            menor = num1;
        }
    }

    // Mostrar los números ordenados de mayor a menor
    System.out.println("Los números ordenados de mayor a menor son: " + mayor + "> " + medio + "> " + menor);
}
}

