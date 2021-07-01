package excepciones;

public class PorRangoException extends RuntimeException {
    
    public PorRangoException(){
        super("Valores fuera de rango");
        
    }

}
