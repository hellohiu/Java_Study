package set;

import java.util.HashSet;

public class HashTest {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student st = new Student(1, "홍길동");

        boolean isTrue = st.equals(new Student(1, "홍길동"));
        System.out.println(isTrue);

        set.add(new Student(1, "홍길동"));
        set.add(new Student(1, "홍길동"));

        System.out.println(set.size());
    }
}
