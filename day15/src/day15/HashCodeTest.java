package day15;

class Car{;}

public class HashCodeTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        // 주소값이 다르기 때문에 c1, c2 다른 값이 나옴
        // 정말 낮은 확률로 주소값이 달라도 같은 값이 나올 수 있음
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = "abc";

        // String 은 hashCode()가 재정의 되어있음
        // str1, str2, str3 모두 같은 값이 나옴
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
    }
}
