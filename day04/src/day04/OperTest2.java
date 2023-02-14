package day04;

public class OperTest2 {
    public static void main(String[] args) {
        int num1 = true ? 10 : 20;
        int num2 = false ? 10 : 20;

        System.out.println(true ? 10 : 20); // 10
        System.out.println(num1); // 10
        System.out.println(false ? 10 : 20); // 20
        System.out.println(num2); // 20

        System.out.println(10>=1 ? 1 : -1); // 10>=1이 true이므로 1 출력
    }
}
