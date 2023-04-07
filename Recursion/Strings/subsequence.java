package Strings;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        String str = "abc";
//        sub(str,"");
        System.out.println(sfc("",str));;
    }
    public static void sub(String up ,String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sub(up.substring(1),p+ch);
        sub(up.substring(1),p);
    }
    public static ArrayList<String> sfc(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = sfc(ch+p,up.substring(1));
        ArrayList<String> right = sfc(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
