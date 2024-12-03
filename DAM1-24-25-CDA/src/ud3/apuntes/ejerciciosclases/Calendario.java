package ud3.apuntes.ejerciciosclases;

public class Calendario {
    //DATOS
    int anho;
    int mes;
    int dia;

    //MÉTODOS

    Calendario (int año, int mes, int dia) {
        if (anho > 0 && mes > 0 && mes < 12 && dia > 0 && dia < 31 );
       System.out.println("FECHA CORRECTA");
        
    }

    public void incrementarDia() {
        dia++;
    }

    public void incrementarMes() {
        mes++;
    }

    public void incrementarAño(int cantidad) {
        anho +=cantidad;

    }

    public void mostrar() {
        System.out.println("DÍA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("AÑO: " + anho);
    }

    public boolean iguales(Calendario otraFecha) {
       
        
        if ()
    }
}
