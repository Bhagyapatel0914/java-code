public class searchinrange {
    public static void main(String[] args) {
      int [] arr = {18,12,-7,3,14,28};
      // search in range of index[1,4]
    //    int target = 3;
       int target = 18;
        System.out.println(search(arr,target));
    }
    public static int search(int [] arr , int target){
        if(arr.length == 0) {
            return -1;
        }
        for(int i = 1; i<4;i++){
            if(arr[i]== target){
                return i;
            }
        }
        return -1;
    }
}
