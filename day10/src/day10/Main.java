package day10;

class Parents {
    public Parents(int a, int b) {
        System.out.println("부모생성자 실행됨");
    }
}

class Child extends Parents {
    public Child() {
        // super(); 모든 클래스의 생성자에는 super();가 숨겨져있음
        super(3,5);
        System.out.println("자식생성자 실행됨");
    }
}

public class Main {
    public static void main(String[] args) {
//      Parents p = new Parents();
        Child c = new Child();  // 부모생성자 실행됨
                                // 자식생성자 실행됨
    }
}
