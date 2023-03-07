package music;

// 발라드 클래스
// mode 메소드를 오버라이딩 -> "발라드 모드" 출력
// onlyBallad 메소드 만들기 -> "onlyBallad 실행" 출력

public class Ballad extends Music{
    @Override
    void mode() {
        System.out.println("발라드 모드");
    }
    
    void onlyBallad(){
        System.out.println("onlyBallad 실행");
    }
}
