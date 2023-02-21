package superTest;

class A {
    int var1;
    int var2;

    public A() {
    }

    public A(int var1, int var2) {
        super();
        this.var1 = var1;
        this.var2 = var2;
    }
}

class B extends A {
    int var3;

    public B(int var1, int var2, int var3) {
//      this.var1 = var1;
//      this.var2 = var2;
//      ↓ super를 사용하여 간단하게 사용 가능
        super(var1, var2);
        this.var3 = var3;
    }

    void print(){
        System.out.println(this.var1);
    }
}

public class SuperTest {
    public static void main(String[] args) {
        B b = new B(1,2,3);
        System.out.println(b.var2); // 2
        b.print(); // 1
    }
}
