package day03;

public class Casting {
    public static void main(String[] args) {
        System.out.println((int)3.7); // 3
        System.out.println((double)1); // 1.0
        System.out.println((char)97); // a

        int num1 = 10, num2 = 20;
        String number1 = "10", number2 = "20";

        System.out.println(num1 + num2); // 30 (연산)
        System.out.println(number1 + number2); // 1020 (연결)

        System.out.println(3+2+"3"+5); 
        // 535 : 3+2 연산 -> 5+"3" 연결 -> "53"+5 연결
        System.out.println(3+(2+"3")+5); 
        // 3235 : 최우선연산자 (2+"3") 연결 -> 3+"23" 연결 -> "323"+5 연결
        System.out.println("제 나이는 " + num2 + "살 입니다.");

        // Integer.parseInt();  ->  문자열을 정수로 바꿔주는 메소드
        System.out.println(Integer.parseInt(number1) + 10); // 20
        // Double.parseDouble();  ->  문자열을 실수로 바꿔주는 메소드
        System.out.println(Double.parseDouble("3.0") + 0.5); // 3.5
    }
}
