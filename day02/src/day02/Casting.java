package day02;

public class Casting {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 3;

        System.out.println(10/3);   // 3
        System.out.println(number1/number2);   // 3
        // 자동 형변환
        System.out.println(10/3.0); // 3.3333333333333335
        System.out.println('A' + 1); // 66 (A 아스키코드 : 65)
        // 강제 형변환
        System.out.println(number1/(double)number2);   // 3.3333333333333335
        System.out.println((char)('A' + 1)); // B (B 아스키코드 : 66)
    }
}
