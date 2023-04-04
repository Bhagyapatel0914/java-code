public class binaryangionist {
    public static void main(String[] args) {
        int arr[] = {20, 40, 50, 80, 3000};
        int target = 3000;
        int ans = binaryang(arr , target);
        System.out.println(ans);
    }

    public static int binaryang(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean asc;
        if (arr[end] > arr[start]) {
            asc = true;
        } else {
            asc = false;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ( arr[mid] == target) {
                return mid;
            }
             if (asc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else if (target < arr[mid]) {
                        start = mid + 1;
                    } else {
                        return mid;
                    }
                }



        }
        return -1;
    }
}

