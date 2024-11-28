package ud3.ejerciciosclases;

public class EcuacionSegundoGrado {
    // DATOS
    double a, b, c;

    // CONSTRUCTOR
    public EcuacionSegundoGrado() {

    }

    public EcuacionSegundoGrado (double a, double b, double c) {
        a = 1;
        b = 2;
        c = 1;
    }

    //MÉTODO

    public String solucionEcuacion (double a, double b, double c) {
      
        double ecuacion1 = (Math.pow(-b, 2) + Math.sqrt(b - (4 * a * c))) / (a * 2);
        double ecuacion2 = (Math.pow(-b, 2) - Math.sqrt(b - (4 * a* c))) / (a * 2);
        String msj = "Las soluciones para esta ecuación de segundo grado son: " + ecuacion1 + "\n" + ecuacion2;
        return msj;
        
    }



    public boolean discriminanteComprobacion (double a, double b, double c) {
        if (b - (4 * a * c) > 0)
        return true;
        else
        return false;
    }

}
