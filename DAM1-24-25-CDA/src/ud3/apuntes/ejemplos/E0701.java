package ud3.apuntes.ejemplos;

public class E0701 {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("Carlos", "5454545");
        cc.mostrarInformacion();

        cc.ingresarDinero(200);
        cc.mostrarInformacion();

        
        System.out.println(cc.sacarDinero(200));
        cc.mostrarInformacion();

        cc.ingresarDinero(-200);
        cc.mostrarInformacion();
    }
}