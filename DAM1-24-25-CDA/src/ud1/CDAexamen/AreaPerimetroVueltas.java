package ud1.CDAexamen;
// Carlos de la Torre
import java.util.Scanner;
public class AreaPerimetroVueltas {
public static void main(String[] args) {
    double largo;
    double ancho;
    
    Scanner sc =new Scanner(System.in);
    System.out.println(" Dime el largo de la figura (en metros)");
    largo =sc.nextDouble();
    System.out.println(" Ahora dime el ancho de la figura (en metros)");
    ancho =sc.nextDouble();
    
    double radio = ancho / 2;
    double perimetroTotal;
    double perimetroCirculo = 2 * Math.PI * radio;
    double perimetroRectangulo = 2 * largo + 2 * ancho;
    perimetroTotal = perimetroCirculo + perimetroRectangulo;
    
    double areaTotal;
    double areaCirculo = Math.PI * Math.pow(radio, 2);
    double areaRectangulo = largo * ancho;
    areaTotal = areaCirculo + areaRectangulo;

    System.out.println(" Por lo cual el área de la figura es de: " + areaTotal + " y el perímetro es de %.2f: " + perimetroTotal);

    double numVueltas =21097 / perimetroTotal  ;
    double metrosSobrantes = 21097 % perimetroTotal ;

    System.out.printf(" Tendrás que dar %.2f %n vueltas", numVueltas);
    sc.nextLine();
    System.out.printf(" Y te faltarán  %.2f  %n ", metrosSobrantes, " metros por recorrer");
    sc.close();
}
}
