package lambda;

public class Test {
    /*
        식(Expression)과 문(Statement)의 차이
        식은 결과가 값이다.
        식은 값이기 때문에 변수에 저장할 수 있고 매개변수로 넘겨줄 수 있다.

        문은 ;으로 끝난다. (명령문)
        문은 값이 아니기 때문에 변수에 저장할 수 없고 매개변수로 넘겨줄 수 없다.
        문은 식을 포함할 수 있다.
     */
    public static void main(String[] args) {
        // 식, 문

        // 식
        // 식의 결과는 값이다.
        add10(10);

        // 문
        // 식이 아니면 문이다.
        int a = 3;
    }

    static int add10(int num){
        System.out.println(num+10);
        return num+10;
    }

    static void printNum(int num){
        System.out.println(num + "입니다.");
    }
}
