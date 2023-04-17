package listTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListTask1 {
    /*
        1~20까지의 난수를 만들어 ArrayList에 5개 저장한다.
        (1) 중복되는 수는 없도록 한다.
        (2) 정렬한다.
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for(int i=0; i<5; i++){
            int tmp = r.nextInt(20)+1;
            if(!list.contains(tmp)){
                list.add(tmp);
            }else{
                i--;
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
