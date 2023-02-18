package day08;

class A {
    int a;
    String str;

    // this : 객체의 입장에서 자기 자신의 주소
    void method(){
        System.out.println(this);
    }

    void methodVar(){
        System.out.println(this.a);
        System.out.println(this.str);
    }
}

public class ClassTest {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        // 똑같은 참조값
        a1.method();
        System.out.println(a1);
        a2.method();
        System.out.println(a2);

        // 각각(a1,a2)의 a값과 str값이 출력됨
        a1.methodVar();
        a2.methodVar();
    }
}
