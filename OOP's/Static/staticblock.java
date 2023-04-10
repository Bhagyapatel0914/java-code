package Static;

public class staticblock {
    static int a = 10;
    static int b ;
    //  will only run once when first object created when class is loaded
    static {
        System.out.println("Hey , I am static block ");
        b = a *2;
    }

    public static void main(String[] args) {
        staticblock obj = new staticblock();
        System.out.println(staticblock.a +" "+staticblock.b);
        staticblock.b += 3;
        System.out.println(staticblock.a +" "+staticblock.b);
        // when we created another object the upper static run once
        // as it is not printing Hey , I am static block

        staticblock obj2 = new staticblock();
        System.out.println(staticblock.a +" "+staticblock.b);

    }
}
