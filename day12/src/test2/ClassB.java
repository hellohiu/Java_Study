package test2;

public class ClassB extends ClassA implements InterA{
    // ClassA와 InterA 양쪽에 printText() 메소드가 존재하지만 오류가 발생하지 않는다.
    // 구현하는 인터페이스 보다 상속받는 부모 클래스의 우선 순위가 높기 때문이다.
}
