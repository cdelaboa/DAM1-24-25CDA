package ud3.apuntes.ejemplos;

public class Hora {
    // DATOS
    private int hora;
    private int min;
    private int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return min;
    }

    public void setMinuto(int minuto) {
        this.min= minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void incrementar() {
        double horaASegundos = hora * 3600;
        double minASegundos = min * 60;
        double segundosTotales = horaASegundos + minASegundos + segundo;
        segundosTotales++;

        System.out.println("Estos son los segundos totales: " + segundosTotales);


    }

    public void incrementar1Segundo() {
       segundo++;
       if (segundo == 60) {
            segundo = 0;
            min++;
            if (min == 60) {
                min = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
       }
    }

    public void mostrar() {
        System.out.println(getHora() + ":" + getMinuto() + ":" + getSegundo());
    }

}
