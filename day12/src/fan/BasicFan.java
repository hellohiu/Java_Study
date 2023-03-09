package fan;

public class BasicFan extends FanAdapter {
    @Override
    public void on() {
        System.out.println("버튼으로 전원 켜기");
    }

    @Override
    public void off() {
        System.out.println("버튼으로 전원 끄기");
    }
    // FanAdapter으로 turbo()를 override 할 강제성이 사라졌다.
}