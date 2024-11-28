package ud2.CDAexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

// CARLOS DE LA TORRE ABOAL
public class DuracionBombillas {

    public static String causaFinBombilla(int numHorasEncendido, int numEncendidos, int numHorasEstimacionEncendido) {
        String causaFinBombilla = "";
        if (numHorasEncendido > 0 && numEncendidos > 0 && numHorasEstimacionEncendido <= 10
                && numHorasEstimacionEncendido > 0) {
            if (numEncendidos * numHorasEstimacionEncendido > numHorasEncendido) 
                causaFinBombilla = "HORAS";
            else if (numEncendidos * numHorasEstimacionEncendido < numHorasEncendido)
                causaFinBombilla = "ENCENDIDOS";
            else if (numEncendidos * numHorasEstimacionEncendido == numHorasEncendido)
                causaFinBombilla = "ENCENDIDOS + HORAS";
        } else {
            causaFinBombilla = "ERROR";
        }
        return causaFinBombilla;

    }

    @Test
    public void causaFinBombillaTest() {
        assertEquals("ERROR", causaFinBombilla(100, 100, 100));
        assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
        assertEquals("ERROR", causaFinBombilla(0, 10, 10));
        assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
        assertEquals("ENCENDIDOS", causaFinBombilla(500, 400, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 10000, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
        assertEquals("HORAS", causaFinBombilla(2000, 700, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(2000, 600, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 9));
        assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
    }

}
