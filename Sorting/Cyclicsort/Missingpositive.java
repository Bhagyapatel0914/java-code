public class Missingpositive {
    public static void main(String[] args) {
//        int [] arr = {3,4,-1,1};
        int [] arr = {1,2,0};
        System.out.println(miss2(arr));
    }
    public static int miss2(int [] arr){
     int i = 0 ;
     while(i< arr.length){
         int corr = arr[i] - 1;
         if(arr[i]>0&& i <= arr.length&& arr[corr]!=arr[i]){
             swap(arr,corr,i);
         }
         else{
             i++;
         }
     }
     for(int index = 0 ; index < arr.length ; index++){
         if(arr[index]!= index +1){
             return index + 1 ;
         }
     }
     return arr.length;
    }
    public static void swap(int [] arr , int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
