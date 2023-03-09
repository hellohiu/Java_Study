package test2;

public interface InterB {
    default void printText(){
        System.out.println("InterB -> printText()");
    }
}
