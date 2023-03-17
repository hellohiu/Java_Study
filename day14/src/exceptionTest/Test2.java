package exceptionTest;

public class Test2 {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        }
        // ↑ 오류를 일부로 발생시킨다.
    }
}
