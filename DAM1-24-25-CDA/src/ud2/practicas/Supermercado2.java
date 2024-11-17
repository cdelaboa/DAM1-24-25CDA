package ud2.practicas;

import java.util.Scanner;

public class Supermercado2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido al supermercado");
            double totalCompra = realizarCompra(scanner);
            System.out.printf("El importe total de la compra es: %.2f€\n", totalCompra);

            procesarPago(scanner, totalCompra);

            System.out.print("¿Desea procesar otra compra? (S/N): ");
            continuar = scanner.next().equalsIgnoreCase("S");
        }
        System.out.println("Gracias por usar el sistema del supermercado. ¡Hasta pronto!");
        scanner.close();
    }

    // Función para realizar la compra
    public static double realizarCompra(Scanner scanner) {
        double total = 0.0;

        while (true) {
            try {
                System.out.print("Introduce el precio del producto (o 0 para finalizar): ");
                double precio = scanner.nextDouble();
                if (precio <= 0) {
                    break;
                }

                System.out.print("Introduce la cantidad de unidades: ");
                int cantidad = scanner.nextInt();
                if (cantidad < 0) {
                    throw new IllegalArgumentException("La cantidad no puede ser negativa.");
                }

                total += precio * cantidad;
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Por favor, intenta de nuevo.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
        return total;
    }

    // Función para procesar el pago
    public static void procesarPago(Scanner scanner, double totalCompra) {
        while (true) {
            System.out.print("Seleccione el método de pago (tarjeta/efectivo): ");
            String metodoPago = scanner.next().toLowerCase();

            if (metodoPago.equals("tarjeta")) {
                System.out.println("Pago realizado con tarjeta. ¡Gracias por su compra!");
                break;
            } else if (metodoPago.equals("efectivo")) {
                calcularCambio(scanner, totalCompra);
                break;
            } else {
                System.out.println("Método de pago no válido. Por favor, elija 'tarjeta' o 'efectivo'.");
            }
        }
    }

    // Función para calcular y desglosar el cambio
    public static void calcularCambio(Scanner scanner, double totalCompra) {
        while (true) {
            try {
                System.out.print("Introduce el importe entregado por el cliente: ");
                double importeEntregado = scanner.nextDouble();

                if (importeEntregado < totalCompra) {
                    System.out.println("El importe entregado es insuficiente. Por favor, intenta de nuevo.");
                } else {
                    double cambio = importeEntregado - totalCompra;
                    System.out.printf("Cambio a devolver: %.2f€\n", cambio);
                    desglosarCambio(cambio);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Por favor, intenta de nuevo.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
    }

    // Función para desglosar el cambio en billetes y monedas
    public static void desglosarCambio(double cambio) {
        int[] billetes = { 500, 200, 100, 50, 20, 10, 5 };
        int[] monedas = { 200, 100, 50, 20, 10, 5, 2, 1 };
        int[] centimos = { 50, 20, 10, 5, 2, 1 };

        System.out.println("Desglose del cambio:");
        int cambioEntero = (int) cambio;
        int cambioCentimos = (int) Math.round((cambio - cambioEntero) * 100);

        for (int billete : billetes) {
            int cantidad = cambioEntero / billete;
            if (cantidad > 0) {
                System.out.printf("  %d billete(s) de %d€\n", cantidad, billete);
                cambioEntero %= billete;
            }
        }

        for (int moneda : monedas) {
            int cantidad = cambioEntero / moneda;
            if (cantidad > 0) {
                System.out.printf("  %d moneda(s) de %d€\n", cantidad, moneda / 100);
                cambioEntero %= moneda;
            }
        }

        for (int centimo : centimos) {
            int cantidad = cambioCentimos / centimo;
            if (cantidad > 0) {
                System.out.printf("  %d moneda(s) de %d céntimos\n", cantidad, centimo);
                cambioCentimos %= centimo;
            }
        }
    }
}
