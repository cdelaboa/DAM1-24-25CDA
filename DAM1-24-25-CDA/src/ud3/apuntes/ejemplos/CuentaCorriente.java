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
    public String titular;
    private double saldo = 0;
    private Gestor gestor;
    private static String banco;

    // CONSTRUCTORES

    CuentaCorriente() {

    }

    public CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.titular = nombre;
        this.saldo = saldo < 0 ? 0 : saldo;
    }

    public CuentaCorriente(String nombre, String dni) {
        this(dni, nombre, 0);
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni, null, saldo);
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
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
        System.out.println("- Titular: " + titular + " (DNI= " + dni + ")");
        System.out.println("- Saldo: " + saldo);
    }

    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("55555555", "Carlos", 200);
        CuentaCorriente cc2 = new CuentaCorriente("3333333", "David", 100);

        CuentaCorriente.setBanco("Abanca");

        cc.mostrarInformacion();
        cc2.mostrarInformacion();
        Gestor gestor = new Gestor("aaaaaa", "bbbbbb");
        cc.gestor = gestor;
        System.out.println(cc.gestor.nombreGestor + "(" + cc.gestor.telefono + ")");


    }
}
