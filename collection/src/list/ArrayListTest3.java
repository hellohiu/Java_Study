package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add((10-i) * 10);
        }
        System.out.println(list);

        // Collections 클래스 : 컬렉션 프레임워크와 관련된 여러 메소드를 가지고 있다.
        // 일부 알고리즘도 구현해놓았다.
        // static 메소드로 구현했기 때문에 객체를 만들 필요가 없다.
        Collections.sort(list); // 정렬
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // 역정렬
        System.out.println(list);

        Collections.shuffle(list); // 섞기
        System.out.println(list);

        Collections.reverse(list); // 현재 값들을 반대로 뒤집기 (정렬은 아님)
        System.out.println(list);

        System.out.println(Collections.max(list)); // 최대값
        System.out.println(Collections.min(list)); // 최소값
    }
}
