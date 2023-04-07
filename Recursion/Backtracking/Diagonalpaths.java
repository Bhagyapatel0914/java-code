import java.util.ArrayList;

public class Diagonalpaths {

    public static void main(String[] args) {
        ArrayList<String> ans = diagonal("", 3, 3);
        System.out.println(ans);
    }

    public static ArrayList<String> diagonal(String p, int r, int c) {
        ArrayList list;
        if (r == 1 && c == 1) {
            list = new ArrayList();
            list.add(p);
            return list;
        } else {
            list = new ArrayList();
            if (r > 1) {
                list.addAll(diagonal(p + "D", r - 1, c));
            }

            if (c > 1) {
                list.addAll(diagonal(p + "R", r, c - 1));
            }

            if (r > 1 && c > 1) {
                list.addAll(diagonal(p + "d", r - 1, c - 1));
            }

            return list;
        }
    }
}
