package day06;

public class MethodTest {
    public static void main(String[] args) {
        MethodTest methodTest = new MethodTest();
        System.out.println(methodTest.addTen(25));
        System.out.println(methodTest.addTen(3));
        System.out.println(methodTest.addTen(16));
    }
    
    int addTen(int num){
        return num + 10;
    } // 10을 더한 숫자를 반환하는 메소드
}
