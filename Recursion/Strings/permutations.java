package Strings;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
      permu("","abc");
        ArrayList<String> ans = permu2("","abc");
        System.out.println(ans);
       int answer =  count("","abc");
        System.out.println(answer);
    }
    public static void permu(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0 ; i<= p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permu(f+ch+s ,up.substring(1));
        }
    }
     public static ArrayList<String> permu2(String p , String up){
     if(up.isEmpty()){
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list ;
     }
     ArrayList<String> list = new ArrayList<>();
     char ch = up.charAt(0);
     for (int i = 0 ; i<= p.length();i++){
        String f = p.substring(0,i);
        String s = p.substring(i,p.length());
        list.addAll(permu2(f+ch+s ,up.substring(1)));
    }
     return list;
   }
   public static int count(String p ,String up){
        if(up.isEmpty()){
            return 1 ;
        }
        int c = 0 ;
        char ch = up.charAt(0);
        for (int i = 0; i<=p.length() ; i++){
            String f = p.substring(0,i);
            String s  = p.substring(i,p.length());
            c  = c + count(f+ch+s,up.substring(1));
        }
        return c;
   }

}
