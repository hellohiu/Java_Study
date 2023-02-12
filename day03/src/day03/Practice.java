package day03;

// 코인 노래방 프로그램 만들기 !

// 사용자에게 금액을 입력 받고 부를 수 있는 노래곡수, 잔돈 출력 (한 곡당 300원)
// 입력 예시) 금액 입력 : 1000
// 출력 예시) 3곡을 부를 수 있으며 잔돈은 100원 입니다.

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PRICE = 300; // 상수 : 값을 변경할 수 없음
        int money = 0, count = 0, change = 0;
        String msg1 = "금액 입력 : ", msg2 = "%d곡을 부를 수 있으며 잔돈은 %d원 입니다.";

        System.out.print(msg1);
        money = sc.nextInt();
        count = money / PRICE;
        change = money % PRICE;

        System.out.printf(msg2, count, change);
    }
}
