package casting;

class A{

}

class B extends A{

}

public class TypeTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(a instanceof A);
        // a가 A 타입이니? -> true
        System.out.println(b instanceof A);
        // b가 A 타입이니? -> true (b는 a 상속받으니까)
        System.out.println(a instanceof B);
        // a가 B 타입이니? -> false
        System.out.println(b instanceof B);
        // b가 B 타입이니? -> true
    }
}
