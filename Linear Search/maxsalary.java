public class maxsalary{
    public static void main(String []args){
        int [][] arr = {
            {20 ,30,40},
            {900,21,35},
            {200,1200,300}
        };
        System.out.println(salary(arr));
    }
    public static int salary(int[][]arr ){
       int max  = 0;
       for(int i = 0 ;i<arr.length;i++){
        int sum = 0;
        for(int j = 0 ;j<arr[i].length;j++){
            sum = sum + arr[i][j];
        }
        if(sum>max){
            max = sum ;
        }
       }
       return max ;
    }
}
