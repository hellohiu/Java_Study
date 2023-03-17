package exceptionTest;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner sc = null;
        // sc.next();
        // Exception in thread "main" java.lang.NullPointerException:
        // Cannot invoke "java.util.Scanner.next()" because "sc" is null

        try{
            sc.next();
        } catch(NullPointerException e){
            System.out.println("Null 입니다.");
        } catch(Exception e){
            System.out.println("예상치 못한 오류");
            // 우리가 try 에서 어떤 오류가 발생할지 전부 예상하기 힘들다.
            // 예상치 못한 오류가 발생할 수도 있다.
            // 예상치 못한 오류를 잡기 위해 Exception 타입의 변수를 사용한다.
            // 모든 예외의 조상은 Exception 클래스이다.
            // 즉, 어떤 예외가 발생하더라도 Exception 타입의 참조변수에 저장 가능하다. (업캐스팅)
        }
    }
}
