package excepciones;

public class PorTamanioException extends RuntimeException {
    
    public PorTamanioException(String max) {
        super("Tamaño incorrecto, Max: " + max);
    }
        
}
