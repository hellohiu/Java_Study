package day04;

import java.util.Scanner;

public class SwitchTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        String msg = "정수를 입력하세요 : ";
        String result = null;

        System.out.print(msg);
        num1 = sc.nextInt()%2;

        switch(num1){
            case 0 :
                result = "짝수입니다.";
                break;
            default :
                result = "홀수입니다.";
        }

        System.out.println(result);
    }
}
