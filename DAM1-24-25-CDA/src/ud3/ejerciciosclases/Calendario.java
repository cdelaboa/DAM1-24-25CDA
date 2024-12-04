package ud3.ejerciciosclases;

public class Calendario {
    // DATOS

    public int anho = 2024, mes = 12, dia = 31;

    // CONSTRUCTOR

    Calendario(int año, int mes, int dia) {
        if (anho > 0 && mes > 0 && mes < 12 && dia > 0 && dia < 32)
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }

    // MÉTODOS

    public void incrementarDia() {
        if (dia == 31) {
            dia = 1;
            if (mes ==12) {
                mes = 1;
                anho++;
            }else 
                mes++;
        } else
            dia++;
    }

    public void incrementarMes() {
        if (mes == 12) {
            mes = 1;
            anho++;
        } else
            mes++;
    }

    public void incrementarAño(int cantidad) {

        if (cantidad == 0) return; // Si la cantidad es 0, no hacemos nada
        
        int nuevoAnho = anho + cantidad;

        anho = nuevoAnho;
    }


    public void mostrar() {
        System.out.println("DÍA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("AÑO: " + anho);
    }
    public static void main(String[] args) {
        Calendario fecha1 = new Calendario(2024, 12, 31);

        fecha1.mostrar();
        fecha1.incrementarDia();
        fecha1.mostrar();
        fecha1.incrementarAño(4);
        fecha1.mostrar();
    }
}
