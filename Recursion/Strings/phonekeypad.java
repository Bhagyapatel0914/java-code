package Strings;

import java.util.ArrayList;

public class phonekeypad {
    public static void main(String[] args) {
    // pad("","12");
//     ArrayList<String> ans = pad2("","12");
//        System.out.println(ans);
        int ans = count("","12");
        System.out.println(ans);
    }
    public static void pad(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
         int digit = up.charAt(0) - '0';
        for(int i = (digit-1)*3; i<digit*3;i++){
           char ch = (char)('a'+ i);
           pad(p+ch,up.substring(1));
        }
    }
    public static ArrayList<String> pad2(String p , String up){
        if(up.isEmpty()){
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for(int i = (digit-1)*3 ;i<digit*3 ; i++){
            char ch = (char)('a'+i);
            ans.addAll(pad2(p+ch,up.substring(1)));
        }
        return ans;
    }
    public static int count(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return 1 ;
        }
        int c = 0;
        int digit = up.charAt(0) - '0';
        for(int i = (digit-1)*3; i<digit*3;i++){
            char ch = (char)('a'+ i);
            c = c + count(p+ch,up.substring(1));
        }
        return c;
    }
}
