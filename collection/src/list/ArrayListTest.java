package list;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
//        ArrayList al = new ArrayList();
//        al.add(3);
//        al.add(4.5);
//        al.add(5);
//        al.add("String");
//
//        for(int i=0; i<al.size(); i++){
//            System.out.println(al.get(i));
//        }

        // <Element> : 제네릭
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<10; i++){
            list.add((i+1) * 10);
        }

        // 향상 for문, forEach문 (배열도 가능)
        for(int data : list){
            System.out.println(data);
        }

        System.out.println(list);

        for(int data : new int[]{1,2,3,4,5}){
            System.out.println(data);
        }
    }
}
