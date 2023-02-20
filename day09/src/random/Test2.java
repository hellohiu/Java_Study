package random;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        // 제곱근 구하고 싶다.
        double result = Math.sqrt(25); // 25의 제곱근
        System.out.println("25의 제곱근 : " + result); // 5.0

        String str = "안 녕하 세요!";
        // str 길이 구하기
        System.out.println(str.length()); // 8
        String[] str2 = str.split(" "); // " "을 기준으로 str을 나눠서 배열에 저장
        System.out.println(Arrays.toString(str2)); // 배열 str2를 [안, 녕하, 세요!] 이 형태로 보여줌
    }
}
