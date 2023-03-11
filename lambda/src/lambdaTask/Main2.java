package lambdaTask;

public class Main2 {
    // 두 문자열을 입력 받아서 첫 번째 문자열을 두 번째 문자열의 길이만큼 잘라내는 프로그램
    // ex)
    // 첫 번째 : abcde
    // 두 번째 : 가나다
    // 결과 : de

    // Main2(클래스)에 static 메소드를 선언한다.
    // 매개변수로 문자열을 전달받는다.
    // 전달받은 문자열이 "F"면 앞에서 자르고 "B"면 뒤에서 자르는 람다식을 만든다.

    public static void main(String[] args) {
        System.out.println("안녕하세요".substring(2)); // 2부터~
        System.out.println("안녕하세요".substring(0,2)); // 0~2직전까지

        SubInter si = (str1, str2) -> str1.substring(str2.length());
        System.out.println(si.subString("안녕하세요", "Hi"));

        String str1 = checkString("F").subString("가나다라마바사", "가나");
        System.out.println(str1);
        String str2 = checkString("B").subString("가나다라마바사", "가나");
        System.out.println(str2);
    }

    static SubInter checkString(String str){
        SubInter sub = null;
        switch (str){
            case "F" :
                sub = (s1, s2) -> s1.substring(s2.length());
                break;
            case "B" :
                sub = (s1, s2) -> s1.substring(0,s1.length()-s2.length());
                break;
        }
        return sub;
    }
}
