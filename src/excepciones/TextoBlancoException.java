package excepciones;

public class TextoBlancoException extends RuntimeException{
    
    public TextoBlancoException(){
        super("Texto en blanco");
    }
}
