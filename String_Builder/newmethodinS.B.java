import java.util.Arrays;

public class newmathodsinSb {
    public static void main(String[] args) {
     String str = "Bhagya Patel How do you do";
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf('B'));
        System.out.println("  Bhagya   ".strip());
        System.out.println(Arrays.toString(str.split(" ")));
    }
}
