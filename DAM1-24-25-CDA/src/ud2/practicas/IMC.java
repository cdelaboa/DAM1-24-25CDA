package ud2.practicas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

// CARLOS DE LA TORRE ABOAL
public class IMC {
    public static void main(String[] args) {
        System.out.println(imc(70, 170));
    }

    /*
     * 
     * public static double imc(double kg, double cm) {
     * double alturaMetros = cm /100;
     * double imc;
     * boolean comprobar = false;
     * while (comprobar)
     * try {
     * imc = kg / Math.pow(alturaMetros, 2);
     * System.out.println(clasificacion(imc));
     * 
     * } catch (IllegalArgumentException e) {
     * System.out.println("Valores no correctos");
     * System.out.println(e.toString());
     * }
     * 
     * return imc;
     * }
     * 
     * public static String clasificacion(double imc) {
     * String clasificacion = "";
     * 
     * if (imc < 18.50)
     * clasificacion = "Bajo Peso";
     * else if (imc > 18.50 && imc < 24.99)
     * clasificacion = "Normal";
     * else if (imc >= 25.00)
     * clasificacion = "Sobrepeso";
     * else if (imc >= 30.00)
     * clasificacion = "Obesidad";
     * else
     * clasificacion = "No válido";
     * return clasificacion;
     * }
     */
    public static double imc(double kg, double cm) {
        Scanner sc = new Scanner(System.in);
       
        double imc = 0;
        double alturaEnMetros = cm / 100;
        imc = kg / Math.pow(alturaEnMetros, 2);
        boolean comprobar = false;
        while (comprobar) {
            try {
                if ((kg >= 20 && kg <= 300) && (cm >= 50 && cm <= 250)) {
                     break;// Peso válido, salir del bucle
                } else {
                    System.out.println("El peso debe estar entre 20 y 300 kg y la altura entre 50 y 250");
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido para el peso y la altura");
                sc.nextLine();
            }
        }

        

        if (imc < 18.50)
            System.out.println("Bajo Peso");
        else if (imc > 18.50 && imc < 24.99)
            System.out.println("Normal");
        else if (imc >= 25.00)

            System.out.println("Sobrepeso");
        else if (imc >= 30.00)

            System.out.println("Obesidad");

        else
            System.out.println("No válido");

        return imc;

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

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public boolean isComprobar() {
        return comprobar;
    }

    public void setComprobar(boolean comprobar) {
        this.comprobar = comprobar;
    }

    public double getAlturaEnMetros() {
        return alturaEnMetros;
    }

    public void setAlturaEnMetros(double alturaEnMetros) {
        this.alturaEnMetros = alturaEnMetros;
    }
}
