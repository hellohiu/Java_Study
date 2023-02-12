package day03;

import java.util.Scanner;

public class InputTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg1 = "좋아하는 숫자 : ", msg2 = "좋아하는 동물 : ", animal = "";
        String resultMsg = "내가 좋아하는 숫자는 %d이고, 내가 좋아하는 동물은 %s이다.";
        int number = 0;

        System.out.print(msg1);
        number = sc.nextInt();
        sc.nextLine(); // 남아있는 엔터 값 없애기!

        System.out.print(msg2);
        animal = sc.nextLine();

        System.out.printf(resultMsg, number, animal);
    }
}
