package listTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ArrayListTask3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = makeList();
        ArrayList<String> viewList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String msg = "정수를 입력하세요(1~20) >> ";
        String resultMsg = null;
        int tmp = 0, flag = 0, idx = 0, cnt = 0;

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

    public static ArrayList<Integer> makeList(){
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for(int i=0; i<5; i++){
            int tmp = r.nextInt(20)+1;
            if(!list.contains(tmp)){
                list.add(tmp);
            }else{
                i--;
            }
        }
        Collections.sort(list);
        return list;
    }
}
