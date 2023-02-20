package inheritance;

class Parents {
    int num;

    public Parents() {
        System.out.println("부모 생성자");
    }

    void printStr(String str){
        System.out.println(str);
    }
}

class Child extends Parents {
    int data;

    public Child() {
        // super();
        System.out.println("자식 생성자");
    }

    void print(int num){
        System.out.println(num);
    }
}

public class Test {
    public static void main(String[] args) {
        Child ch = new Child();
        
        ch.printStr("안녕");
        // 상속받았기 때문에 Parents의 메소드 사용 가능함
    }
}
