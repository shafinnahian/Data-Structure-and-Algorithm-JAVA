package Recursion_Theory_Leetcode.theory.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPath {
    public static void main(String[] args) {
        boolean [][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        // allPath("", board, 0, 0);
        // System.out.println(allPathArrList("", board, 0, 0));
        int [][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);
    }

    static void allPath (String process, boolean[][] maze, int row, int col){
        if (row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(process);
            return;
        }

        if (!maze[row][col]) return;

        if (row < maze.length - 1){
            maze[row][col] = false;
            allPath(process + "D", maze, row + 1, col);
            maze[row][col] = true;  //reversing the changes (backtracking!)
        }
        if (col < maze[0].length - 1){
            maze[row][col] = false;
            allPath(process + "R", maze, row, col + 1);
            maze[row][col] = true;
        } 
        if (row > 0){
            maze[row][col] = false;
            allPath(process + "U", maze, row - 1, col);
            maze[row][col] = true;
        } 
        if (col > 0){
            maze[row][col] = false;
            allPath(process + "L", maze, row, col - 1);
            maze[row][col] = true;
        }
    }

    static ArrayList<String> allPathArrList (String process, boolean[][] maze, int row, int col){
        ArrayList <String> list = new ArrayList<>();
        if (row == maze.length - 1 && col == maze[0].length - 1){
            list.add(process);
            return list;
        }

        if (!maze[row][col]) return list;

        maze[row][col] = false;

        if (row < maze.length - 1){
            list.addAll(allPathArrList(process + "D", maze, row + 1, col));
        }
        if (col < maze[0].length - 1){
            list.addAll(allPathArrList(process + "R", maze, row, col + 1));
        } 
        if (row > 0){
            list.addAll(allPathArrList(process + "U", maze, row - 1, col));
        } 
        if (col > 0){
            list.addAll(allPathArrList(process + "L", maze, row, col - 1));
        }

        maze[row][col] = true;  //reversing the changes (backtracking!)

        return list;
    }
    static void allPathPrint (String process, boolean[][] maze, int row, int col, int[][] path, int step){
        if (row == maze.length - 1 && col == maze[0].length - 1){
            path[row][col] = step;
            for (int[] is : path) {
                System.out.println(Arrays.toString(is));
            }

            System.out.println(process);
            System.out.println();
            return;
        }

        if (!maze[row][col]) return;
        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1){
            allPathPrint(process + "D", maze, row + 1, col, path, step + 1);
        }
        if (col < maze[0].length - 1){
            allPathPrint(process + "R", maze, row, col + 1, path, step + 1);
        } 
        if (row > 0){
            allPathPrint(process + "U", maze, row - 1, col, path, step + 1);
        } 
        if (col > 0){
            allPathPrint(process + "L", maze, row, col - 1, path, step + 1);
        }

        maze[row][col] = true;  //reversing the changes (backtracking!)
        path[row][col] = 0;
    }
}
