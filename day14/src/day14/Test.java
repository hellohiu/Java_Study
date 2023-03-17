package day14;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 오류
        // 1. 예외 : 개발자가 처리 가능
        // 2. 에러 : 개발자가 처리 불가능

//        System.out.println("실행되는 코드1");
//        System.out.println(10/0); // ArithmeticException 산술 오류
//        System.out.println("실행되는 코드2"); // ↑ 위 오류로 인해 해상 코드는 실행되지 않음

        System.out.println("실행되는 코드1");
        try{
            System.out.println(10/2);
            System.out.println(10/0);
            // 예외가 실행되면 바로 try 에서 catch 로 넘어가기 때문에
            // ↓ 아래 코드는 실행되지 않는다.
            System.out.println(10/5);
        }catch(ArithmeticException e){
            System.out.println("0으로 나누지 마세요!");
        }
        System.out.println("실행되는 코드2");

        Scanner sc = null;
        try{
            sc.next(); // NullPointerException
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("0으로 나누지 마세요!");
        }catch(Exception e){
            // Exception 은 모든 예외의 부모로 우리가 모르는 예외를 잡아줄 수 있다.
            System.out.println("내가 예상하지 못한 예외가 발생했다.");
        }finally {
            System.out.println("finally");
        }
    }
}
