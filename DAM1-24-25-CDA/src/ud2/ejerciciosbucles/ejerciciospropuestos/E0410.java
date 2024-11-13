package ud2.ejerciciosbucles.ejerciciospropuestos;

public class E0410 {
    /*public static  aElevadoaNIterativo(double n, double a) {
        a = a * Math.pow(a, n - 1);

    }
        */

    public static String aElevadoaNRecursivo(double a, double n) {
       a = a * Math.pow(a, n - 1);
        if (n > 0) {
            return "a es igual a " + a;
        } else {
           return "Opción no válida";
        }

        
    }
    public static void main(String[] args) {
        System.out.println(aElevadoaNRecursivo(6,7));
       // System.out.println(aElevadoaNIterativo(5, 6));
    }
}
