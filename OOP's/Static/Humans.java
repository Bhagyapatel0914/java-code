package Static;

public class Humans {
    int age;
    String name;
    int salary;
    static int popullation ;
    static void greet(){
        System.out.println("Hello world");
        // Let's try to access the this keyword in the static method
       // System.out.println(this.age);
        // We can't do it because we can access only static data
    }
   public Humans(int age , String name , int salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
        // there is no sences to write here this . popullation because
        // as it is same for all the humans we created hence we call it
        // directly via class because it is better convention to do so
        // therefore every static variable is called via class
        Humans.popullation = Humans.popullation+1;
    }
}
