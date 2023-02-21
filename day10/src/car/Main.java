package car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "White", 6500);
        car.engineStart();

        SuperCar sc = new SuperCar("BMW", "White", 6500, false);
        sc.engineStart(); // 오버라이딩한 메소드가 출력됨

    }
}
