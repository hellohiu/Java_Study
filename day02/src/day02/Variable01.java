package day02;

public class Variable01 {
    public static void main(String[] args) {
        int a; // 정수를 저장할 수 있는 변수 a를 선언
        a = 3; // 변수 a에 3이라는 정수값을 저장

        int b = 4; // 정수를 저장할 수 있는 변수 b를 선언하고 4라는 정수 초기화했다.

        // 변수명을 이용하여 사용
        System.out.println(a);
        System.out.println(b);

        // 여러개의 변수를 선언
        int c, d, e;

        // 변수의 사용 방법
//        a = 10;   (a는 저장할 공간으로 사용)
//        a         (a는 저장된 값으로 사용)

        // 변수명 주의사항 !
        int a1;     // 문자부터 시작 (숫자로 시작하지 않는다.)
        int a_$;    // $와 _를 제외한 특수문자 사용 불가능
//        int a a;     공백 사용 불가능
//        int public;  키워드 사용 불가능

        int user_age;   // 띄어쓰기 대신 _ : 팟홀(스네이크) 표기법
        int userAge;    // 띄어쓰기 대신 대문자 : 카멜 표기법 ★
    }
}
