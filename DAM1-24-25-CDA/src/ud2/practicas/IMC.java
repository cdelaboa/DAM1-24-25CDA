package ud2.practicas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

// CARLOS DE LA TORRE ABOAL
public class IMC {
public static void main(String[] args) {
    System.out.println(imc(70, 170));
    
}

    public static double imc(double kg, double cm) {
        Scanner sc = new Scanner(System.in);
        double imc = 0;
        boolean comprobar = false;
        while (comprobar)
            while (true) {
                try {
                    if (kg >= 20 && kg <= 300 && cm >= 50 && cm<= 250) {
                        break; // Peso válido, salir del bucle
                    } else {
                        System.out.println("El peso debe estar entre 20 y 300 kg y la altura entre ");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, introduce un número válido para el peso y la altura");
                }
            }
          
            double alturaEnMetros = cm / 100; 

            if (imc < 18.50) {
            imc = kg / Math.pow(alturaEnMetros, 2);
            String clasificacion = "Bajo Peso";
            }else if (imc > 18.50 && imc < 24.99) {
        imc = kg / Math.pow(alturaEnMetros, 2);
            String clasificacion = "Normal";
        }else if (imc >= 25.00) {
        imc = kg / Math.pow(alturaEnMetros, 2);
            String clasificacion = "Sobrepeso";
        }else if (imc >= 30.00) {
            imc = kg / Math.pow(alturaEnMetros, 2);
            String clasificacion = "Obesidad";
        }else
            String  clasificacion = "No válido";
            return imc;
            
    }
        
            
        
            /* Validación de la altura
            while (true) {
                try {
                    
                    if (cm >= 50 && cm<= 250) {
                        break; // Altura válida, salir del bucle
                    } else {
                        System.out.println("La altura debe estar entre 50 y 250 cm.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, introduce un número válido para la altura.");
                }
            }
           // Convertir altura a metros
            imc = kg / Math.pow(cm, 2); */ 
            

       
    

    public static String clasificacion(double imc) {
        String clasificacion = "";

        if (imc < 18.50)
            clasificacion = "Bajo Peso";
        else if (imc > 18.50 && imc < 24.99)
            clasificacion = "Normal";
        else if (imc >= 25.00)
            clasificacion = "Sobrepeso";
        else if (imc >= 30.00)
            clasificacion = "Obesidad";
        else
            clasificacion = "No válido";
        return clasificacion;
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

