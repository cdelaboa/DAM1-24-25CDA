package ud3.ejerciciosclases;

public class MarcaPagina {
    /*
     * //DATOS
     * int ultimaPagLeida;
     * int numPaginasLibro;
     * int numPaginasLeidas;
     * 
     * 
     * 
     * 
     * 
     * 
     * //MÉTODOS
     * public boolean empezarLibro(int numPaginasLibro, ) {
     * 
     * }
     * 
     * }
     */
    // DATOS
    int pagina;
    String libro; // opcional

    // MÉTODOS

    public void incrementarPagina() {
        pagina++;
    }

 
    public int getPagina() {
        return this.pagina;
    }



    public void reiniciarLibro () {
        pagina = 0;
    }



}