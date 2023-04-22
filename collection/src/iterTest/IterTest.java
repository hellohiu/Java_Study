package iterTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class IterTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] ar = new int[4];
        list.add(3);
        list.add(10);
        list.add(5);
        list.add(88);

        Iterator<Integer> iter = list.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        } // 커서가 다 돌면 되돌릴 수 없고 (일회성) 다시 만들어줘야 함

        iter = list.iterator();
        int i=0;
        while(iter.hasNext()){
            ar[i] = iter.next();
            i++;
        }

        for(int num : ar){
            System.out.println(num);
        }

        HashSet<Integer> set = new HashSet<>(list);
    }
}
