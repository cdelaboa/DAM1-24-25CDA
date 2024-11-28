package ud2.practicas;

/**Alejandro Feijoo Regueira
 * Carlos de la Torre Aboal
**/

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class IMC {
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
                    System.out.println("Por favor, introduce un valor numérico válido para el peso.");
                }
            } catch (NumberFormatException e) {}
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
                    System.out.println("Por favor, introduce un valor numérico válido para la altura.");
                }
            } catch (NumberFormatException e) {}
        }

        // Calcular y mostrar el IMC
        double IMC = imc(kg, cm);
        
            System.out.printf("Tu IMC es: %.2f%n", IMC);
        sc.close();
        }
    
        @Test
    void testImc() {
        // Definir casos de prueba y sus resultados esperados

        // Caso 1: Peso 70 kg, Altura 170 cm
        double resultadoCaso1 = imc(70, 170);
        assertEquals(24.22, resultadoCaso1, 0.01);

        // Caso 2: Peso 90 kg, Altura 185 cm
        double resultadoCaso2 = imc(90, 185);
        assertEquals(26.30, resultadoCaso2, 0.01);

        // Caso 3: Peso 60 kg, Altura 160 cm
        double resultadoCaso3 = imc(60, 160);
        assertEquals(23.44, resultadoCaso3, 0.01);

        double resultadoCaso4 = imc(45, 160);
        assertEquals(17.578, resultadoCaso4, 0.01);

        double resultadoCaso5 = imc(65, 165);
        assertEquals(23.875, resultadoCaso5, 0.01);

        double resultadoCaso6 = imc(100, 175);
        assertEquals(32.653, resultadoCaso6, 0.01);

        double resultadoCaso7 = imc(99.98, 200);
        assertEquals(24.995, resultadoCaso7, 0.01);
    }

}

