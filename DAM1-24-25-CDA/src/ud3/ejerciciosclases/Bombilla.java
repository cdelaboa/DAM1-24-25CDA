package ud3.ejerciciosclases;

public class Bombilla {
    // DATOS

    private boolean interruptor;

    private static boolean interruptorGeneral;

    // CONSTRUCTOR

    Bombilla() {

    }

    // MÉTODOS

    public boolean estado() {
        return interruptor && interruptorGeneral;
    }

    public static boolean estado(Bombilla b2) {
        return b2.interruptor && interruptorGeneral;
    }

    public void apagarBombilla() {
        interruptor = false;
    }

    public void encenderBombilla() {
        interruptor = true;
    }

    public static void encenderInterruptor() {
        interruptorGeneral = true;
    }

    public static void apagarInterruptor() {
        interruptorGeneral = false;
    }

    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        Bombilla b3 = new Bombilla();

        
        b3.estado();
        b3.apagarBombilla();
        b1.apagarBombilla();

        b1.estado();
        b1.encenderBombilla();
        b1.estado();

        b2.apagarBombilla();

    }

}
