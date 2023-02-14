package day04;

public class BitOper {
    public static void main(String[] args) {
        System.out.println(10&11); // 10
        System.out.println(10|11); // 11
        System.out.println(10^11); // 1

        // ~a = -a-1
        System.out.println(~10); // -11
        System.out.println(~5); // -6
        System.out.println(~7); // -8

        System.out.println(10>>1); // 5
        System.out.println(10>>2); // 2
        System.out.println(10>>3); // 1

        System.out.println(10<<1); // 20
        System.out.println(10<<2); // 40
        System.out.println(10<<3); // 80
        System.out.println(10<<30); // 오버플로우 : -2147483648
    }
}
