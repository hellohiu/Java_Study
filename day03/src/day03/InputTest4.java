package day03;

// 두 자릿수 정수를 입력 받고 십의 자리와
// 일의 자리를 출력하는 프로그램 만들기

import java.util.Scanner;

public class InputTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0, result1 = 0, result2 = 0;
        String msg = "두 자릿수 정수 입력 : ", msg1 = "십의 자리 : ", msg2 = "일의 자리 : ";

        System.out.print(msg);
        number = sc.nextInt();
        result1 = number / 10;
        result2 = number % 10;

        System.out.println(msg1 + result1);
        System.out.println(msg2 + result2);
    }
}
