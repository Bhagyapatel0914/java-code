package packages.a;
// All the public funtion available in message funtion will be called and perform their
// task in another package if it would private we can't access it
import static packages.b.Mess.message;

public class Helloworld {
    public static void main(String[] args) {
        System.out.println("hello world");
        // Now if we create another java class of name
        // Hello world it would not created here role of packages comes in
        // now if we create package called a and b and we put same class name
        // it allows us to do so . Basically packages means folder

        // now let say i want to print the funtion message over here
        message();
        // it will print the message funtion through import statement above
    }
}
