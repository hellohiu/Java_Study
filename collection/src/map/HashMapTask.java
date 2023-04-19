package map;

import java.util.HashMap;
import java.util.Scanner;

/*
    카페 메뉴
    아메리카노 2500
    라떼 3500
    모카 4500
    바닐라 라떼 4500

    HashMap 에 저장하기

    출력)
    1. 아메리카노
    2. 라떼
    3. 모카
    4. 바닐라 라떼

    입력 >> 라떼는 3500원입니다.
 */
public class HashMapTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = null;
        String msg = "1. 아메리카노\n" +
                "2. 라떼\n" +
                "3. 모카\n" +
                "4. 바닐라 라떼\n" +
                "입력 >> ";
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("아메리카노", 2500);
        menu.put("라떼", 3500);
        menu.put("모카", 4500);
        menu.put("바닐라 라떼", 4500);

        System.out.print(msg);
        int choice = sc.nextInt();

        switch (choice){
            case 1 :
                result = "아메리카노는 " + menu.get("아메리카노") + "원 입니다.";
                break;
            case 2 :
                result = "라떼는 " + menu.get("라떼") + "원 입니다.";
                break;
            case 3 :
                result = "모카는 " + menu.get("모카") + "원 입니다.";
                break;
            case 4 :
                result = "바닐라 라떼 " + menu.get("바닐라 라떼") + "원 입니다.";
                break;
        }
        System.out.println(result);
    }
}
