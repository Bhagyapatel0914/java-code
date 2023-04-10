package interfaces.extend;

public interface A {
    // static interface methods should contain the body
    // call via interface name
    static void car(){
        System.out.println("the car is so cool");
    }
    default void fun(){
        System.out.println(" hello to world of computer");
    }
}
