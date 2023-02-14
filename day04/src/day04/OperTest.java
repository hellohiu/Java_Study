package day04;

public class OperTest {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        boolean isTrue = num1 >= 10; // 관계연산자 먼저 실행되고 대입연산자 실행
        boolean isTrue2 = num1 >= 10 && num2 == 20;

        System.out.println(10==10); // true
        System.out.println(10!=10); // false
        System.out.println(num1 != num2); // true (10과 20은 같지 않다.)
        System.out.println(num1 > 10); // false
        System.out.println(num1 >= 10); // true
        System.out.println(isTrue); // true

        System.out.println(true && false); // false
        System.out.println(true && true); // true
        System.out.println(true || false); // true

        System.out.println(num1 >= 10 && num2 == 20); // true && true => true
        System.out.println(isTrue2); // true
        System.out.println(false || num2 == 20); // true

        System.out.println(!(num1 == 10)); // !true => false
    }
}
