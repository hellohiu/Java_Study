package task;

class Student{
    String name;
    int age;
    int number;

    int math;
    int kor;
    int eng;

    public Student(String name, int age, int number, int math, int kor, int eng) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.math = math;
        this.kor = kor;
        this.eng = eng;
    }

//    @Override
//    public String toString() {
//        return "나는 학생이다!";
//    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", math=" + math +
                ", kor=" + kor +
                ", eng=" + eng +
                '}';
    } // alt + insert -> toString()
}

public class ToStringTask {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동", 16, 1, 55, 90, 100);
        System.out.println(s1);
        // ↑ 원래 참조값 task.Student@4eec7777 출력됨
        // 근데 위에 toString() 오버라이딩 해줘서 아래 내용이 출력됨
        // Student{name='홍길동', age=16, number=1, math=55, kor=90, eng=100}
    }
}
