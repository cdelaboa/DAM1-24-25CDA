package ud2.CDAexamen;

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

}
