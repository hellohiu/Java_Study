package day08;

import java.util.Scanner;

class Creature {
    // 캐릭터 이름
    String name;
    // hp
    int hp;
    // 밥 먹은 수
    int eatCnt;
    // 턴
    int turn;
    // 변
    boolean poo;

    public Creature(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // 먹기 : 턴 1증가, hp 2증가
    void eat(){
        this.turn++;
        this.hp+=2;
        this.eatCnt++;
    }

    // 자기 : 3초 동안 잠에 든다. hp 2감소, 턴 2증가
    void sleep(){
        for(int i=0; i<3; i++) {
            System.out.println("Zzz..");
            try {
                Thread.sleep(1000); // 매개변수로 밀리초를 넘겨준다 (1000 : 1초)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("잠에서 깼다..");
        this.hp-=2;
        this.turn+=2;
    }

    // 대변보기 : 밥을 3번 먹으면 실행, 변을 안치우면 1턴당 hp -1
    void poop(){
        System.out.println("변을 봤다..");
        this.poo = true;
        this.eatCnt = 0;
    }

    // 청소하기 : 대변을 치운다.
    void cleanUp(){
        System.out.println("청소중..");
        this.poo = false;
    }

    // 상태보기
    void printState(){
        System.out.println(this.turn + "일차");
        System.out.println("이름 : " + this.name);
        System.out.println("HP : " + this.hp);
    }
}

public class Game {
    public static void main(String[] args) {
        String title = "☆★☆★☆★☆★☆★☆★\n" +
                "☆★☆★다마고치☆★☆★\n" +
                "☆★☆★☆★☆★☆★☆★\n";
        String mainMsg = "1.캐릭터 선택\n2.종료\n입력 >> ";
        String charMsg = "1.피카츄\n2.두더지\n3.긴팔원숭이\n4.돌아가기\n입력 >> ";
        String gameMsg = "1.먹기\n2.자기\n3.청소하기\n4.상태확인\n입력 >> ";
        boolean isRun = true;
        int choice = 0, gameChoice = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println(title);
        while(isRun){
            System.out.print(mainMsg);
            choice = sc.nextInt();
            if(choice == 2){ break; }

            System.out.print(charMsg);
            choice = sc.nextInt();
            if(choice == 4){ continue; }

            Creature[] creature = {
                    new Creature("피카츄", 3),
                    new Creature("두더지", 2),
                    new Creature("긴팔원숭이", 4)
                };

            while(true){
                System.out.println(gameMsg);
                gameChoice = sc.nextInt();
                Creature myChar = creature[choice-1];
                // 1.먹기 2.자기 3.청소하기 4.상태확인
                switch(gameChoice){
                case 1 :
                    myChar.eat();
                    System.out.println("냠냠...");
                    break;
                case 2 :
                    myChar.sleep();
                    break;
                case 3 :
                    myChar.cleanUp();
                    break;
                case 4 :
                    myChar.printState();
                    break;
                default :
                    System.out.println("잘못 입력하셨습니다.");
                }

                if(myChar.eatCnt >= 3){ myChar.poop(); }
                if(myChar.poo){
                    System.out.println("변을 치워야 합니다.");
                    myChar.hp--;
                }
                if(myChar.turn >= 10){
                    System.out.println("☆★☆★☆★☆★☆★☆★");
                    myChar.printState();
                    System.out.println("☆★☆★☆★☆★☆★☆★");
                    System.out.println(myChar.hp >= 5 ? "해피엔딩" : "게임오버");
                    break;
                }
            }
        }
    }
}
