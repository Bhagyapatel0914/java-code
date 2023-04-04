import java.util.Arrays;

public class stringbuild {
    public static void main(String[] args) {
        StringBuilder alpha = new StringBuilder();
        for(int i = 0 ;i<26;i++){
            char ch = (char)('a'+i);
            alpha.append(ch);
        }
        System.out.println(alpha);
//        alpha.reverse();
//        System.out.println(alpha);
//        System.out.println(alpha.deleteCharAt(0));

    }
}
