package Singeltonclass;

import accessability.X;
// Yes we can access the protected one diff package in subclass
public class subclass extends X {
    public subclass(int nums, String name) {
        super(nums, name);
    }

    public static void main(String[] args) {
        subclass obje = new subclass(20,"vinig");
      //  int n = obje.nums;


        // for protected
        X obje1 = new X(20,"vinig");
          int n = obje.nums;
        // if these holds true than it means nums is public because
        // A is extends it doesn't know anything as downwards has information about upwards
        // hence we use subclass type of obj

    }

    public static class subclass2 extends X {
        public subclass2(int nums, String name) {
            super(nums, name);
        }

        public static void main(String[] args) {
            subclass2 obje = new subclass2(20, "vinig");
            int n = obje.nums;
        }
    }
}
class  subsubclass extends subclass{

    public subsubclass(int nums, String name) {
        super(nums, name);
    }
    subsubclass obj = new subsubclass(20,"vinig");
    int n = obj.nums;
}
