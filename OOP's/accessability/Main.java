package accessability;

public class Main {
    public static void main(String[] args) {
        // Now Let's try to access the public one
        X obj = new X(10,"Bhagya");
        // Yes we can access outside the class public one
        // Yes we can access outside the class and same package protected one
//        int n  = obj.nums;
    }
}
