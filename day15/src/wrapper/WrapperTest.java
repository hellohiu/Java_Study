package wrapper;

public class WrapperTest {
    public static void main(String[] args) {
        // boxing
        Integer numInt = new Integer(3); // 권장 X
        Integer numInt2 = Integer.valueOf(3);
        Double numDouble = new Double(1.1); // 권장 X
        Double numDouble2 = Double.valueOf(1.1);

        System.out.println(numInt);
        System.out.println(numInt2);

        // unboxing
        int num = numInt.intValue(); //

        // auto-boxing
        Integer numInt3 = 3;

        // auto-unboxing
        int num2 = numInt3;
    }
}
