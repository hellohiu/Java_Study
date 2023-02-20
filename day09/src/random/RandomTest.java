package random;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();

        // r.nextInt(n);
        // 0 ~ n-1 까지 무작위 숫자를 반환한다.
        int num = r.nextInt(8);
        System.out.println(num);

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
