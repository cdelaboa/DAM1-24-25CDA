package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0214 {

    public static String convertir(int numero) {
        if (numero == 0) {
            return "cero";
        } else if (numero == 1) {
            return "uno";
        } else if (numero == 2) {
            return "dos";
        } else if (numero == 3) {
            return "tres";
        } else if (numero == 4) {
            return "cuatro";
        } else if (numero == 5) {
            return "cinco";
        } else if (numero == 6) {
            return "seis";
        } else if (numero == 7) {
            return "siete";
        } else if (numero == 8) {
            return "ocho";
        } else if (numero == 9) {
            return "nueve";
        } else if (numero == 10) {
            return "diez";
        } else if (numero == 11) {
            return "once";
        } else if (numero == 12) {
            return "doce";
        } else if (numero == 13) {
            return "trece";
        } else if (numero == 14) {
            return "catorce";
        } else if (numero == 15) {
            return "quince";
        } else if (numero < 20) {
            return "dieci" + convertir(numero - 10);
        } else if (numero == 20) {
            return "veinte";
        } else if (numero < 30) {
            return "veinti" + convertir(numero - 20);
        } else if (numero == 30) {
            return "treinta";
        } else if (numero < 40) {
            return "treinta y " + convertir(numero - 30);
        } else if (numero == 40) {
            return "cuarenta";
        } else if (numero < 50) {
            return "cuarenta y " + convertir(numero - 40);
        } else if (numero == 50) {
            return "cincuenta";
        } else if (numero < 60) {
            return "cincuenta y " + convertir(numero - 50);
        } else if (numero == 60) {
            return "sesenta";
        } else if (numero < 70) {
            return "sesenta y " + convertir(numero - 60);
        } else if (numero == 70) {
            return "setenta";
        } else if (numero < 80) {
            return "setenta y " + convertir(numero - 70);
        } else if (numero == 80) {
            return "ochenta";
        } else if (numero < 90) {
            return "ochenta y " + convertir(numero - 80);
        } else if (numero == 90) {
            return "noventa";
        } else if (numero < 100) {
            return "noventa y " + convertir(numero - 90);
        } else {
            return "Número fuera de rango";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero entre 0 y 99: ");
        int numero = scanner.nextInt();
        scanner.close();

        String numeroEnLetras = convertir(numero);
        System.out.println("El número en letras es: " + numeroEnLetras);
    }
}

