class Solution {
    public void solveSudoku(char[][] board) {
       solveboard(board);
       for(int i=0; i<board.length; i++){
        for(int j=0; j<board.length; j++){
            System.out.print(board[i][j]+",");
        }
        System.out.println();
       }
    }

    public static boolean numberrow(char[][] board, char number, int row) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == number) {
                return false;
            }
        }
        return true;
    }

    public static boolean numbercol(char[][] board, char number, int col) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == number) {
                return false;
            }
        }
        return true;
    }

    public static boolean numberbox(char[][] board, char number, int row, int col) {
        int localrow = row - row % 3;
        int localcol = col - col % 3;

        for (int i = localrow; i < localrow + 3; i++) {
            for (int j = localcol; j < localcol + 3; j++) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidnumber(char[][] board, char number, int row, int col) {
        return numberrow(board, number, row) && numbercol(board, number, col) && numberbox(board, number, row, col);
    }

    public static boolean solveboard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    for (int num = 1; num <= board.length; num++) {
                        char newnum = (char) (num + '0');
                        if (isValidnumber(board, newnum, i, j)) {
                            board[i][j] = newnum;
                            if (solveboard(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
