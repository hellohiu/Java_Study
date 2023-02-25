package accessModifier;

class A {
    public int var1;
    int var2; // 아무것도 쓰지 않았을 때는 default
    protected int var3;
    private int var4;
}
public class AccessTest {
    public static void main(String[] args) {
        A a = new A();
        // var1, var2, var3만 사용 가능!
        // var4(private)는 다른 클래스에서 접근 불가능!
    }
}
