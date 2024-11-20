package ud2.CDAexamen;

// CARLOS DE LA TORRE ABOAL
public class DuracionBombillas {

    public static void main(String[] args) {
        causaFinBombilla(1000, -10, 10);
    }

    public static String causaFinBombilla(int numHorasEncendido, int numEncendidos, int numHorasEstimacionEncendido) {
        String causaFinBombilla = "";
        if (numHorasEncendido > 0 && numEncendidos > 0 && numHorasEstimacionEncendido <= 10
                && numHorasEstimacionEncendido > 0) {
            if (numEncendidos * numHorasEstimacionEncendido > numHorasEncendido) {
                System.out.println("HORAS");
            } else if (numEncendidos * numHorasEstimacionEncendido < numHorasEncendido)
                System.out.println("ENCENDIDOS");
            else if (numEncendidos * numHorasEstimacionEncendido == numHorasEncendido)
                System.out.println("ENCENDIDOS + HORAS");
        } else {
            System.out.println("ERROR");

        }
        return causaFinBombilla;

    }

}
