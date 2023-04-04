public class Missingnumber {

        public static void main(String[] args) {
            int [] arr = {3,0,1};
            System.out.println(miss(arr));
        }
        public static int miss(int [] arr){
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


