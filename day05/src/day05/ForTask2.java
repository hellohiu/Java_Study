package day05;

public class ForTask2 {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.print(i + " ");
            if(i==5) {
                break;
            }
        } // 0 1 2 3 4 5 출력
        System.out.println();

        for(int i=0; i<10; i++){
            if(i==5) {
                break;
            }
            System.out.print(i + " ");
        } // 0 1 2 3 4 출력
        System.out.println();

        // 1~100까지의 합을 출력
        int sum = 0;
        for(int i=0; i<100; i++){
            sum += i+1;
        }
        System.out.println(sum); // 5050

        // 1~100까지 중 짝수의 합을 출력
        // 기타제어문 사용!
        int total = 0;
        for(int i=0; i<100; i++){
            if(i%2==0){
                continue;
            }
            total += i+1;
        }
        System.out.println(total);
    }
}
