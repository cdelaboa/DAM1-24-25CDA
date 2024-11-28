package ud2.practicas;

/**Alejandro Feijoo Regueira
 * Carlos de la Torre Aboal
**/
import java.util.Scanner;

import org.junit.Test;

public class Radar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int respuesta = 0;
        do {
            System.out.println("MENU: ");
            System.out.println("1. Control Velocidad");
            System.out.println("2. Multa Correspondiente");
            System.out.println("3. Radar Tramo Fijo");
            System.out.println("0. SALIR");
            respuesta = sc.nextInt();

            if (respuesta < 0 || respuesta > 3) {
                System.out.println("Respuesta no válida.");
                continue;
            } else if (respuesta == 0) {
                System.out.println("Fin del programa");
                System.out.println("Hasta luego.");

            } else if (respuesta == 1) {
                System.out.println("Dígame la distancia del tramo (en kilómetros): ");
                int distancia = sc.nextInt();
                System.out.println("Ahora dígame el tiempo que tardó en recorrer el espacio(en segundos): ");
                int tiempo = sc.nextInt();
                System.out.println("Y por último el límite de velocidad(en Km/h): ");
                int velocidad = sc.nextInt();
                System.out.println(excesoVelocidade(distancia, tiempo, velocidad));
            } else if (respuesta == 2) {
                System.out.println("Entrégame el límite de velocidad en la zona(en Km/h): ");
                int limite = sc.nextInt();
                System.out.println("Ahora entrégame el exceso de velocidad del vehículo (en Km/h): ");
                int excesoVelo = sc.nextInt();
                System.out.println(multaInfraccion(limite, excesoVelo));
            } else if (respuesta == 3) {
                System.out.println("Entrégame el tiempo que tardó en recorrer el tramo (en segundos): ");
                int tiempo = sc.nextInt();
                final int DISTANCIA = 10;
                final int LIMITE = 120;
                int excesoVelocidad = excesoVelocidade(DISTANCIA, tiempo, LIMITE);
                int multa = multaInfraccion(LIMITE, excesoVelocidad);
                if (multa == 0) {
                    System.out.println("Velocidade dentro do límite");
                } else {
                    System.out.println("Infracción por exceso de velocdade!! Multa de " + multa + " €");
                }
            }
            
        } while (respuesta > 3 || respuesta < 0);
        sc.close();
    }

    public static int excesoVelocidade(double dist, int tempo, int limite) {
        int exceso = 0;
        double tiempo = (tempo * 0.01) / 36;
        double kmHoras = dist / tiempo;
        if (kmHoras <= limite) {
            exceso = 0;
        } else {
            exceso = (int) (kmHoras - limite);
        }
        return exceso;

    }

    public static int multaInfraccion(int limite, double excesoVelocidade) {
        int multa;
        switch (limite) {
            case 20, 30, 40, 50:
                if (excesoVelocidade >= 1 && excesoVelocidade <= 20) {
                    multa = 100;
                } else if (excesoVelocidade >= 21 && excesoVelocidade <= 30) {
                    multa = 300;
                } else if (excesoVelocidade >= 31 && excesoVelocidade <= 40) {
                    multa = 400;
                } else if (excesoVelocidade >= 41 && excesoVelocidade <= 50) {
                    multa = 500;
                } else if (excesoVelocidade >= 51) {
                    multa = 600;
                } else {
                    multa = 0;
                }
                break;
            case 60, 70, 80, 90, 100, 110, 120:
                if (excesoVelocidade >= 1 && excesoVelocidade <= 30) {
                    multa = 100;
                } else if (excesoVelocidade >= 31 && excesoVelocidade <= 50) {
                    multa = 300;
                } else if (excesoVelocidade >= 51 && excesoVelocidade <= 60) {
                    multa = 400;
                } else if (excesoVelocidade >= 61 && excesoVelocidade <= 70) {
                    multa = 500;
                } else if (excesoVelocidade >= 71) {
                    multa = 600;
                } else {
                    multa = 0;
                }
                break;

            default:
                multa = 0;
                break;

        }
        return multa;
    }

    @Test
    public void excesoVelocidadTest() {
        assert excesoVelocidade(10, 600, 60) == 0;
        assert excesoVelocidade(10, 600, 50) == 10;
        assert excesoVelocidade(10, 600, 30) == 30;
        assert excesoVelocidade(15, 300, 120) == 60;
        assert excesoVelocidade(15, 300, 90) == 90;
        assert excesoVelocidade(10, 300, 120) == 0;
        assert excesoVelocidade(10, 300, 90) == 30;
    }

    @Test
    public void multaInfraccionTest() {
        assert multaInfraccion(20, 0) == 0;
        assert multaInfraccion(20, 15) == 100;
        assert multaInfraccion(30, 21) == 300;
        assert multaInfraccion(40, 31) == 400;
        assert multaInfraccion(50, 50) == 500;
        assert multaInfraccion(50, 51) == 600;
        assert multaInfraccion(60, 0) == 0;
        assert multaInfraccion(70, 30) == 100;
        assert multaInfraccion(80, 31) == 300;
        assert multaInfraccion(90, 51) == 400;
        assert multaInfraccion(100, 61) == 500;
        assert multaInfraccion(110, 71) == 600;
        assert multaInfraccion(120, 1) == 100;
    }
}
