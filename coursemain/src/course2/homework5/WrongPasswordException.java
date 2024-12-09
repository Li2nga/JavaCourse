package course2.homework5;

public class WrongPasswordException extends IllegalArgumentException {
    public WrongPasswordException(String s) {
        super(s);
    }
}
