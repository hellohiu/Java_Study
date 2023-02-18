package day08;

class Student {
    // 멤버 변수
    int math;
    int kor;
    int eng;
    double avg;
    String grade;

    public Student(){
        System.out.println("생성자");
    }

    // 멤버 메소드
    int getTotal(){
        return math+kor+eng;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.math = 20;
        System.out.println(st1.math);

        st2.math = 30;
        System.out.println(st2.math);

        st3.math = 40;
        System.out.println(st3.math);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
