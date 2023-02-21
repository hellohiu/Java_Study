package game;

public class Warrior extends Character {
    public Warrior(){
        super("전사", 30, 10, 5, 15, 100);
    }

    @Override
    void skillAttack() {
        if(!checkMp(3)){
            System.out.println("MP 부족!");
            return;
        }
        System.out.println(name + "이(가) 스킬 공격!");
        System.out.println("적에게 " + skillDmg + "만큼 피해를 입혔습니다.");
        mp -= 3;
        showStatus();
    }

    @Override
    void specialAttack() {
        System.out.println(name + "이(가) 스킬 시전 중!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("적에게 " + specialDmg + "만큼의 피해를 입혔습니다.");
        hp -= 10;
        revive();
        showStatus();
    }
}
