package lambda;

public class Main2 {
    public static void main(String[] args) {
        // 2개의 정수를 매개변수로 받아서 곱한 결과를 반환하는 메소드
        // 람다식 이용
        FunctionalInter3 fi33 = (a, b) -> a * b;
        System.out.println(fi33.method(3,5));;

        // 새로운 함수형 인터페이스를 만들고
        // 2개의 문자열을 매개변수로 전달받는 추상 메소드를 선언한다.
        // 람다식을 이용하여 2개의 문자열을 연결해서 출력한다.
        FunctionalInter4 fi44 = (str1, str2) -> System.out.println(str1 + str2);
        fi44.addStr("안녕", "하슈");
    }
}
