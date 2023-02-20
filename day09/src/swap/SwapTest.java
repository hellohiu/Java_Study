package swap;

public class SwapTest {
    public static void main(String[] args) {
        // a, b 두 값을 바꾸기 (a -> b, b -> a)
        int a = 10;
        int b = 20;
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

        // a, b 두 값을 바꾸는 swap 메소드 사용
        int[] ar = new int[]{10, 20};
        swap(ar);
        System.out.println(ar[0]);
        System.out.println(ar[1]);

    }

    // a, b 두 값을 바꾸는 swap 메소드 만들기 (a -> b, b -> a)
    // 주소값을 가지고 있는 배열을 넘겨서 swap은 가능하지만
    // 값을 가지고 있는 변수를 넘겨서 swap은 불가능하다.
//    static void swap(int a, int b){
//        int temp = 0;
//        temp = a;
//        a = b;
//        b = temp;
//    }

    static void swap(int[] ar){
        int temp = 0;
        temp = ar[0];
        ar[0] = ar[1];
        ar[1] = temp;
    }
}
