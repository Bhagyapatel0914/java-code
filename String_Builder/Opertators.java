import java.util.ArrayList;

public class Opertators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+1);
        System.out.println("a"+1);
        System.out.println((char)('a'+1));
        // In the statement one should be string to get the output or all should be primitive
        System.out.println("Bhagya"+ new ArrayList<>());
        System.out.println(new Integer(9)+ " "+new ArrayList<>());
        System.out.println( "Bhagya"+new Integer(9) );
    }
}
