package ud3.apuntes.ejemplos;

/*   Diseñar la clase cuentacorriente, que almacena los datos: DNI y nombre del
titular, asi como el saldo. Las operaciones típicas con una cuenta corriente son:
● Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
● Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación,
si existe saldo suficiente.
● Ingresar dinero: se incrementa el saldo.
● Mostrar información: muestra la información disponible de la cuenta corriente.
*/
public class CuentaCorriente {
    // DATOS
    String dni;
    String nombre;
    double saldo = 0;

    // CONSTRUCTORES

    CuentaCorriente() {

    }

    public CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre; 
        this.saldo = saldo < 0 ? 0 : saldo;
    }

    CuentaCorriente(String nombre, String dni) {
        this(dni, nombre, 0);
    }

    CuentaCorriente(String dni, double saldo) {
        this(dni,null, saldo);
    }


    public boolean sacarDinero(double importe) {
        if (saldo >= importe) {
            saldo -= importe;
            return true;
        } else {
            return false;
        }
    }

    public void ingresarDinero(double importe) {
        saldo += importe;
    }

    public void mostrarInformacion() {
        System.out.println("CUENTA CORRIENTE:");
        System.out.println("- Titular: " + nombre + " (DNI= " + dni + ")");
        System.out.println("- Saldo: " + saldo);
    }
}
