package ud3.ejerciciosclases;

public class Punto {
    private double x;
    private double y;
    
    //CONSTRUCTOR

    Punto (double x, double y) {
        this.x = x;
        this.y = y;
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

   
    public double distanciaEuclidea(Punto otro) {
        double distanciaEuclidea = Math.sqrt((Math.pow((x-otro.x), 2) + Math.pow((y-otro.y), 2)));
        return distanciaEuclidea;
        
    }

    public void muestra () {
        System.out.println("(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Punto punto = new Punto(1.5, 2.6);
        punto.muestra();
        punto.desplazaX(1);
        punto.desplazaY(3);
        punto.muestra();

        Punto punto2 = new Punto(1.5, 3.0);
        punto2.muestra();
       System.out.print(punto.distanciaEuclidea(punto2));
        

    }
}
