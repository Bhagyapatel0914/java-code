import java.util.ArrayList;

public class printpath {
    public static void main(String[] args) {
        ArrayList<String> ans = pathArraylist("", 3, 3);
        System.out.println(ans);
    }

    public static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
        } else {
            if (r > 1) {
                path(p + "D", r - 1, c);
            }

            if (c > 1) {
                path(p + "R", r, c - 1);
            }

        }
    }

    public static ArrayList<String> pathArraylist(String p, int r, int c) {
        ArrayList list;
        if (r == 1 && c == 1) {
            list = new ArrayList();
            list.add(p);
            return list;
        } else {
            list = new ArrayList();
            if (r > 1) {
                list.addAll(pathArraylist(p + "D", r - 1, c));
            }

            if (c > 1) {
                list.addAll(pathArraylist(p + "R", r, c - 1));
            }

            return list;
        }
    }
}
