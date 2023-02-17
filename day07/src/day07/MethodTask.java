package day07;

public class MethodTask {

    public static void main(String[] args) {
        MethodTask task = new MethodTask();
        task.printName("스누피");
        System.out.println(task.getTotalFrom1To100());
        int num = task.getTotalFrom1To100();
        System.out.println(num);
    }
    
    // 이름을 넘겨받아 "1. ~님 안녕하세요" 5번 출력하는 메소드
    void printName(String name){
        for(int i=0; i<5; i++){
            System.out.println((i+1) + ". " + name + "님 안녕하세요");
        }
    }

    // 1~100까지의 합을 반환하는 메소드
    int getTotalFrom1To100(){
        int total = 0;
        for(int i=0; i<100; i++){
            total += i+1;
        }
        return total;
    }

}
