package day06;

public class ArrayTest {
    public static void main(String[] args) {
        // 2행 3열
        int[][] arrData = {{1,2,3},{4,5,6}};
//      => int[][] arrData = new int[2][3];

        for(int i=0; i<arrData.length; i++){
            for(int j=0; j<arrData[i].length; j++){
                System.out.println(arrData[i][j]);
            }
        }
    }
}
