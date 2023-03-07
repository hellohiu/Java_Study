package day12;

abstract class A{ // 추상클래스
    abstract void method1(); // 추상메소드
    void method2(){
        System.out.println("메소드2 실행!");
    }
}

class B extends A{
    @Override
    void method1() {
        System.out.println("method1 오버라이딩!");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
//      A a = new A();  ->  추상클래스 객체화 불가능
        A a = new B();
        B b = new B();

        a.method1();
        a.method2();

        b.method1();
        b.method2();
    }
}
