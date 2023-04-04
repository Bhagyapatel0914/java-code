import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {200, 1200, 8, 1, 20, 30};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j ];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break ;
            }

            }
        }
    }

