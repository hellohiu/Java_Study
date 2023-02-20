package random;

import java.util.Random;
import java.util.Scanner;

class Enhance {
    boolean[] arChance = {true, true, true, true, true, true, true, false, false, false};
    String weapon;
    int cnt;

    public Enhance(String weapon) {
        this.weapon = weapon;
    }

    void start(){
        Random r = new Random();
        int index = r.nextInt(10); // 0 ~ 9 까지의 랜덤한 숫자가 나옴

        // arChance[]가 true 7개 false 3개이므로 성공 확률 70%!
        if(arChance[index]){
            cnt++;
            System.out.println("강화에 성공했습니다.");
        } else {
            cnt = 0;
            System.out.println("강화에 실패했습니다.");
        }
    }

    void printInfo(){
        System.out.println(weapon + " + " + cnt);
    }
}

public class RandomTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Enhance e = new Enhance("목검");
        String msg = "1.강화시작\n2.종료";
        int choice = 0;
        boolean flag = true;
        String input = null;

        while(flag){
            System.out.println(msg);
            choice = sc.nextInt();
            switch(choice){
                case 1 :
                    e.start();
                    e.printInfo();
                    break;
                case 2 :
                    System.out.println("종료하시려면 \"종료\"라고 입력하세요.");
                    input = sc.nextLine();
                    if(input.equals("종료")) {
                        flag = false;
                    }
                    break;
                default :
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
