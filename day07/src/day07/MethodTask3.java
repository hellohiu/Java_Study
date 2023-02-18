package day07;

public class MethodTask3 {
    public static void main(String[] args) {
        MethodTask3 task3 = new MethodTask3();

        System.out.println(task3.changNum(10));
        System.out.println(task3.changNum(-20));

        task3.printName("한교동", 3);
        task3.printName("스누피", 5);

        System.out.println(task3.changeCase("BaNaNa"));
        System.out.println(task3.changeCase("ApplE"));
        System.out.println(task3.changeCase("AaZz"));
        System.out.println(task3.changeCase("Aa아Zz"));
    }

    // 음수를 양수로, 양수를 음수로 바꿔서 반환하는 메소드
    int changNum(int num){
        return num * -1;
    }

    // 이름과 정수를 받아서 정수만큼 이름을 출력하는 메소드
    // "홍길동", 4 -> 홍길동을 4번 출력한다.
    void printName(String name, int num){
        for(int i=0; i<num; i++){
            System.out.println(name);
        }
    }

    // 소문자를 대문자로, 대문자를 소문자로 바꿔주는 메소드
    // BaNanA -> bAnANa
    String changeCase(String str){
        char c = ' ';
        String str2 = "";
        for(int i=0; i<str.length(); i++){
            c = str.charAt(i);
            if(c >= 65 && c <= 90){ // 대문자 범위
                str2 += (char)(c + 32); // 대문자를 소문자로 바꾸기
            } else if(c >= 97 && c <= 122) { // 소문자 범위
                str2 += (char)(c - 32); // 소문자를 대문자로 바꾸기
            } else {
                str2 = "잘못된 값입니다.";
                return str2;
            }
        }
        return str2;
    }
}
