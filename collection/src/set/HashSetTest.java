package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> animalSet = new HashSet<>();
        animalSet.add("코알라");
        animalSet.add("원숭이");
        animalSet.add("양");
        animalSet.add("쥐");
        animalSet.add("기린");
        // animalSet.add(); 는 boolean 타입을 리턴한다.
        System.out.println(animalSet.add("하마")); // true
        System.out.println(animalSet.add("하마")); // false

        System.out.println(animalSet);
        System.out.println(animalSet.toString());

        /*
            내가 저장한 순서대로 값이 저장되지도 않고 값을
            가져올 수도 없는데 어떻게 toString()으로 가져오는가?
         */

        System.out.println("===================");

        Iterator<String> animalIter = animalSet.iterator();
//        System.out.println(animalIter.hasNext());
//        System.out.println(animalIter.next());

        while(animalIter.hasNext()){
            System.out.println(animalIter.next());
        }
    }
}
