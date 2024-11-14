package ud2.ejercicioscondicionales;

import java.util.*;

public class EP0214_ConvertirNumLetras {

   public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        System.out.println("Introduce un número entero entre 0 y 99: ");
        numero = scanner.nextInt();

        String numeroEnLetras = convertir(numero);
        System.out.println("El número en letras es: " + numeroEnLetras);

        scanner.close();
    }

        public static String convertir(int numero) {
        Scanner scanner = new Scanner(System.in);
            
        if (numero == 0) {
            scanner.close();

            return "cero";
        } else if (numero == 1) {
            scanner.close();

            return "uno";
        } else if (numero == 2) {
            scanner.close();

            return "dos";
        } else if (numero == 3) {
            scanner.close();

            return "tres";
        } else if (numero == 4) {
            scanner.close();

            return "cuatro";
        } else if (numero == 5) {
            scanner.close();

            return "cinco";
        } else if (numero == 6) {
            scanner.close();

            return "seis";
        } else if (numero == 7) {
            scanner.close();

            return "siete";
        } else if (numero == 8) {
            scanner.close();

            return "ocho";
        } else if (numero == 9) {
            scanner.close();

            return "nueve";
        } else if (numero == 10) {
            scanner.close();

            return "diez";
        } else if (numero == 11) {
            scanner.close();

            return "once";
        } else if (numero == 12) {
            scanner.close();

            return "doce";
        } else if (numero == 13) {
            scanner.close();

            return "trece";
        } else if (numero == 14) {
            scanner.close();

            return "catorce";
        } else if (numero == 15) {
            scanner.close();

            return "quince";
        } else if (numero < 20) {
            scanner.close();

            return "dieci" + convertir(numero - 10);
        } else if (numero == 20) {
            scanner.close();

            return "veinte";
        } else if (numero < 30) {
            scanner.close();

            return "veinti" + convertir(numero - 20);
        } else if (numero == 30) {
            scanner.close();

            return "treinta";
        } else if (numero < 40) {
            scanner.close();

            return "treinta y " + convertir(numero - 30);
        } else if (numero == 40) {
            scanner.close();

            return "cuarenta";
        } else if (numero < 50) {
            scanner.close();

            return "cuarenta y " + convertir(numero - 40);
        } else if (numero == 50) {
            scanner.close();

            return "cincuenta";
        } else if (numero < 60) {
            scanner.close();

            return "cincuenta y " + convertir(numero - 50);
        } else if (numero == 60) {
            scanner.close();

            return "sesenta";
        } else if (numero < 70) {
            scanner.close();

            return "sesenta y " + convertir(numero - 60);
        } else if (numero == 70) {
            scanner.close();

            return "setenta";
        } else if (numero < 80) {
            scanner.close();

            return "setenta y " + convertir(numero - 70);
        } else if (numero == 80) {
            scanner.close();

            return "ochenta";
        } else if (numero < 90) {
            scanner.close();

            return "ochenta y " + convertir(numero - 80);
        } else if (numero == 90) {
            scanner.close();

            return "noventa";
        } else if (numero < 100) {
            scanner.close();
            scanner.close();
            return "noventa y " + convertir(numero - 90);
        } else {
            scanner.close();

            return "Número fuera de rango";
        }
    }
}

