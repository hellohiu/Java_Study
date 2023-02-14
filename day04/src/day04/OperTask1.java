package day04;

import java.util.Scanner;

public class OperTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        String result = null;
        String msg1 = "첫번째 정수 : ";
        String msg2 = "두번째 정수 : ";

        System.out.print(msg1);
        num1 = sc.nextInt();
        System.out.print(msg2);
        num2 = sc.nextInt();

        result = num1 > num2 ? "큰 수는 " + num1 + "입니다." :
                num1 == num2 ? "같은 숫자 입니다." : "큰 수는 " + num2 + "입니다.";

        System.out.println(result);
    }
}
