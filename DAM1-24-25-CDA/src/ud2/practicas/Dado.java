package ud2.practicas;

/**Alejandro Feijoo Regueira
 * Carlos de la Torre Aboal
**/

public class Dado {

    public static void lanzarDado(int tiro) {
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0, numDistinto = 0;
        double n = 0;
        double prov1, prov2, prov3, prov4, prov5, prov6;

        for (int i = 0; i <= tiro; i++) {
            n = Math.random() * 6;

            if (n < 1) {
                uno = uno + 1;
            } else if (n > 1 && n <= 2) {
                dos = dos + 1;
            } else if (n > 2 && n <= 3) {
                tres = tres + 1;
            } else if (n > 3 && n <= 4) {
                cuatro = cuatro + 1;
            } else if (n > 4 && n <= 5) {
                cinco = cinco + 1;
            } else if (n > 5) {
                seis = seis + 1;
            } else
                numDistinto = numDistinto + 1;
        }
        prov1 = uno * 100.00 / tiro;
        prov2 = dos * 100.00 / tiro;
        prov3 = tres * 100.00 / tiro;
        prov4 = cuatro * 100.00 / tiro;
        prov5 = cinco * 100.00 / tiro;
        prov6 = seis * 100.00 / tiro;



        System.out.printf("EL DADO FUE LANZADO %d VECES, ESTE ES EL RESULTADO: \n", tiro);
        System.out.printf("El número 1 salió %d veces con un porcentaje de %.2f \n", uno, prov1);
        System.out.printf("El número 2 salió %d veces con un porcentaje de %.2f \n", dos, prov2);
        System.out.printf("El número 3 salió %d veces con un porcentaje de %.2f \n", tres, prov3);
        System.out.printf("El número 4 salió %d veces con un porcentaje de %.2f \n", cuatro, prov4);
        System.out.printf("El número 5 salió %d veces con un porcentaje de %.2f \n", cinco, prov5);
        System.out.printf("El número 6 salió %d veces con un porcentaje de %.2f \n", seis, prov6);
    }

    public static void main(String[] args) {
        
        final int NUM_LANZAMIENTOS = 1000;
        lanzarDado(NUM_LANZAMIENTOS);
    }
}
