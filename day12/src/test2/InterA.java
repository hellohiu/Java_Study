package test2;

public interface InterA {
    default void printText(){
        System.out.println("InterA -> printText()");
    }
}
