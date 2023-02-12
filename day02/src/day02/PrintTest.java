package day02;

public class PrintTest {
    public static void main(String[] args) {
        String name = "한교동";

        String str1 = "메로나";
        String str2 = "누네띠네";
        String str3 = "꼬북칩";
        String str4 = "홈런볼";

        int price1 = 2000;
        int price2 = 1500;
        int price3 = 1000;
        int price4 = 900;

        System.out.print("올 때 ");
        System.out.print("메로나\n");
//      System.out.println();
        System.out.print("안녕\n");

        System.out.println("제 이름은 name 입니다.");
        // 출력 > 제 이름은 name 입니다.
        System.out.printf("제 이름은 %s 입니다.\n", name);
        // 출력 > 제 이름은 한교동 입니다.

        System.out.printf("수학 점수: %d점\n", 100);
        // 출력 > 수학 점수: 100점
        System.out.printf("수학 점수: %10d점\n", 100);
        // 출력 > 수학 점수:        100점 (%d를 10칸으로 설정, 빈 공간은 공백)
        System.out.printf("수학 점수: %010d점\n", 100);
        // 출력 > 수학 점수: 0000000100점 (%d를 10칸으로 설정, 빈 공간은 0으로)

        System.out.printf("평균 점수 : %f점\n", 88.1555);
        // 출력 > 평균 점수 : 88.155500점
        System.out.printf("평균 점수 : %.2f점\n", 88.1555);
        // 출력 > 평균 점수 : 88.16점

        System.out.printf("나의 학점은 %c 입니다.\n", 'A');
        // 출력 > 나의 학점은 A 입니다.

        System.out.printf("%-5s\t\t%5d원\n", str1, price1);
        // 출력 > 메로나  		 2000원
        System.out.printf("%-5s\t\t%5d원\n", str2, price2);
        // 출력 > 누네띠네 		 1500원
        System.out.printf("%-5s\t\t%5d원\n", str3, price3);
        // 출력 > 꼬북칩  		 1000원
        System.out.printf("%-5s\t\t%5d원\n", str4, price4);
        // 출력 > 홈런볼  		  900원
    }
}
