package accessability;

public class X {
    // 1. When the variables are public we can access them every where
    // 2 . In private ones we can only access the variable in same class
    // 3 . In protected case we can access every where exepts diff package & not subclass
    // 4. In case of default one we can access in same class , same package , subclasss same package
//    public int nums;

 //   private int nums;
   protected int nums;
   // int nums;
    String name;
    int [] arr;
    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public X(int nums, String name) {
        this.nums = nums;
        this.name = name;
        this.arr = new int[nums];
    }
      // Yes we can access in same class public one
    // Yes we can access in same class private one
    // Yes we can access in same class protected one
//    int n = nums;
}
