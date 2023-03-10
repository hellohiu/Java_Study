package lambda;

public class LambdaTest {
    void printHello(){
        System.out.println("안녕하세요");
    }

    // 1. 이름을 없애고 화살표(->)를 추가한다.
    // void () -> { System.out.println("안녕하세요"); }
    // 2. 리턴 타입은 추론이 가능하므로 생략한다.
    // () -> { System.out.println("안녕하세요"); }
    // 3. 명령문이 1줄이면 중괄호와 세미콜론을 생략 가능하다.
    // () -> System.out.println("안녕하세요")

    int add10(int number){
        return number+10;
    }

    // 1. 이름을 없애고 화살표 (->)를 추가한다.
    // int (int number) -> { return number+10; }
    // 2. 리턴 타입은 추론이 가능하므로 생략한다.
    // (int number) -> { return number+10; }
    // 3. 매개변수 타입은 추론이 가능하므로 생략이 가능하다.
    // (number) -> { return number+10; }
    // 4. 매개변수가 한개이면 소괄호도 생략이 가능하다.
    // number -> { return number+10; }
    // 5. 중괄호와 세미콜론은 생략 가능하다.
    //    중괄호와 세미콜론을 생략하면 return도 생략해야 한다.
    //    바디의 결과가 값이라면 자동으로 return 된다. (단, 바디에 명령문이 1개이어야만 한다.)
    // number -> number+10

    int addNumber(int num1, int num2){
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        return num1+num2;
    }

    // 매개변수, 명령문이 2개인 경우
    // 소괄호, 중괄호, 세미콜론, return 생략이 불가능하다.
    // (num1, num2) -> {
    //  System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
    //  return num1+num2;
    // }
}
