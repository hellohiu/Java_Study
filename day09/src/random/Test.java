package random;

public class Test {
    public static void main(String[] args) {
        String str1 = "안녕";
        String str2 = "안녕";
        String str3 = new String("안녕");

        // 주소 비교
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        
        // 값 비교
        System.out.println(str1.equals(str3)); // true
    }
}
