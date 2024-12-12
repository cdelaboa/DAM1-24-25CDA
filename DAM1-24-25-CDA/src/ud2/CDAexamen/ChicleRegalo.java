package ud2.CDAexamen;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

//CARLOS DE LA TORRE ABOAL
public class ChicleRegalo {

    public static int totalChicles(int comprados, int envoltoriosPorChicle, int chiclesGratis) {
        // Validaciones iniciales
        if (comprados < 0 || envoltoriosPorChicle < 0 || chiclesGratis < 0) {
            return -1; // Error: parámetros negativos
        }

        if (envoltoriosPorChicle == 0) {
            return comprados; // No hay oferta
        }

        if (chiclesGratis >= envoltoriosPorChicle) {
            return -1; // Error: no tiene sentido la oferta
        }

        // Lógica para calcular el total de chicles
        int totalChicles = comprados; // Comenzamos con los chicles comprados
        int envoltorios = comprados; // Inicialmente tenemos un envoltorio por cada chicle comprado

        // Mientras se puedan canjear envoltorios por chicles gratis
        while (envoltorios >= envoltoriosPorChicle) {
            int nuevosChicles = (envoltorios / envoltoriosPorChicle) * chiclesGratis; // Chicles gratis obtenidos
            totalChicles += nuevosChicles; // Sumamos los nuevos chicles al total
            envoltorios = (envoltorios % envoltoriosPorChicle) + nuevosChicles; // Actualizamos envoltorios
        }

        return totalChicles;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        System.out.println(totalChicles(25, 5, 1)); // Debe devolver 31
        System.out.println(totalChicles(10, 3, 1)); // Otro ejemplo
        System.out.println(totalChicles(15, 4, 2)); // Otro ejemplo
        System.out.println(totalChicles(25, 0, 1)); // Sin oferta: 25
        System.out.println(totalChicles(25, 5, 5)); // Error: -1
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
