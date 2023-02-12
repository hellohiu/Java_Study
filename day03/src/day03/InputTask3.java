package day03;

import java.util.Scanner;

public class InputTask3 {
    public static void main(String[] args) {
   /*      문제) 두 정수를 입력받고 합을 출력한다.
                 next() 사용
                 String -> int

                 ex)
                 정수1 입력 : 10
                 정수2 입력 : 30
                 두 정수의 합은 40입니다.       */

        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, result = 0;
        String msg1 = "정수1 입력 : ", msg2 = "정수2 입력 : ";

        System.out.print(msg1);
//        num1 = Integer.parseInt(sc.next());
          num1 = sc.nextInt();

        System.out.print(msg2);
//        num2 = Integer.parseInt(sc.next());
          num2 = sc.nextInt();

        result = num1 + num2;
        System.out.println("두 정수의 합은 " + result + "입니다.");
    }
}
