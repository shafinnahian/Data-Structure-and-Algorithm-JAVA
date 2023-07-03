package Recursion_Theory_Leetcode.theory.backtracking;

import java.util.ArrayList;

public class maze {
        public static void main(String[] args) {
        boolean [][] board = {{true, true ,true},
        {true, false, true},
        {true, true, true}};
        // System.out.println(count(3, 3));

        // // mazePath("", 3, 3);

        // System.out.println(mazePList("", 3, 3));
        // System.out.println(mazePListDiagonal("", 3, 3));


        // mazeObstacles("", board, 0, 0);
    }
    
    static int count (int row, int col){
        if (row == 1 || col == 1) return 1;

        int left = count(row - 1, col);
        int right = count(row, col - 1);

        return left + right;
    }

    static void mazePath (String process, int row, int col){
        if (row == 1 && col == 1) {
            System.out.println(process);
            return;
        }

        if (row != 1) mazePath(process + "D", row - 1, col);
        if (col != 1) mazePath(process + "R", row, col - 1);
    }

    static ArrayList <String> mazePList(String process, int row, int col){
        ArrayList <String> list = new ArrayList<>();

        if (row == 1 & col == 1){
            list.add(process);
            return list;
        }

        if (row != 1) list.addAll(mazePList(process + "D", row - 1, col));
        if (col != 1) list.addAll(mazePList(process + "R", row, col-1));

        return list;
    }
    static ArrayList <String> mazePListDiagonal(String process, int row, int col){
        ArrayList <String> list = new ArrayList<>();

        if (row == 1 & col == 1){
            list.add(process);
            return list;
        }

        if (row != 1) list.addAll(mazePListDiagonal(process + "V", row - 1, col));
        if (col != 1) list.addAll(mazePListDiagonal(process + "H", row, col-1));
        if (row > 1 && col > 1) list.addAll(mazePListDiagonal(process + "D", row - 1, col - 1));
        return list;
    }

    static void mazeObstacles (String process, boolean maze[][], int row, int col){ // considering r and c starting from 0
        if ( row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(process);
            return;
        }

        if (!maze[row][col]) return;

        if (row < maze.length - 1) mazeObstacles(process + "D", maze, row + 1, col);
        if (col < maze[0].length - 1) mazeObstacles(process + "R", maze, row, col + 1);
    }

}
