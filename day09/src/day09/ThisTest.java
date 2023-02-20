package day09;

class Car {
    String brand;
    String color;
    int price;

    public Car() {
        this("KIA", "Black", 3400);
//      this.brand = "KIA";
//      this.color = "Black";
//      this.price = 3400;
    }

    public Car(String brand, String color) {
        this(brand, color, 2500);
    }

    public Car(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
}

public class ThisTest {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "White", 6500);
        Car car2 = new Car("AUDI", "Yellow");
        Car car3 = new Car();

        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.price);

        System.out.println(car2.brand);
        System.out.println(car2.color);
        System.out.println(car2.price);
    }
}
