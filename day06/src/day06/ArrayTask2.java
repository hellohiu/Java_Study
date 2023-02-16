package day06;

import java.util.Scanner;

public class ArrayTask2 {
    public static void main(String[] args) {
        // A~F까지 중 C를 제외하고 저장하고 출력
        char[] arData1 = new char[5];
        int temp = 0;
        for(int i=0; i<arData1.length; i++){
            temp = i;
            if(temp>1){temp++;}
            arData1[i] = (char)(temp+65);
        }
        for(int i=0; i<arData1.length; i++){
            System.out.print(arData1[i]);
        }
        System.out.println();

        // 5개의 정수를 입력한 뒤 배열에 담고 최대값과 최소값 출력하기
        Scanner sc = new Scanner(System.in);
        int[] arData2 = new int[5];
        String msg = "번째 정수 입력 >> ";
        for(int i=0; i<arData2.length; i++){
            System.out.print((i+1) + msg);
            arData2[i] = sc.nextInt();
        }
        int max = arData2[0], min = arData2[0];
        for(int i=0; i<arData2.length; i++){
            if(arData2[i] > max){ max = arData2[i]; }
            if(arData2[i] < min){ min = arData2[i]; }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
