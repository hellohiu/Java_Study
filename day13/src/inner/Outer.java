package inner;

public class Outer {
    int instanceVariable;
    static int staticVariable;

    class InstanceInner{;}

    static class StaticInner{;}

    void instanceMethod(){
        int localVariable;
        class LocalInner{;}

        // 메소드 안에서 객체화 시키기
        LocalInner li = new LocalInner();
        InstanceInner ii = new InstanceInner();
        StaticInner si = new StaticInner();
    }
}
