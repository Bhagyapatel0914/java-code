// There are certain way to print all index in case of repetation
public class StringinLS {
    public static void main(String[] args) {
     String str = "Bhagya";
     char target  = 'a';
        search(str,target);
    }
    public static void search(String str , char target){
        if(str.length()==0){
            System.out.println("There is no element in string");
        }
        for(int i = 0;i<str.length()-1;i++){
            if(str.charAt(i) == target){
                System.out.println(i);
            }
        }
    }
}
