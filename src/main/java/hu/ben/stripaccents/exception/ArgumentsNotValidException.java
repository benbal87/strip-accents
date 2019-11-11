package hu.ben.stripaccents.exception;

public class ArgumentsNotValidException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ArgumentsNotValidException(Exception exception) {
        super(exception);
    }

    public ArgumentsNotValidException(String message) {
        super(message);
    }

}
