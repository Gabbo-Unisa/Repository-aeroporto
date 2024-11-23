package Eccezioni;

public class CodiceNonConsentitoException extends RuntimeException {
    public CodiceNonConsentitoException(String message) {
        super(message);
    }
}
