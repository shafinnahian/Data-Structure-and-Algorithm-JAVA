package Recursion_Theory_Leetcode.theory.backtracking;

public class SudokuSolver {

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
        if (solve(board)) display(board);
        else System.out.println("Cannot solve");
    }
    
    static boolean solve(int[][] board){
        int len = board.length;
        int row = -1;
        int col = -1;

        boolean isEmpty = true;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 0){
                    row = i;
                    col = j;

                    isEmpty = false;
                    break;
                }
            }
            //  if row has empty elements, break the outer loop
            if (isEmpty == false) break;
        }

        if (isEmpty == true) return true;   // this means all the elements have been filled inside the sudoku
                                    // case solved

        // backtracking begins
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)){
                board[row][col] = num;  // inputting a digit, however *IT CAN BE WRONG*
                if (solve(board)) {     // hence the recursion of solve func again
                //    display(board);   // this will reiterate the display fun multiple times, seemingly providing wrong answers each time. 
                                        // use the display(board) func on PSVM w/ if - else
                   return true; 
                }  
                else board[row][col] = 0;
            }
        }
        return false;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num){
        for (int i = 0; i < board.length; i++) {    // checks the row in respect of each column
            if (board[row][i] == num) return false;
        }

        for (int[] nums : board) {  // checks the column in respect to each row
            if (nums[col] == num) return false;
        }
        
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;    // to find the row of sub blocks of the current idx
        int colStart = col - col % sqrt;    // to find the column of sub blocks of the current idx

        for (int i = rowStart; i < rowStart + sqrt; i++) {  // rowStart + sqrt ensures proper iteration length
            for (int j = colStart; j < colStart + sqrt; j++) {  // colStart + sqrt ensures proper iteration length
                if (board[i][j] == num) return false;
            }
        }

        return true;
    }
}
