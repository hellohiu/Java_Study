package toy;

public class Main {
    public static void main(String[] args) {
        Company seoul = new Company("서울");
        Company busan = new Company("부산");

        // 1
        seoul.register(new Dog());

        // 2 (익명 클래스)
        busan.register(new Toy() {
            @Override
            public String[] speakList() {
                String[] list = {
                        "착한 어린이는 울지 않는다.",
                        "야옹!",
                        "생선이 좋다."
                };
                return list;
            }

            @Override
            public void pushBtn(String speak) {
                System.out.println(speak);
            }
        });

        // 3 (Adapter 사용)
        ToyAdapter toy = new ToyAdapter() {
            @Override
            public String[] speakList() {
                String[] list = {
                        "테스트용",
                        "어흥!",
                        "고기가 좋다."
                };
                return list;
            }
        };
        busan.register(toy);

    }
}
