package Static;

public class Main {
    // why main declare as static method
    // lets first think about what is static ?
    // static means we can use main method without creating the object in class
    // to run the thing in the class and main is very first thing to run in the class
    // hence how we would create object to main because of this it should be static
    // static belong to class not object.
    public static void main(String[] args) {
        // here humans and main are in same package hence we can access it directly
        Humans bhagya = new Humans(18,"bhagya patel",1000000000);
        Humans krunal = new Humans(21,"krunal ",1000000000);
        System.out.println(bhagya.age);
        System.out.println(bhagya.popullation);
        // good convention to write
        System.out.println(Humans.popullation);
        // Now if call greet funtion over here it show error
         //greet();
        // it is happening because we cannot introduce non static data in static method
        // this is because non static data needs objects and instances to be called

        // Now introduce objects
        Main obj = new Main();
        // Now call static ones
        obj.fun();
        // Now it works as we call using object
    }
    // it is independent of objects
    static void fun(){
        System.out.println("Hello world");
    }
    // it depends upon object
    void greet(){
        // let see we can put static one in non static
        fun();
        // yes we can
        System.out.println("hello world");
    }
}
