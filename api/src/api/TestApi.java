package api;

/**
 *
 * @author YuNa
 * <br>
 * TestApi
 * <br>
 * @since JDK11
 *
 */

public class TestApi {
    /**
     * div 메소드는 정수인 파라미터를 받으며 num1과 num2를 나눠준다.
     *
     * @param num1
     * @param num2
     * @throws ArithmeticException
     *
     * example)
     * <br>
     * div(10,3)
     * <br>
     * 10과 3을 나눈 결과를 출력한다.
     *
     * @see {@link Math}
     */
    public void div (int num1, int num2) throws ArithmeticException{
        System.out.println(num1/num2);
    }
}
