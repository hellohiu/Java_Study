package anonymousTest;

public class Main {
    public static void main(String[] args) {
        InterA a = new InterA() {
            @Override
            public void printData() {
                System.out.println("익명클래스로 재정의 함.");
            }
        };

        a.printData();
    }
}
