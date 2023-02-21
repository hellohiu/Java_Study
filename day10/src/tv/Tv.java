package tv;

// Tv 클래스는 vol, ch, power 멤버변수 만들기
// volUp, volDown, chUp, chDown
// powerOnOff 메소드 만들기

// Tv2 클래스는 Tv를 상속받고 mode 멤버변수 만들기
// SmartTv 클래스는 Tv2를 상속받고
// netflix 메소드 만들기

public class Tv {
    int vol;
    int ch;
    boolean power;

    void volUp(){
        vol++;
    }

    void volDown(){
        vol--;
    }

    void chUp(){
        ch++;
    }

    void chDown(){
        ch--;
    }

    void powerOnOff(){
        this.power = !this.power;
    }
}
