package lambda;

public class Main {
    public static void main(String[] args) {
        FunctionalInter fi = new FunctionalInter() {
            @Override
            public void method() {
                System.out.println("익명 객체의 메소드 재정의");
            }
        };

        fi.method();

        // 람다식
        FunctionalInter fii = () -> System.out.println("람다식");
        fii.method();

        // 람다식
        FunctionalInter2 fi2 = number -> number + 10;
        System.out.println(fi2.add10(10));

        FunctionalInter3 fi3 = (num1, num2) -> {
            System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
            return num1 + num2;
        };
        int result = fi3.method(3,8);
        System.out.println(result);
    }
}
