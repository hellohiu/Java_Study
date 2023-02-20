package staticTest;

public class Test2 {
    public static void main(String[] args) {
        method1();
        Test2.method1();
        a = 3;
        int a2 = Test2.a; // 클래스명.멤버명으로 사용 가능
        System.out.println(a2);
    }

    // static 변수
    static int a;
    
    // 인스턴스 변수
    int b;
    int c;

    // static 메소드
    static void method1(){
        System.out.println("method1()");
    }

    // 인스턴스 메소드
    void method2(){

    }
}
