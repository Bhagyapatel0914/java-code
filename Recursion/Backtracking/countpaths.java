public class countpaths {

    public static void main(String[] args) {
        int ans = count(3, 3);
        System.out.println(ans);
    }

    public static int count(int c, int r) {
        if (r != 1 && c != 1) {
            int left = count(r - 1, c);
            int right = count(r, c - 1);
            return left + right;
        } else {
            return 1;
        }
    }
}
