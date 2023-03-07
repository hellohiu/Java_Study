package animal;

public abstract class Animal {
    int age;
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void crying();
    // 추상메소드 : 무조건 오버라이딩 해야하므로 강제성을 준다!
}
