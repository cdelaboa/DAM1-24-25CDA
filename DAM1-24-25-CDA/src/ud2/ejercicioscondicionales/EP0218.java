package ud2.ejercicioscondicionales;
import java.util.*;
public class EP0218 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         // ENTRADA
         Random random = new Random();
         int numeroAleatorio1 = random.nextInt(100);
         int numeroAleatorio2 = random.nextInt(100);
         int operacionAleatoria = random.nextInt(4);
         double resultado = 0;
        String operador = "";
         // Seleccionar la operación aleatoriamente
        switch (operacionAleatoria) {
            case 0:
                resultado = numeroAleatorio1 + numeroAleatorio2;
                operador = "+";
                break;
            case 1:
                resultado = numeroAleatorio1 - numeroAleatorio2;
                operador = "-";
                break;
            case 2:
                resultado = numeroAleatorio1 * numeroAleatorio2;
                operador = "*";
                break;
            case 3:
                // Asegurarse de que no haya división por cero
                if (numeroAleatorio2 != 0) {
                    resultado = (double) numeroAleatorio1 / numeroAleatorio2;
                } else {
                    resultado = Double.NaN; // Resultado no válido
                }
                operador = "/";
                break;
            default:
                System.out.println("Operación desconocida");
        }
         int suma = numeroAleatorio1 + numeroAleatorio2;


 
         int respuesta;
         System.out.println("Aquí tienes tu primer número " + numeroAleatorio1);
         System.out.println("Y aquí el segundo " + numeroAleatorio2);
         System.out.println("Ahora aveer cuánto da esta operación? (1= + | 2= - | 3 = * | 4 = /) " + operacionAleatoria);
         respuesta = sc.nextInt();
         sc.close();
 
         if (respuesta == suma) {
             System.out.println("Es correcto");
         } else {
             System.out.println(" NO es correcto");
         }
    }
}
