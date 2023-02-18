package day08;

class B {
    int num;

    public B(int num){
        this.num = num;
    }

    void printNum(){
        System.out.println("num >> " + this.num);
        System.out.println("참조값 >> " + this);
    }
}

public class ClassTest2 {
    public static void main(String[] args) {
        B b1 = new B(3);
        B b2 = new B(10);

        b1.printNum();
        b2.printNum();
    }
}
