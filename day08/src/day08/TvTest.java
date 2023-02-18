package day08;

class Tv {
    int inch;
    int price;
    String color;

    // 오버로딩 (다형성)
    public Tv(){
        // 기본 생성자
    }

    public Tv(int inch, int price){
        this.inch = inch;
        this.price = price;
        this.color = "black";
    }
    
    public Tv(int inch, int price, String color){
        this.inch = inch;
        this.price = price;
        this.color = color;
    }
}

public class TvTest {
    public static void main(String[] args) {
        Tv lgTv = new Tv(25, 500000, "White");
        System.out.println(lgTv.inch);
        System.out.println(lgTv.price);
        System.out.println(lgTv.color);
        
//        불편하다. 이럴 때 필드 초기화를 위해 생성자를 사용하면 좋다.
//        Tv samsungTv = new Tv();
//        samsungTv.inch = 25;
//        samsungTv.price = 250000;
//        samsungTv.color = "Black";
    }
}
