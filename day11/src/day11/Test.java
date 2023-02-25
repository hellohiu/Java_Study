package day11;

import accessModifier.B;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.var1);
        // public(var1)만 사용 가능
        // protected(var3), default(var2)는 다른 패키지라 사용 불가능
        // private(var4)는 다른 클래스라 사용 불가능
        
    }
}
