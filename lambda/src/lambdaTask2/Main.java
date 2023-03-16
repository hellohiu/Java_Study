package lambdaTask2;

public class Main {
    /*
        1. 문자열을 전달 받는다.
            funny java
        2. 다음과 같이 변환하여 반환한다.
            FuNuY JaVa
        -> 각 단어를 대문자, 소문자로 번갈아서 변환한다.
           띄어쓰기가 나오면 다시 대문자로 시작한다.
     */
    public static void main(String[] args) {
        ChangeInter ci = str -> {
            String result = "";
            int flag = 0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == ' '){
                    flag = 0;
                    result += " ";
                    continue;
                }
                result += flag%2==0 ? (char)(str.charAt(i)-32) : str.charAt(i);
                flag++;
            }
            return result;
        };
        String result = ci.changeAlpha("hi funny java");
        System.out.println(result);
    }
}
