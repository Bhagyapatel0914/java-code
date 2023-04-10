package interfaces.extend;

public interface B {
   void greet();
   // there should be only one default funtion because if we took two then it will produce
    // confusion which one to call
//    default void fun(){
//        System.out.println(" hello to world of computer");
//    }
}
