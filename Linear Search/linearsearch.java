// Linear search is simplest algorithm to search the particular number
// worst case complexity O(n) means we are unable to find element
// Best case O(1) if number find at first index
public class linearsearch {
    public static void main(String[] args) {
       int [] arr = {12,23,4,5,69,87,102};
        System.out.println(search(arr,87));
        System.out.println(search(arr,132));
    }
    public static int search(int [] arr,int target){
        for(int i = 0 ; i< arr.length-1;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return  -1;
    }
}
