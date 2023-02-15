package day05;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        // 사용자에게 월을 입력 받고 월의 마지막 일을 출력하기
        // ~월은 ~일이 마지막 일입니다. (단, 2월은 28일로 고정)
        // switch 사용하기
        Scanner sc = new Scanner(System.in);
        int month = 0;
        String result = null;
        System.out.print("월을 입력 >> ");
        month = sc.nextInt();
        switch(month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                result = month + "월은 31일이 마지막 일입니다.";
                break;
            case 2 :
                result = month + "월은 28일이 마지막 일입니다.";
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                result = month + "월은 30일이 마지막 일입니다.";
                break;
            default:
                result = "잘못 입력했습니다.";
        }

        System.out.println(result);
    }
}
