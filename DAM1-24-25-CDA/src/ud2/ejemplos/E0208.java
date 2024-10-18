package ud2.ejemplos;

import java.util.*;

public class E0208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enunciado
        /*
         * Pedir los coeficientes de una ecuación de segundo grado (ax^2 + bx + c = 0) y
         * mostrar sus soluciones reales.
         * Las soluciones de una ecuación de segundo grado son dos, según se utilice el
         * signo + o -
         * delante de la raíz cuadrada:
         * Si el discriminante (el contenido de la raíz cuadrada) es negativo, el
         * programa deberá
         * indicar que no existen soluciones con números reales.
         */

         int a, b, c;
         System.out.println("Dime los valores que toman: a, b y c, respectivamente...");
         a =sc.nextInt();
         b =sc.nextInt();
         c =sc.nextInt();
         sc.close();
      
         
          double x1 = -b + (Math.sqrt(Math.pow(b, 2) - 4 * a )) / 2 * a;
          double x2 = -b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c)) /  2 * a;
          
        
       
        System.out.println(" El resultado de la ecuación de segundo grado es:... " + x1 + "," + x2);
        

        }

      


        }

