package set;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(30);
        System.out.println(list); // 중복된 값 모두 포함한 list

        HashSet<Integer> set = new HashSet<>(list);
        System.out.println(set); // list 에서 중복된 값 모두 제외한 set

        ArrayList<Integer> result = new ArrayList<>(set);
        System.out.println(result); // 중복된 값 모두 제외한 list
    }
}
