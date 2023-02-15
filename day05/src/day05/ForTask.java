package day05;

public class ForTask {
    public static void main(String[] args) {
        // 1~100까지 출력
        for(int i=0; i<100; i++){
            System.out.println(i+1);
        }

        // 100~1까지 출력
        for(int i=0; i<100; i++){
            System.out.println(100-i);
        }

        // 1~100까지 중 짝수만 출력
        // 방법 1
        for(int i=0; i<50; i++){
            System.out.println((i+1)*2);
        }
        // 방법 2
        for(int i=0; i<100; i++){
            if(i%2==1){
                System.out.println(i+1);
            }
        }

        // A~F 출력
        int a = 'A'; // 문자 정수로 자동형변환
        System.out.println(a); // A == 65 ~ F == 70
        for(int i=0; i<6; i++){
            System.out.println((char)(i+65));
        }

        // aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
        // A == 65, a == 97
        // for문 사용
        for(int i=0; i<26; i++){
            if(i%2==0){
                System.out.print((char)(i+97));
            } else {
                System.out.print((char)(i+65));
            }
        }
        System.out.println();
        // 삼항연산자 사용
        for(int i=0; i<26; i++){
            System.out.print(i%2==0 ? (char)(i+97) : (char)(i+65));
        }
    }
}
