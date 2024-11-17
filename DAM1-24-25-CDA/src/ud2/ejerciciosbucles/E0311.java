package ud2.ejerciciosbucles;
import java.util.*;
public class E0311 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Número: ");
    int n = sc.nextInt();
    sc.close();

    int factorial = 1;
    for (int i = n; i > 1; i--) {
        factorial *= i;
    }
    System.out.printf("El factorial de %s es %s %n", n, factorial);
}
}
