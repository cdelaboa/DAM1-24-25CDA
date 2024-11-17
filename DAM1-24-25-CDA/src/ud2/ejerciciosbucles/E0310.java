package ud2.ejerciciosbucles;
import java.util.*;
public class E0310 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Vamos a mostrar la suma de los 10 primeros números impares");
    final int N = 10;
    int n = 1;
    for (int i = 0; i < N; i++) {
        System.out.println(n);
        n = n + 2;
      
    }
    sc.close();
}
}
