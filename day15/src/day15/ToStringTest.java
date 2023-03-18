package day15;

public class ToStringTest {
    public ToStringTest(){
        super();
    }

    public static void main(String[] args) {
        ToStringTest t = new ToStringTest();
        System.out.println(t); // day15.ToStringTest@776ec8df

        try{
            throw new NumberFormatException("메세지 넣었다!");
        } catch(Exception e){
            System.out.println(e); // = e.toString()
        }
    }

}
