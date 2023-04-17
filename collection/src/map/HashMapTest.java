package map;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "에이");
        map.put("B", "비");
        map.put("C", "시");
        map.put("C", "씨"); // 마지막에 넣은 값으로 저장됨
        System.out.println(map);

        System.out.println(map.get("A"));
        System.out.println(map.size());
        System.out.println(map.keySet());
    }
}
