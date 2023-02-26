package accessModifier;

public class B {
    public int var1;
    int var2; // 아무것도 쓰지 않았을 때는 default
    protected int var3;
    private int var4;

    // getter : get + 필드명() -> 저장된 값을 가져오기
    public int getVar4(){
        return var4;
    }

    // setter : set + 필드명() -> 값을 저장하기
    public void setVar4(int var4){
        this.var4 = var4;
    }
}
