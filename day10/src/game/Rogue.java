package game;

import java.util.Random;

public class Rogue extends Character {
    static int[] randomDmg = {20, 30, 40, 50, 60, 70, 80, 90, 100};

    public Rogue(){
        super("로그", 20, 20, 3, 20, 100);
    }

    @Override
    void normalAttack() {
        if(!checkMp(3)){
            return;
        }
        System.out.println(name + "이(가) 기본 공격을 가했습니다.");
        System.out.println("적에게 " + normalDmg + "만큼의 피해를 입혔습니다.");
        mp -= 3;
        showStatus();
    }

    @Override
    void skillAttack() {
        if(!checkMp(2)){
            return;
        }
        System.out.println("적에게 " + skillDmg + "만큼의 피해를 입혔습니다.");
        hp -= 5;
        mp -= 2;
        revive();
        showStatus();
    }

    @Override
    void specialAttack() {
        Random r = new Random();
        int index = r.nextInt(randomDmg.length);
        System.out.println(name + "이(가) 스킬 시전 중!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("적에게 " + randomDmg[index] + "만큼의 피해를 입혔습니다.");
    }
}
