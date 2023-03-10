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
        FunctionalInter fi2 = () -> System.out.println("람다식");
        fi2.method();
    }
}
