package excepciones;

public class CorreoException extends RuntimeException {
    
    public CorreoException(){
        super("Correo electrónico incorrecto");
    }
}
