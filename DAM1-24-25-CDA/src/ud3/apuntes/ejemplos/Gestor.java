package ud3.apuntes.ejemplos;

public class Gestor {
    // DATOS
    public final String telefono;
    public String nombreGestor;
    double importeMax;
    
    
    
    //CONSTRUCTOR
    public Gestor(String telefono, String nombreGestor, double importeMax) {
        this.telefono = telefono;
        this.nombreGestor = nombreGestor;
        if (importeMax > 0)
        this.importeMax = importeMax;
    }



    public Gestor(String telefono, String nombreGestor) {
        //this(nombre, telefono, 10000);
        this.telefono = telefono;
        this.nombreGestor = nombreGestor;
        this.importeMax = 10000;
    }

}
