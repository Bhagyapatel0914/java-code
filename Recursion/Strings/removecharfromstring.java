package Strings;

public class removecharfromstring {
    public static void main(String[] args) {
        String str = "bhaappgya";
        System.out.println(get4(str));
    }
    public static void get(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(up.charAt(0) == 'a'){
            get(p,up.substring(1));
        }else{
            get(p+ch,up.substring(1));
        }
    }
    // Passing only one argument
    public static String get1(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.charAt(0)=='a'){
            return get1(str.substring(1));
        }else{
            return str.charAt(0) + get1(str.substring(1));
        }
    }
    // Skip the apple
    public static String get3(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return get3(str.substring(5));
        }else{
            return str.charAt(0)+get3(str.substring(1));
        }
    }
     // skip the app when it is not apple
    public static String get4(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app")&& ! str.startsWith("apple")){
         return    get4(str.substring(3));
        }else{
            return str.charAt(0) + get4(str.substring(1));
        }
    }
}
