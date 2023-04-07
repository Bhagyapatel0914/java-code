public class sukodusolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if(solve(board)){
            display(board);
        }else{
            System.out.println("Not possible to print ");
        }
    }
    public static boolean solve(int [][] board) {
        int n = 9;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if(board[row][col] == 0){
                    for (int i = 1; i <=9 ; i++) {
                        if(issafe(board,row,col,i)){
                            board[row][col] = i;
                            boolean nextsol = solve(board);
                            if (nextsol == true) {
                                return true;
                            }
                            else{
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static void display(int [][] board){
        for(int [] row : board){
            for(int number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
    public static boolean issafe(int [][] board ,int row ,int col , int number ){
        //Check for rows & cols
        for (int i = 0; i<board.length;i++){
            if(board[row][i]==number){
                return false;
            }
            if(board[i][col] == number){
                return false;
            }
        }
        // Check for each grid
        int sqr = (int)Math.sqrt(board.length);
        int rowstart = row - row % sqr;
        int colstart = col - col % sqr;
        for (int i = rowstart; i <rowstart+sqr ; i++) {
            for (int j = colstart; j < colstart+sqr; j++) {
                if(board[i][j] == number){
                    return false;
                }
            }
        }
        return true;
    }
}