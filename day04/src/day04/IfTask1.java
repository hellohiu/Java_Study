package day04;

import java.util.Scanner;

public class IfTask1 {
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

        if(num1 > num2){
            result = "큰 수 : " + num1;
        } else if(num1 < num2){
            result = "큰 수 : " + num2;
        } else {
            result = "두 수는 같습니다.";
        }

        System.out.println(result);
    }
}
