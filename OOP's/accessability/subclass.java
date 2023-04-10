package accessability;

import org.w3c.dom.ls.LSOutput;

public class subclass extends X{

    public subclass(int nums, String name) {
        super(nums, name);
    }

    public static void main(String[] args) {
        // Yes we can access outside the class  in subclass in same package  public one
        // Yes we can access outside the class  in subclass in same package  protected  one
        subclass obje = new subclass(20,"vinig");
        int n = obje.nums;
//        System.out.println(obje instanceof X);
//        System.out.println(obje instanceof subclass);
//        System.out.println(obje instanceof Object);


        // Get class
        System.out.println(obje.getClass().getName());
    }

}
