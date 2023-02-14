package day04;

import java.util.Scanner;

public class IfTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        String msg = "정수를 입력하세요 : ";
        String result = null;

        System.out.print(msg);
        num1 = sc.nextInt();

        if(num1 % 2 == 0){
            result = "짝수입니다.";
        } else {
            result = "홀수입니다.";
        }

        System.out.println(result);
    }
}
