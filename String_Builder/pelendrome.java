public class pelendrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        boolean ans = pele(str);
        System.out.println(ans);
    }
    public static boolean pele(String str){
        if(str == null || str.length() == 0){
            return false;
        }
        for(int i = 0 ; i<str.length()/2 ;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start == end){
                return true;
            }

        }
        return false;
    }
}
