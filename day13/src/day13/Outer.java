package day13;

import java.util.LinkedList;

public class Outer {
    int var1;
    String var2;
    LinkedList<Integer> list = new LinkedList<>();

    class Inner{
        void methodI(){
            var1 = 10;
            method(); // 내부 클래스에서 외부 클래스의 멤버에 접근 가능
        }
    }

    void method(){;}
}
