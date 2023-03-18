package day15;


class Person {
    public Person(){
        super();
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        String str = "aa";
        String str2 = "aa";
        String str3 = new String("aa");

        // 주소값 비교
        System.out.println(str == str2); // true
        System.out.println(str == str3); // false
        // new 로 만드는 경우 무조건 Heap 영역에 새로 만들어짐
        // "aa" 리터럴 값으로 만드는 경우 String constant pool 에 만들어짐
        // 동일한 리터럴 값 ("aa")를 만드는 경우 String constant pool 에 있는 동일한 값을 가리킴
        // 그래서 str == str2 : true, str == str3 : false

        System.out.println(str.equals(str2)); // true
        System.out.println(str.equals(str3)); // true
    }
}
