package swap;

class Student {
    int math;
    int kor;
    int eng;

}
public class ArrayTest {
    public static void main(String[] args) {
        int[] ar = {1,2,3};
        int[] ar2 = ar;

        ar[1] = 100;
        System.out.println(ar2[1]);
        // ar2는 ar과 같은 주소값을 가리키고 있기 때문에 ar2[1]의 값도 100이다.

        Student st1 = new Student();
        Student st2 = st1;
        st1.math = 100;
        st1.eng = 30;
        st1.kor = 20;

        // st1과 주소가 같기 때문에 math, eng, kor 모두 동일하다.
        System.out.println(st2.math); // 100
        System.out.println(st2.eng); // 30
        System.out.println(st2.kor); // 20
    }
}
