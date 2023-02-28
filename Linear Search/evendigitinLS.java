public class evendigitinLS {
    public static void main(String[] args) {
        int [] num = { 1 , 2 , 20 ,30 ,40} ;
        int ans = findnumber(num);
        System.out.println(ans);

     }
     // Calculate numbers 
    public static int findnumber(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)) {
                count++;

            }
        }
        return count;
    }
    // Check weather number is even or not
    public static boolean even(int num){
        int numberofdigit = digit(num);
        if(numberofdigit % 2 == 0){
            return true;
        }
        return false ;
    }
       // numbers count 
    public static int digit(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10 ;

        }
        return count ;
    }
}
