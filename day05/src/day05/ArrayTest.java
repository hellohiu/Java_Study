package day05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] ar = new int[5];
        System.out.println(ar); // 주소값 출력 : [I@776ec8df

        // 배열 선언 후 1~10까지 값 넣기
        int[] arData = new int[10];
        for(int i=0; i<arData.length; i++){
            arData[i] = i+1;
        } // 값 저장
        for(int i=0; i<arData.length; i++){
            System.out.println(arData[i]);
        } // 값 출력
    }
}
