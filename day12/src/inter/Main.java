package inter;

public class Main {
    public static void main(String[] args) {
//      Inter inter = new Inter();  -->  불가능!
        ClassA a = new ClassA();
        Inter inter = new ClassA(); // interface도 업캐스팅 가능!

        a.method1();
        a.method2();
        
        inter.method1();
        inter.method2();

        System.out.println(inter.VAR1); // 추천 X
        System.out.println(Inter.VAR2);
    }
}
