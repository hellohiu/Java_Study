package day15;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 1번 방법
//    @Override // equals() 오버라이딩 !
//    public boolean equals(Object obj) {
//        if(this == obj){ return true; } // 주소값이 같으면 어차피 true
//
//        if(obj instanceof Person){ // 객체가 Person 타입이면 검사 아니면 바로 false
//            String other = ((Person)obj).name;
//            if(this.name.length() == other.length()){ // String name 길이 비교하여 동일하면 검사 아니면 바로 false
//                for(int i=0; i<this.name.length(); i++){
//                    if(name.charAt(i) != other.charAt(i)){
//                        return false;
//                    }
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    // 2번 방법
    @Override
    public boolean equals(Object obj) {
        if(this == obj){ return true; }

        if(obj instanceof Person){
            String other = ((Person)obj).name;
            return name.equals(other);
        }
        return false;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Person c = new Person("철수", 22);
        Person y = new Person("영희", 20);
        Person n = new Person("철수", 22);

        System.out.println(c == y); // false
        System.out.println(c == n); // false

        System.out.println(c.equals(y)); // false
        System.out.println(c.equals(n)); // false -> true : equals() 오버라이딩 하니 true

//        String str = "aa";
//        String str2 = "aa";
//        String str3 = new String("aa");

        // 주소값 비교
//        System.out.println(str == str2); // true
//        System.out.println(str == str3); // false
        // new 로 만드는 경우 무조건 Heap 영역에 새로 만들어짐
        // "aa" 리터럴 값으로 만드는 경우 String constant pool 에 만들어짐
        // 동일한 리터럴 값 ("aa")를 만드는 경우 String constant pool 에 있는 동일한 값을 가리킴
        // 그래서 str == str2 : true, str == str3 : false

//        System.out.println(str.equals(str2)); // true
//        System.out.println(str.equals(str3)); // true
    }
}

