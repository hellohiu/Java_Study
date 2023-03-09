package test2;

public class Test implements InterA, InterB, InterC{
    @Override
    public void printText() {
        // 어파치 부모에 정의된 default 메소드를 사용할 것이 때문에
        // 어떤 부모의 메소드를 사용할지 정해서 코드를 작성한다.
        InterA.super.printText();

        // 추가하거나 새로 재정의해도 된다.
        System.out.println("Test -> printText()");
    }
}
