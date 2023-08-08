package banco.fiap;

public class SaqueInvalidoException extends RuntimeException {

    public SaqueInvalidoException(String message) {
        super(message);
    }
}