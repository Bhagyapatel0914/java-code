public class Findduplicate {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        System.out.println(dup(arr));
    }
    public static int dup(int [] arr){
      int i = 0 ;
      while(i< arr.length){
          int corr = arr[i] - 1;
          if(arr[corr]!= arr[i]){
              swap(arr , corr , i);
          }else{
              i++;
          }
      }
      for(int index = 0 ; index < arr.length ; index++){
          if(arr[index]!= index + 1){
              return arr[index];
          }
      }
      return -1;
    }
    public static void swap(int [] arr , int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
