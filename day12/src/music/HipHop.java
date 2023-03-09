package music;

// 힙합 클래스
// mode 메소드를 오버라이딩 -> "힙합 모드" 출력
// onlyHipHop 메소드 만들기 -> "onlyHipHop 실행" 출력

public class HipHop implements Music{
    @Override
    public void mode() {
        System.out.println("힙합 모드");
    }
    
    void onlyHipHop(){
        System.out.println("onlyHipHop 실행");
    }
}
