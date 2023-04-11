package wrapper;

import java.util.Arrays;

public class WrapperTask {
    public static void main(String[] args) {
        // 아래 값들을 하나의 배열에 담기, 단 String[] 사용 금지
        // 1, 3.14, 'A', "Dog", true

        Object[] arObj = {1, 3.14, 'A', "Dog", true};

        System.out.println(Arrays.toString(arObj));


    }
}
