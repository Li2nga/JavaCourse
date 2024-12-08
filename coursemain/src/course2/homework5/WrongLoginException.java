package course2.homework5;

public class WrongLoginException extends IllegalArgumentException {
    public WrongLoginException(String s) {
        super(s);
    }
}
