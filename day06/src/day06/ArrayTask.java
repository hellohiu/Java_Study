package day06;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        // 100~1까지의 값 배열에 넣고 출력
        int[] arData1 = new int[100];
        for(int i=0; i<arData1.length; i++){
            arData1[i] = arData1.length - i;
        }
        for(int i=0; i<arData1.length; i++){
            System.out.println(arData1[i]);
        }

        // 1~10까지 값을 배열에 넣고 총 합 구하기
        int[] arData2 = new int[10];
        int sum = 0;
        for(int i=0; i<arData2.length; i++){
            arData2[i] = i+1;
            sum += arData2[i];
        }
        System.out.println(sum);

        // 3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수 출력
        Scanner sc = new Scanner(System.in);
        int[] arData3 = new int[3];
        String msg = "번 학생의 수학점수 >> ";
        int total = 0;
        for(int i=0; i<arData3.length; i++){
            System.out.print(i+1 + msg);
            arData3[i] = sc.nextInt();
            total += arData3[i];
        }
        System.out.println("평균 >> " + (double)total/arData3.length);

        // 0,1,2,3,4,0,1,2,3,4 배열에 담고 출력 (값이 10개)
        int[] arData4 = new int[10];
        for(int i=0; i<arData4.length; i++){
            arData4[i] = i%5;
        }
        for(int i=0; i<arData4.length; i++){
            System.out.println(arData4[i]);
        }

        // A~F까지 배열에 값 넣고 출력하기 (65~70)
        char[] arData5 = new char[6];
        for(int i=0; i<arData5.length; i++){
            arData5[i] = (char)(i+65);
        }
        for(int i=0; i<arData5.length; i++){
            System.out.print(arData5[i]);
        }
    }
}
