package ud2.CDAexamen;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

//CARLOS DE LA TORRE ABOAL
public class ChicleRegalo {
    public static void main(String[] args) {
        System.out.println(totalChicles(20, 2, 5));
    }

    public static int totalChicles(int numChiclesComprados, int numEnvoltoriosADevolver, int numChiclesGratis) {
        int totalChicles = numChiclesComprados;
        if (numChiclesComprados > 0 && numEnvoltoriosADevolver > 0 && numChiclesGratis > 0
                && numEnvoltoriosADevolver != 0) {
            if (numEnvoltoriosADevolver > numChiclesGratis) {
                System.out.println("Hay oferta");
                totalChicles = (numChiclesComprados + (numChiclesComprados / numEnvoltoriosADevolver)
                        + numChiclesGratis);
            } else {
                System.out.println("No hay oferta");
            }

        } else {
            System.out.println("-1");
        }
        return totalChicles;

    }
    @Test
    public void ChiclesRegaloTest() {
    assertEquals(31, totalChicles(25, 5, 1));
    assertEquals(6, totalChicles(5, 5, 1));
    assertEquals(111, totalChicles(100, 10, 1));
    assertEquals(-1, totalChicles(20, 2, 5));
    assertEquals(-1, totalChicles(10, -1, 0));
    assertEquals(-1, totalChicles(-1, 2, 1));
    assertEquals(-1, totalChicles(10, 1, -1));
    assertEquals(-1, totalChicles(20, 2, 2));
    assertEquals(10, totalChicles(7, 3, 1));
    assertEquals(40, totalChicles(27, 3, 1));
    assertEquals(21, totalChicles(11, 2, 1));
    assertEquals(31, totalChicles(16, 2, 1));
    assertEquals(100, totalChicles(100, 0, 0));
    assertEquals(100, totalChicles(100, 0, 1));
    assertEquals(0, totalChicles(0, 0, 1));
    assertEquals(0, totalChicles(0, 2, 1));
    }
}
