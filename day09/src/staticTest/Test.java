package staticTest;

class A {
    int a = 5;
    static int b = 4;
    // static : 공유되는 저장 공간으로 인스턴스 없이도 사용 가능

    public A(){}
}

public class Test {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        a1.a = 10;
        a1.b = 100;

        System.out.println("a1의 a = " + a1.a); // 10
        System.out.println("a1의 b = " + a1.b); // 100
        System.out.println("======================");
        System.out.println("a2의 a = " + a2.a); // 5
        System.out.println("a2의 b = " + a2.b); // 100
    }
}
