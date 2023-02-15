package day05;

public class ForTest2 {
    public static void main(String[] args) {
        // 이름을 10번 출력
        // 1번째 한교동, 2번째 한교동, ... 10번째 한교동
        for(int i=0; i<10; i++){
            System.out.println(i+1 + "번째 한교동");
        }

        // 이름을 10번 출력
        // 10번째 한교동, 9번째 한교동, ... 1번째 한교동
        // 방법 1 (가능하면 i가 0부터 시작하는 것이 좋다!)
        for(int i=0; i<10; i++){
            System.out.println(10-i + "번째 한교동");
        }
        // 방법 2
        for(int i=10; i>0; i--){
            System.out.println(i + "번째 한교동");
        }
    }
}
