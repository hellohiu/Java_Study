package day04;

import java.util.Scanner;

public class IfTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * 당신의 mbti는?
         * 1. ISFJ   - 차분하고 인내심이 강하다.
         * 2. INFJ   - 통찰력이 높고 사람들에게 영감을 준다.
         * 3. ESFP   - 호기심이 많고 개발적이다.
         * 4. ENTJ   - 철저히 준비하고 활동적이다.
         */
        String msg = "당신의 mbti는?\n"
                + "1. ISFJ\n"
                + "2. INFJ\n"
                + "3. ESFP\n"
                + "4. ENTJ\n"
                + "선택 : ";
        String isfj = "차분하고 인내심이 강하다.",
                infj = "통찰력이 높고 사람들에게 영감을 준다.",
                esfp = "호기심이 많고 개발적이다.",
                entj = "철저히 준비하고 활동적이다.",
                errMsg = "잘못 입력하셨습니다.";
        String result = null;
        int choice = 0;

        System.out.print(msg);
        choice = sc.nextInt();
        if(choice == 1){
            result = isfj;
        } else if(choice == 2){
            result = infj;
        } else if(choice == 3){
            result = esfp;
        } else if(choice == 4){
            result = entj;
        } else {
            result = errMsg;
        }
        System.out.println(result);
    }
}
