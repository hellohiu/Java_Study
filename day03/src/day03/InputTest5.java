package day03;

import java.util.Scanner;

public class InputTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        String msg = "정수를 입력해주세요 : ";

        System.out.print(msg);
        number = sc.nextInt();

        System.out.println(number % 2);
        // 값이 1이면 홀수, 0이면 짝수
    }
}
