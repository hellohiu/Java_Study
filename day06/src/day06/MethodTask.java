package day06;

public class MethodTask {
    public static void main(String[] args) {
        MethodTask mt = new MethodTask();
        mt.printName("한교동");
    }
    // 이름을 넘겨 받아서 "1. ~님 안녕하세요" 5번 출력하는 메소드
    void printName(String name){
        for(int i=0; i<5; i++){
            System.out.println((i+1) + ". " + name + "님 안녕하세요");
        }
    }
}
