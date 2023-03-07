package inter;

public interface Inter {
    // 멤버 전부 상수이므로 final 생략 가능함
    int VAR1 = 10; // public static final int VAR1 = 10;
    int VAR2 = 20;

    // 멤버 전부 추상메소드이므로 abstract 생략 가능함
    void method1(); // public abstract void method1();
    void method2();
}
