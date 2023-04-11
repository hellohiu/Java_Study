package list;

// 제네릭을 사용하는 이유?
// 1. 제네릭을 사용하지 않는다면 필드의 타입별로 클래스를 만들어야 한다.
// 2. 제네릭 대신 Object 타입을 사용한다면 다운캐스팅을 사용해야해서 불편하다.
// 3. 제네릭은 타입을 제한할 수 있다. (Object는 모든 타입을 다 받는다.)

class MyClass<T>{
    T data;

    public MyClass(T data) {
        this.data = data;
    }

    void printData(){
        System.out.println(data);
    }
}

public class GenericTest {
    public static void main(String[] args) {
        MyClass<String> mc = new MyClass<>("하이");
        mc.printData();

        MyClass<Integer> mc2 = new MyClass<>(3);
        mc2.printData();
    }
}
