package toy;

import java.util.Random;

public class Company {
    String branch; // 지점

    public Company(String branch) {
        this.branch = branch;
    }

    // Toy를 구현하여 만든 장난감을 회사에 등록하기 위한 메소드
    public void register(Toy toy){
        String[] list = toy.speakList();
        Random r = new Random();
        int index = r.nextInt(list.length);

        System.out.println("지점 : " + branch);
        for(int i=0; i<list.length; i++){
            System.out.println(i+1 + ". " + list[i]);
        }

        System.out.println("===================");

        if(toy instanceof ToyAdapter){
            System.out.println("버튼이 존재하지 않는다.");
            return;
        }
        toy.pushBtn(list[index]);
    }
}
