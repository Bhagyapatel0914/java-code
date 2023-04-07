public class mazewithobstacle {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[][]{{true, true, true}, {true, false, true}, {true, true, true}};
        obstacle("", maze, 0, 0);
    }

    public static void obstacle(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
        } else if (maze[r][c]) {
            if (r < maze.length - 1) {
                obstacle(p + "D", maze, r + 1, c);
            }

            if (c < maze[0].length - 1) {
                obstacle(p + "R", maze, r, c + 1);
            }

        }
    }
}
