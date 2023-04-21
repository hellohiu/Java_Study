package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        printLottoNum(5);
    }

    public static void printLottoNum(int num){
        Random r = new Random();
        HashSet<Integer> lottoNum = new HashSet<>();
        ArrayList<Integer> result = null;

        for(int i=0; i<num; i++){
            while(lottoNum.size() < 7) {
                lottoNum.add(r.nextInt(45) + 1);
            }

            result = new ArrayList<>(lottoNum);
            Collections.sort(result);
            lottoNum.clear();
            System.out.println(result);
        }

    }
}
