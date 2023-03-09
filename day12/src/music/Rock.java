package music;

// 락 클래스
// mode 메소드를 오버라이딩 -> "락 모드" 출력
// onlyRock 메소드 만들기 -> "onlyRock 실행" 출력

public class Rock implements Music{
    @Override
    public void mode() {
        System.out.println("락 모드");
    }

    void onlyRock(){
        System.out.println("onlyRock 실행");
    }
}
