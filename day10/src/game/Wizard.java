package game;

public class Wizard extends Character {
    public Wizard(){
        super("마법사", 15, 30, 1, 30, 100);
    }

    @Override
    void normalAttack() {
        super.normalAttack(); // 기본의 normalAttack 메소드 실행
        hp -= 2;
        revive();
    }

}
