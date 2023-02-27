package casting;

class Tv {
    int vol;
    int ch;
    boolean power;

    void chUp(){;}
    void chDown(){;}
    void volUp(){;}
    void volDown(){;}
    void powerOnOff(){;}
}

class SmartTv extends Tv {
    void netflix(){;}
}

public class CastingTest {
    public static void main(String[] args) {
        // Up Casting (상속 관계에서만 가능하다!)
        // 1번
//      SmartTv smartTv = new SmartTv();
//      Tv tv = (Tv)smartTv;
//      자료형 변수명 = 값 ;

        // 2번
//      Tv tv = (Tv)new SmartTv();

        // 3번
        Tv tv = new SmartTv();

//      부모클래스 타입의 참조변수로 자식클래스 타입의 객체를 참조한다. (가리키게 한다.)
//      부모클래스 타입의 참조변수에 자식클래스 타입의 객체의 주소값을 저장한다.

        // Down Casting (업캐스팅 된 것만 가능하다!)
        SmartTv smartTv2 = (SmartTv)tv;
        System.out.println(smartTv2.ch);

//      잘못된 down casting
        Tv parents = new Tv();
//      SmartTv child = (SmartTv)parents; -> 오류 발생
//      down casting은 반드시 up casting 된 객체로 해야한다.
//      즉, up casting 된 객체를 다시 원래 자식 타입으로 돌리는 것이 down casting이다.
    }
}
