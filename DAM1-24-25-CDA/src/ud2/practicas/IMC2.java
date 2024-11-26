package ud2.practicas;

import java.util.Scanner;

public class IMC2 {
public static double imc(double kg, double cm) {
        // Validar rango de peso y altura
        if (kg < 20 || kg > 300 || cm < 50 || cm > 250) {
            System.out.println("El peso debe estar entre 20 y 300 kg y la altura entre 50 y 250 cm.");
            return -1; // Indicador de error
        }

        // Convertir altura a metros y calcular el IMC
        double alturaEnMetros = cm / 100;
        double imc = kg / Math.pow(alturaEnMetros, 2);

        // Clasificación del IMC
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc < 25) { // ya incluye <= 24.99
            System.out.println("Normal");
        } else if (imc < 30) { // ya incluye <= 29.99
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }

        return imc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kg = 0, cm = 0;

        // Solicitar el peso validando entrada
        while (true) {
            try {
                System.out.println("Introduce tu peso en kg:");
                kg = Double.parseDouble(sc.nextLine()); // Convertir entrada
                if (kg >= 20 && kg <= 300) {
                    break; // Salir del bucle si el peso es válido
                } else {
                    System.out.println("El peso debe estar entre 20 y 300 kg.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un valor numérico válido para el peso.");
            }
        }

        // Solicitar la altura validando entrada
        while (true) {
            try {
                System.out.println("Introduce tu altura en cm:");
                cm = Double.parseDouble(sc.nextLine()); // Convertir entrada
                if (cm >= 50 && cm <= 250) {
                    break; // Salir del bucle si la altura es válida
                } else {
                    System.out.println("La altura debe estar entre 50 y 250 cm.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un valor numérico válido para la altura.");
            }
        }

        // Calcular y mostrar el IMC
        double resultadoIMC = imc(kg, cm);
        if (resultadoIMC != -1) {
            System.out.printf("Tu IMC es: %.2f%n", resultadoIMC);
        }
    }
}

