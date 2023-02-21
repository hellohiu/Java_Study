package car;

public class SuperCar extends Car {
    boolean booster;

    public SuperCar(String brand, String color, int price, boolean booster) {
        super(brand, color, price);
        this.booster = booster;
    }

    void boosterOn(){
        System.out.println("부스터 on");
    }

    void boosterOff(){
        System.out.println("부스터 off");
    }

    @Override
    void engineStart() {
//      super.engineStart();  ->  부모 클래스의 메소드도 실행됨
        System.out.println("슈퍼카 시동!!!");
    }
}
