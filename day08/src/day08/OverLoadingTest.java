package day08;


public class OverLoadingTest {
    public static void main(String[] args) {
        OverLoadingTest ol = new OverLoadingTest();
    }

    // 매개변수의 개수 혹은 타입이 다른 경우에는
    // 같은 이름으로 메소드 오버로딩이 가능함 (생성자도 오버로딩이 가능!)
    int sum(int num1, int num2){
        return num1 + num2;
    }

    int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    int sum(int num1, double num2){
        return num1 + (int)num2;
    }

    int sum(int num1){
        return num1 + 10;
    }
}
