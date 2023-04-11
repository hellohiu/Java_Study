package list;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // 추가하기 : add()
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(70);
        list.add(90);
        list.add(20);
        list.add(60);
        System.out.println(list);

        // index 번호로 특정 값 가져오기 : get(index)
        System.out.println(list.get(0));
        System.out.println(list.get(6));

        // index 번호로 특정 값 삭제하기 : remove(int index) -> int 타입으로 넘겨줘야 함
//        list.remove(6);
        System.out.println(list.remove(6) + "을(를) 삭제했습니다.");
//        list.remove(0);
        System.out.println(list.remove(0) + "을(를) 삭제했습니다.");

        System.out.println(list);

        // 값으로 검색하여 삭제하기 : remove(Object obj) -> Object 타입으로 넘겨줘야 함
        list.remove(Integer.valueOf(30));
        list.remove(Integer.valueOf(20));
        System.out.println(list);

        // 전체 삭제 : clear()
//        list.clear();
//        System.out.println(list);

        // 포함 여부 검사 (리스트에 존재하면 true, 없으면 false) : contains(값)
        System.out.println(list.contains(80));
        System.out.println(list.contains(70));
    }
}
