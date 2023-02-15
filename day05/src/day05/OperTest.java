package day05;

public class OperTest {
    public static void main(String[] args) {
        int a = 1;
        // 후위형 : 증감연산자가 끝난 시점부터 적용 (상관없을 때는 거의 후위형으로 작성함)
        System.out.println(a++); // 1
        System.out.println(a); // 2

        int b = 1;
        // 전위형 : 해당 라인부터 바로 적용
        System.out.println(++b); // 2
        System.out.println(b); // 2

    }
}
