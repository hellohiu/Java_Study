package inner;

public class Main {
    public static void main(String[] args) {
        // 우선 외부클래스 만들기
        Outer o = new Outer();

        // 외부클래스.내부클래스 만들기
        Outer.InstanceInner ii = o.new InstanceInner();
        Outer.InstanceInner ii2 = new Outer().new InstanceInner();
        Outer.StaticInner si = new Outer.StaticInner();
    }
}
