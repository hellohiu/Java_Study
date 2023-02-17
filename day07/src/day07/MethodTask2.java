package day07;

public class MethodTask2 {
    public static void main(String[] args) {
        MethodTask2 task = new MethodTask2();

        int[] arNum = {1,3,5,7,9};
        System.out.println(task.getTotal(arNum));
        System.out.println(task.getTotal(new int[]{1,3,5,7,9}));
        // 선언과 동시에 초기화할 때만 new int[] 생략 가능하기 때문에
        // 이렇게 사용할 때는 new int[] 작성해줘야 함

        task.getTotalNum(5);
        task.getTotalNum(10);

        System.out.println(task.myMethod()); // 6
    }
    
    // 5개의 정수를 넘겨주면 합을 반환하는 메소드
    int getTotal(int[] arNum){
        int total = 0;
        for(int i=0; i<arNum.length; i++){
            total += arNum[i];
        }
        return total;
    }

    // 정수 num을 넘겨받아서 1~num까지의 합을 출력하는 메소드
    void getTotalNum(int num){
        int total = 0;
        for(int i=0; i<num; i++){
            total += i+1;
        }
        System.out.println(total);
    }

    // 값(6)dmf 리턴하는 메소드 (메소드 안에서 다른 메소드 사용 가능)
    int myMethod(){
        return getTotal(new int[]{1,2,3});
    }
}
