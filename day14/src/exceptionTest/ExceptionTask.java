package exceptionTest;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionTask {
    // 3개의 정수 입력받기
    // 무한 입력 상태로 구현(while)
    // q를 입력시 나가기 (문자열 비교)
    // 3개의 정수는 배열에 담기
    // if문은 한번만 사용하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = "번째 정수 입력 >> ", tmp = null;
        int[] arNum = new int[3];
        int idx = 0;

        while(true){
            System.out.print(++idx + msg);
            tmp = sc.next();
            if(tmp.equals("q")){break;}

            // 단축키 : ctrl + alt + t
            try {
                arNum[idx-1] = Integer.parseInt(tmp);
            } catch (NumberFormatException e) {
                System.out.println("정수만 입력하세요.");
                idx--;
                System.out.println(e.getMessage()); // 예외 메세지 출력
                e.printStackTrace(); // 예외가 발생하지만 실행이 멈추지 않음 (오류를 전부 알려줌)
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("이미 3번 입력했어!");
                System.out.println(e.toString());
                System.out.println(e); // toString() 생략해도 위와 동일하게 나온다.
                idx--;
            }

        }
        System.out.println(Arrays.toString(arNum));
    }
}
