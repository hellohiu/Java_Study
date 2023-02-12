package day03;

import java.util.Scanner;

public class InputTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받은 값 세번 출력하기!
        System.out.print("입력 : ");
        String str = sc.next();

        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
    }
}
