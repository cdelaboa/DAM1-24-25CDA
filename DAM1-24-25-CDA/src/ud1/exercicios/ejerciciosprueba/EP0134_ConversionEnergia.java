package ud1.exercicios.ejerciciosprueba;

import java.util.Scanner;


public class EP0134_ConversionEnergia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Constantes de conversión
        final double J_CAL = 4.184;
        final double J_KWH = 3600000.0;

        // Variables para la energía de origen y el resultado de la conversión
        double energiaOrigen, energiaDestino;

        // Solicitar al usuario la cantidad de energía y la unidad de origen
        System.out.println("Introduce la cantidad de energía:");
        energiaOrigen = sc.nextDouble();
        sc.nextLine(); // Limpiar el buffer

        System.out.println("Introduce la unidad de energía de origen (J = julios, C = calorías, K = kilovatios-hora):");
        char unidadOrigen = sc.nextLine().toUpperCase().charAt(0); // Convertimos a mayúsculas

        System.out.println("Introduce la unidad de energía de destino (J = julios, C = calorías, K = kilovatios-hora):");
        char unidadDestino = sc.nextLine().toUpperCase().charAt(0); // Convertimos a mayúsculas

        sc.close();

        // Convertir la energía a julios si la unidad de origen no es julios
        double energiaEnJulios = unidadOrigen == 'J' ? energiaOrigen
                                : unidadOrigen == 'C' ? energiaOrigen * J_CAL
                                : unidadOrigen == 'K' ? energiaOrigen * J_KWH
                                : 0;

        // Convertir la energía en julios a la unidad de destino
        energiaDestino = unidadDestino == 'J' ? energiaEnJulios
                     : unidadDestino == 'C' ? energiaEnJulios / J_CAL
                     : unidadDestino == 'K' ? energiaEnJulios / J_KWH
                     : 0;

                     long energiaRedondeada = Math.round(energiaDestino);
                  

            // Mostrar el resultado de la conversión
            String unidadDestinoTexto = unidadDestino == 'J' ? "julios"
                                    : unidadDestino == 'C' ? "calorías"
                                    : "kilovatios-hora";

            System.out.printf("La cantidad de energía convertida es: %d %s %n", energiaRedondeada, unidadDestinoTexto);
     
        }
    }
