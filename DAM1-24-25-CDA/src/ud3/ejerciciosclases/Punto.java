package ud3.ejerciciosclases;

public class Punto {
    private double x = 1.5;
    private double y = 2.6;
    
    //CONSTRUCTOR

    Punto (double x, double y) {

    }

    //MÉTODOS

    public void desplazaX (double dx) {
        x += dx;
    }

    public void desplazaY(double dy) {
        y += dy;
    }

    public void desplaza (double dx, double dy) {
        x += dx;
        y += dy;
    }

   /*  public double distanciaEuclidea (Punto otro) {
    
    } */

    public void muestra () {
        System.out.println("(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Punto punto = new Punto(1.5, 2.6);
        punto.muestra();
        punto.desplazaX(1);
        punto.desplazaY(3);

        punto.muestra();

    }
}
