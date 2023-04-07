package Strings;

import java.util.ArrayList;

public class diceproblem {
    public static void main(String[] args) {
        dice("",4);
        ArrayList<String> an = diceREt("",4);
        System.out.println(an);
        int answer = count("",4);
        System.out.println(answer);
    }
    public static void dice(String p ,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i =1;i<=6&&i<=target;i++){
            dice(p+i,target-i);
        }
    }
    public static ArrayList<String> diceREt(String p , int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i =1;i<=6&&i<=target;i++){
            ans.addAll(diceREt(p+i,target-i));
        }
        return ans;
    }
    public static int count(String p ,int target){
        if(target==0){
            return 1 ;
        }
        int c = 0 ;
        for (int i =1;i<=6&&i<=target;i++){
            c = c + count(p+i,target-i);
        }
        return c;
    }
}
