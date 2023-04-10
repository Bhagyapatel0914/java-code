package Singeltonclass;

import accessability.X;

public class Main {
    public static void main(String[] args) {
      //  singelton obj = new singelton();
        singelton obj = singelton.getInstance();
        singelton obj2 = singelton.getInstance();
        singelton obj3 = singelton.getInstance();
        // Here we get same output for all four objects
        // as all three are pointing towards same object



        // Yes we can access outside the package public one
//        X obje = new X(20,"vinig");
//        int n = obje.nums;
    }
}
