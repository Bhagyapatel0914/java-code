package abstracts;

public abstract class Parents {
    int age;

    public Parents(int age) {
        this.age = age;
    }
    // we can create the static method in abstract class


    // we cannot create the abstract constructorn something like below
   // public abstract Parents(){

    // }
    // we can create the normal constructor
    public Parents(){
        System.out.println("I am in the Parents");
    }
    public static void normal(){
        System.out.println("hey");
    }
    abstract void career();
    abstract void partner();
}
