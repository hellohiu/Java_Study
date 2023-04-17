package listTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListTask2 {
    /*
        list에 값을 5개 저장하고 정렬한다. (1~20까지의 정수만 사용)
        사용자가 list에 저장된 값을 맞추는 프로그램을 짠다.
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> viewList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String msg = "정수를 입력하세요(1~20) >> ";
        String resultMsg = null;
        int tmp = 0, flag = 0, idx = 0, cnt = 0;

        list.add(11);
        list.add(7);
        list.add(3);
        list.add(18);
        list.add(10);
        Collections.sort(list);
//        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            viewList.add("?");
        }

        while (true) {
            System.out.println(viewList);
            System.out.print(msg);
            tmp = sc.nextInt();
            cnt++;

            if(list.contains(tmp)){
                resultMsg = "맞췄습니다.";
                idx = list.indexOf(tmp);
                viewList.set(idx, tmp+"");
                list.set(idx, Integer.MIN_VALUE);
                flag++;
            }else{
                resultMsg = "틀렸습니다.";
            }
            System.out.println(resultMsg);
            if(flag==5){ break; }
        }

        System.out.println("=======================");
        System.out.println(viewList);
        System.out.println("축하합니다!!");
        System.out.println(cnt + "번 시도하였습니다.");
    }
}
