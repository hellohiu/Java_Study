package lambdaTask;

public class Main {
    public static void main(String[] args) {
//      MultipleInter mi = (num1, num2) -> num1 * num2;

//      MultipleInter multi = calculator(true);
//      int result = multi.multiple(4,5);

        int result1 = calculator(true).multiple(4,5);
        System.out.println(result1); // 20
        int result2 = calculator(false).multiple(4,5);
        System.out.println(result2); // 0
    }

    // 두 수의 곱을 구하는 프로그램
    // true : 두 수를 곱해서 반환, false : 0을 반환
    public static MultipleInter calculator(boolean isTrue){
        MultipleInter multi = null;
        if(isTrue){
            multi = (num1, num2) -> num1 * num2;
        }else{
            multi = (num1, num2) -> 0;
        }
        return multi;
    }
}
