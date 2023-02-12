package day03;

import java.util.Scanner;

public class InputTask1 {
    public static void main(String[] args) {
        /*
            문제) printf() 사용하기
                 이름을 입력하세요 : 000
                 000님 안녕하세요
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        System.out.printf("%s님 안녕하세요", sc.next());
    }
}
