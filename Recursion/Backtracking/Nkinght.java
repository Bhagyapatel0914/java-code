public class Nkinght {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        kinght(board, 0, 0, 4);
    }

    public static void kinght(boolean[][] board, int row, int col, int target) {
        if (target == 0) {
            display(board);
            System.out.println();
        } else if (row != board.length - 1 || col != board.length) {
            if (col == board.length) {
                kinght(board, row + 1, 0, target);
            } else {
                if (issafe(board, row, col)) {
                    board[row][col] = true;
                    kinght(board, row, col + 1, target - 1);
                    board[row][col] = false;
                }

                kinght(board, row, col + 1, target);
            }
        }
    }

    public static boolean issafe(boolean[][] board, int row, int col) {
        if (isvalid(board, row - 1, col + 2) && board[row - 1][col + 2]) {
            return false;
        } else if (isvalid(board, row - 1, col - 2) && board[row - 1][col - 2]) {
            return false;
        } else if (isvalid(board, row - 2, col + 1) && board[row - 2][col + 1]) {
            return false;
        } else {
            return !isvalid(board, row - 2, col - 1) || !board[row - 2][col - 1];
        }
    }

    public static boolean isvalid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
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
                    System.out.print("K");
                } else {
                    System.out.print("X");
                }
            }

            System.out.println();
        }

    }
}
