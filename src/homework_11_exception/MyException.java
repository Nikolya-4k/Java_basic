package homework_11_exception;

public class MyException extends IllegalCallerException {
    public MyException() {
        super("The value should be more than zero");
    }
}
