public class allpaths {
    public static void main(String[] args) {
        boolean[][] board = new boolean[][]{{true, true, true}, {true, true, true}, {true, true, true}};
        paths("", board, 0, 0);
    }

    public static void paths(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
        } else if (maze[r][c]) {
            maze[r][c] = false;
            if (r < maze.length - 1) {
                paths(p + "D", maze, r + 1, c);
            }

            if (c < maze[0].length - 1) {
                paths(p + "R", maze, r, c + 1);
            }

            if (r > 0) {
                paths(p + "U", maze, r - 1, c);
            }

            if (c > 0) {
                paths(p + "L", maze, r, c - 1);
            }

            maze[r][c] = true;
        }
    }
}
