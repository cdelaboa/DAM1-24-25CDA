package ud2.practicas;


/**Alejandro Feijoo Regueira
 * Carlos de la Torre Aboal
**/

import java.util.Scanner;

public class Supermercado {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char atenderOtroCliente;

        do {
            procesarCompra();
            atenderOtroCliente = preguntarSiRepetir();
        } while (atenderOtroCliente == 's');

        System.out.println("¡Gracias por usar nuestro sistema de supermercado!");
        scanner.close();
    }

    
    public static void procesarCompra() {
        double totalCompra = 0;
        double precio;
        int cantidad;
        int contadorArticulos = 0;

        String listaArticulos = ""; 

        do {
            System.out.print("Introduce el precio del producto (0 o negativo para terminar): ");
            precio = leerDouble();

            if (precio > 0) {
                System.out.print("Introduce la cantidad del producto: ");
                cantidad = leerInt();

                contadorArticulos++;
                double subtotal = precio * cantidad;
                totalCompra += subtotal;

                listaArticulos += String.format("Artículo %d: %.2f € x %d unidades = %.2f €%n",
                        contadorArticulos, precio, cantidad, subtotal);
            }
        } while (precio > 0);

        System.out.println("\nResumen de la compra:");
        System.out.println(listaArticulos);
        System.out.printf("Total de la compra: %.2f €%n", totalCompra);

        procesarPago(totalCompra);
    }

    public static void procesarPago(double totalCompra) {
        char metodoPago = '\0';

        while (metodoPago != 't' && metodoPago != 'e') {
            System.out.print("¿Método de pago (t)arjeta o (e)fectivo)? ");
            metodoPago = scanner.nextLine().toLowerCase().charAt(0);

            if (metodoPago == 't') {
                System.out.println("Pago realizado con tarjeta. Compra finalizada.");
            } else if (metodoPago == 'e') {
                calcularCambio(totalCompra);
            } else {
                System.out.println("Método de pago no válido. Inténtalo de nuevo.");
            }
        }
    }

    public static void calcularCambio(double totalCompra) {
        double importePagado = 0;

        while (importePagado < totalCompra) {
            System.out.print("Introduce el importe entregado: ");
            importePagado = leerDouble();

            if (importePagado < totalCompra) {
                System.out.println("El importe entregado es insuficiente. Inténtalo de nuevo.");
            }
        }

        double cambio = importePagado - totalCompra;
        System.out.printf("Cambio a devolver: %.2f €%n", cambio);
        desglosarCambio(cambio);
    }


    public static void desglosarCambio(double cambio) {
        final int BILLETESQUINIENTOS = 500;
        final int BILLETESDOSCIENTOS = 200;
        final int BILLETES_CIEN = 100;
        final int BILLETES_CINCUENTA = 50;
        final int BILLETES_VEINTE = 20;
        final int BILLETES_DIEZ = 10;
        final int BILLETES_CINCO = 5;
        final int MONEDAS_DOS = 2;
        final int MONEDAS_UNO = 1;

        final int CINCUENTA_CENTIMOS = 50;
        final int VEINTE_CENTIMOS = 20;
        final int DIEZ_CENTIMOS = 10;
        final int CINCO_CENTIMOS = 5;
        final int DOS_CENTIMOS = 2;
        final int UN_CENTIMO = 1;

        int integer = (int) Math.floor(cambio);
        int decimals = (int) Math.floor((cambio - integer) * 100);

        System.out.printf("Billetes de 500€: %d%n", integer / BILLETESQUINIENTOS);
        integer %= BILLETESQUINIENTOS;

        System.out.printf("Billetes de 200€: %d%n", integer / BILLETESDOSCIENTOS);
        integer %= BILLETESDOSCIENTOS;

        System.out.printf("Billetes de 100€: %d%n", integer / BILLETES_CIEN);
        integer %= BILLETES_CIEN;

        System.out.printf("Billetes de 50€: %d%n", integer / BILLETES_CINCUENTA);
        integer %= BILLETES_CINCUENTA;

        System.out.printf("Billetes de 20€: %d%n", integer / BILLETES_VEINTE);
        integer %= BILLETES_VEINTE;

        System.out.printf("Billetes de 10€: %d%n", integer / BILLETES_DIEZ);
        integer %= BILLETES_DIEZ;

        System.out.printf("Billetes de 5€: %d%n", integer / BILLETES_CINCO);
        integer %= BILLETES_CINCO;

        System.out.printf("Monedas de 2€: %d%n", integer / MONEDAS_DOS);
        integer %= MONEDAS_DOS;

        System.out.printf("Monedas de 1€: %d%n", integer / MONEDAS_UNO);
        integer %= MONEDAS_UNO;

        System.out.printf("Monedas de 50 céntimos: %d%n", decimals / CINCUENTA_CENTIMOS);
        decimals %= CINCUENTA_CENTIMOS;

        System.out.printf("Monedas de 20 céntimos: %d%n", decimals / VEINTE_CENTIMOS);
        decimals %= VEINTE_CENTIMOS;

        System.out.printf("Monedas de 10 céntimos: %d%n", decimals / DIEZ_CENTIMOS);
        decimals %= DIEZ_CENTIMOS;

        System.out.printf("Monedas de 5 céntimos: %d%n", decimals / CINCO_CENTIMOS);
        decimals %= CINCO_CENTIMOS;

        System.out.printf("Monedas de 2 céntimos: %d%n", decimals / DOS_CENTIMOS);
        decimals %= DOS_CENTIMOS;

        System.out.printf("Monedas de 1 céntimo: %d%n", decimals / UN_CENTIMO);
    }

    public static char preguntarSiRepetir() {
        char respuesta = '\0';
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("¿Atender a otro cliente? (s/n): ");
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    throw new IllegalArgumentException("No puedes dejar la respuesta vacía.");
                }
                if (input.length() > 1 || (input.charAt(0) != 's' && input.charAt(0) != 'n')) {
                    throw new IllegalArgumentException("Introduce 's' para sí o 'n' para no.");
                }
                respuesta = input.charAt(0);
                entradaValida = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return respuesta;
    }

    public static double leerDouble() {
        double resultado = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    throw new IllegalArgumentException("No puedes dejar el valor vacío.");
                }
                resultado = Double.parseDouble(input);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Introduce un número válido: ");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return resultado;
    }

    public static int leerInt() {
        int resultado = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    throw new IllegalArgumentException("No puedes dejar el valor vacío.");
                }
                resultado = Integer.parseInt(input);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Introduce un número entero válido: ");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return resultado;
    }
}
