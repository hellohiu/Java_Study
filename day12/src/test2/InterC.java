package test2;

public interface InterC {
    default void printText(){
        System.out.println("InterC -> printText()");
    }
}
