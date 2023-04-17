package listTask2;

public class UserVO {
    private String id;
    private String pw;
    private String name;
    private String age;

    public UserVO(String id, String pw, String name, String age) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
