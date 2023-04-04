// Here the complexity is O(n2) hence we need to reduce space or garbage collection we need datatype which is
// know as string builder
public class Performance {
    public static void main(String[] args) {
        String alpha = "";
        for(int i = 0 ; i<26 ;i++){
            char ser = (char)('a'+i);
            alpha = alpha +ser ;
//            System.out.println(ser);
        }
        System.out.println(alpha);
    }
}
