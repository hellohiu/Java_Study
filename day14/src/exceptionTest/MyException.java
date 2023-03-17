package exceptionTest;

public class MyException extends Exception {
    public MyException() {
        super("내 예외가 발생했다.");
    }
}
