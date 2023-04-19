package map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

public class JsonTest {
    public static void main(String[] args) {
        HashMap<String, Object> user = new HashMap<>();
        user.put("id", "abc123");
        user.put("pw", "1234");
        user.put("name", "홍길동");
        user.put("age", 22);
        System.out.println(user);
        // {pw=1234, name=홍길동, id=abc123, age=22}

        JSONObject json = new JSONObject(user); // user 가 Map -> JSON 형태로
        System.out.println(json.toJSONString());
        // {"name":"홍길동","id":"abc123","age":22,"pw":"1234"}

        System.out.println(json.get("id")); // abc123

        json.put("nickName", "hong");
        System.out.println(json);
        // {"name":"홍길동","id":"abc123","age":22,"nickName":"hong","pw":"1234"}

        user.put("id", "lyn123");
        user.put("pw", "1234");
        user.put("name", "이유나");
        user.put("age", 29);

        JSONArray arJson = new JSONArray();
        arJson.add(json);
        arJson.add(new JSONObject(user));

        System.out.println(arJson);
        System.out.println(arJson.get(0));
        // [{"name":"홍길동","id":"abc123","age":22,"nickName":"hong","pw":"1234"},
        System.out.println(arJson.get(1));
        // {"name":"이유나","id":"lyn123","age":29,"pw":"1234"}]
    }
}
