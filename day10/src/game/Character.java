package game;

public class Character {
    // 캐릭터 이름
    String name;
    // 현재 체력
    int hp;
    // 현재 마나
    int mp;
    // 최대 체력
    int maxHp;
    // 최대 마나
    int maxMp;

    // 기본 공격력
    int normalDmg;
    // 스킬 공격력
    int skillDmg;
    // 특수 공격력
    int specialDmg;

    public Character(String name, int maxHp, int maxMp, int normalDmg, int skillDmg, int specialDmg) {
        super();
        this.name = name;
        this.hp = maxHp;
        this.mp = maxMp;
        this.maxHp = maxHp;
        this.maxMp = maxMp;
        this.normalDmg = normalDmg;
        this.skillDmg = skillDmg;
        this.specialDmg = specialDmg;
    }

    void showStatus(){
        System.out.println("--- 현재 상태 ---");
        System.out.println("Hp : " + hp + "/" + maxHp);
        System.out.println("Mp : " + mp + "/" + maxMp);
    } // 현재 상태 확인

    void normalAttack(){
        System.out.println(name + "(이)가 기본 공격을 실행했습니다.");
        System.out.println("적에게 " + normalDmg + "만큼 피해를 입혔습니다.");
        showStatus();
    } // 일반 공격

    void skillAttack(){
        if(!checkMp(10)){
            return;
        }
        System.out.println(name + "(이)가 스킬 공격을 실행했습니다.");
        System.out.println("적에게 " + skillDmg + "만큼 피해를 입혔습니다.");
        System.out.println("mp가 10만큼 줄어들었습니다.");
        mp -= 10;
        showStatus();
    } // 스킬 공격

    void specialAttack(){
        if(!checkMp(10)){
            return;
        }
        System.out.println(name + "이(가) 스킬 시전 중");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("적에게 " + specialDmg + "만큼의 피해를 입혔습니다.");
        mp -= 10;
        hp -= 10;
        revive();
        showStatus();
    } // 특수 공격

    boolean checkMp(int needMp){
        if(mp < needMp){ return false; }
        else { return true; }
    } // Mp 체크

    void revive(){
        if(hp <= 0){
            System.out.println("체력이 없어서 부활합니다.");
            hp = maxHp;
            mp = maxMp;
        }
    }

}
