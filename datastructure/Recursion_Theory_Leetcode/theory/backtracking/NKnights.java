package Recursion_Theory_Leetcode.theory.backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, n);
        // System.out.println(knight(board, 0, 0, n));  // for running the integer method
    }
    
    static void knight(boolean[][] board, int row, int col, int knights){
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (col == board.length){   // if true then restarts with row++
            knight(board, row + 1, 0, knights);
            return;
        }

        if (row == board.length - 1 && col == board.length - 1 ) return; // handles out of bound

        //  same backtracking method as NQueens - reverses the changes once out of recursion from below
        if (isSafe(board, row, col)){
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        knight(board, row, col + 1, knights);   // continues with the recursive loop
    }


    // with a counter (COMMENT OUT THE PREV METHOD)
    // static int knight(boolean[][] board, int row, int col, int knights){
    //     if (knights == 0) {
    //         display(board);
    //         System.out.println();
    //         return 1;
    //     }

    //     int count = 0;

    //     if (col == board.length){
    //         knight(board, row + 1, 0, knights);
    //         return 1;
    //     }

    //     if (row == board.length - 1 && col == board.length - 1 ) return 0; // handles out of bound

    //     //  same backtracking method as NQueens - reverses the changes once out of recursion from below
    //     if (isSafe(board, row, col)){
    //         board[row][col] = true;
    //         count += knight(board, row, col + 1, knights - 1);
    //         board[row][col] = false;
    //     }

    //     count += knight(board, row, col + 1, knights);

    //     return count;
    // }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // checks all the possible moves being valid or not

        if (isValid(board, row - 2, col - 1)){
            if (board[row - 2][col - 1]){
                return false;
            }
        }
        if (isValid(board, row - 1, col - 2)){
            if (board[row - 1][col - 2]){
                return false;
            }
        }
        if (isValid(board, row - 2, col + 1)){
            if (board[row - 2][col + 1]){
                return false;
            }
        }
        if (isValid(board, row - 1, col + 2)){
            if (board[row - 1][col + 2]){
                return false;
            }
        }
        // if (isValid(board, row, col)){
        //     if (board[row][col]){
        //         return false;
        //     }
        // }

        return true;
    }

    //do not repeat yourself, hence created
    static boolean isValid(boolean board[][], int row, int col){
        if (row >= 0 && row < board.length && col >= 0 && col < board.length){  // out of bound checker
            return true;
        }

        return false;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board){
            for (boolean element: row){
                if (element){
                    System.out.print("K ");
                } else System.out.print("X ");
            }
            System.out.println();
        }
        
    }

}
