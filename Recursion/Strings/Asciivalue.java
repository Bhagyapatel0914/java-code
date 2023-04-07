package Strings;

import java.util.ArrayList;

public class Asciivalue {
    // Basics idea for printing ascii value
//    public static void main(String[] args) {
//        char ch = 'a';
//        System.out.println(ch+0);
//    }
    public static void main(String[] args) {
        String str = "abc";
//        subs("",str);
       System.out.println(subs2("",str));
    }
    public static void subs(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subs(ch+p,up.substring(1));
        subs(p,up.substring(1));
        subs(p+(ch+0),up.substring(1));
    }
    public static ArrayList<String> subs2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subs2(p+ch,up.substring(1));
        ArrayList<String> right = subs2(p,up.substring(1));
        ArrayList<String> ascii = subs2(p+(ch+0),up.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}




