package day07;

import java.util.Scanner;

public class LockerTest {
    static String mainMsg = "번 사물함의 비밀번호 설정 >> ";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arPw = new int[5];
        int choice = 0, inputPw = 0;
        String choiceMsg = "이용할 사물함의 번호 입력 >> ";
        String inputMsg = "비밀번호를 입력하세요 >> ";

        LockerTest lt = new LockerTest();
        arPw = lt.setLockerPw(arPw);

        System.out.print(choiceMsg);
        choice = sc.nextInt();

        System.out.print(inputMsg);
        inputPw = sc.nextInt();

        System.out.println(lt.checkLockerPw(arPw[choice-1], inputPw));
    }

    /*
       1. 5칸짜리 사물함의 비밀번호를 각각 배열에 저장한다.
       2. 사용자에게 이용할 사물함 번호를 묻는다.
       3. 비밀번호를 입력받아 확인한다.
       4. 일치/불일치를 출력한다.
     */

    // 패스워드 설정
    int[] setLockerPw(int[] arPw){
        for(int i=0; i<arPw.length; i++){
            System.out.print((i+1) + mainMsg);
            arPw[i] = sc.nextInt();
        }
        return arPw;
    }

    String checkLockerPw(int lockerPw, int inputPw){
        // 패스워드 확인
        String result = null;
        if(lockerPw == inputPw){
            result = "비밀번호가 일치합니다.";
        } else {
            result = "비밀번호가 일치하지 않습니다.";
        }
        return result;
    }
}
