public class Nqueens {

    public static void main(String[] args) {
        boolean[][] board = new boolean[5][5];
        queens(board, 0);
    }

    public static void queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
        } else {
            for(int c = 0; c < board.length; ++c) {
                if (safetoprint(board, row, c)) {
                    board[row][c] = true;
                    queens(board, row + 1);
                    board[row][c] = false;
                }
            }

        }
    }

    public static boolean safetoprint(boolean[][] board, int row, int col) {
        int maxleft;
        for(maxleft = 0; maxleft < row; ++maxleft) {
            if (board[maxleft][col]) {
                return false;
            }
        }

        maxleft = Math.min(row, col);

        int maxright;
        for(maxright = 1; maxright <= maxleft; ++maxright) {
            if (board[row - maxright][col - maxright]) {
                return false;
            }
        }

        maxright = Math.min(row, board.length - col - 1);

        for(int i = 1; i <= maxright; ++i) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    public static void display(boolean[][] board) {
        boolean[][] var1 = board;
        int var2 = board.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            boolean[] row = var1[var3];
            boolean[] var5 = row;
            int var6 = row.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                boolean element = var5[var7];
                if (element) {
                    System.out.print("Q");
                } else {
                    System.out.print("X");
                }
            }

            System.out.println();
        }

    }
}
