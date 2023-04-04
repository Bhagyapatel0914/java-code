import java.util.Arrays;

public class binary2D{
    public static void main(String []args){
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target= 8;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    public static int[] search(int [][] arr , int target ) {
        int row = arr.length;
        int cols = arr[0].length;

        if (row == 1) {
            return  binarysearch(arr, 0, 0, cols- 1, target);
        }
        int rstart = 0;
        int rend = row - 1;
        int cmid = cols / 2;
        while (rstart < (rend - 1)) {
            int mid = rstart + (rend - rstart) / 2;
            if (arr[mid][cmid] == target) {
                return new int[]{mid, cmid};
            } if (arr[mid][cmid] < target) {
                rstart = mid;
            } else {
                rend = mid;
            }
        }
        if (arr[rstart][cmid] == target) {
            return new int[]{rstart, cmid};
        }
        if (arr[rstart + 1][cmid] == target) {
            return new int[]{rstart + 1, cmid};
        }
        // 1st part
        if (arr[rstart][cmid - 1] >= target) {
         return   binarysearch(arr, rstart, 0, cmid - 1, target);
        }
        // 2nd part
        if (arr[rstart][cmid + 1] <= target&&target <=arr[rstart][cols - 1]) {
            return binarysearch(arr, rstart, cmid + 1, cols - 1, target);
        }
        // 3 rd part
        if (arr[rstart + 1][cmid - 1] >= target ) {
            return binarysearch(arr, rstart + 1, 0, cmid - 1, target);
        }
        // 4th part
    else  {
            return binarysearch(arr, rstart + 1, cmid+1, cols - 1, target);
        }

    }
    public static int [] binarysearch(int [][] arr , int row , int scol , int ecol ,int target){
        while(scol <= ecol){
            int  midc = scol + (ecol - scol)/2;
            if(arr[row][midc] == target) {
                return new int[]{row, midc};
            }
             if(arr[row][midc] < target){
                scol = midc+1;
            } else{
                ecol = midc - 1;
            }
        }
        return new int[]{-1,-1};
    }
}

