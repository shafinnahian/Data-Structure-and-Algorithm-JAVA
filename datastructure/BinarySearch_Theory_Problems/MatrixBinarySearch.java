package BinarySearch_Theory_Problems;

import java.util.Arrays;

public class MatrixBinarySearch {
    public static void main(String[] args) {
        
        // for matrix with sorted row & sorted col

        // int[][] arr = {
        //     {10, 20, 30, 40},
        //     {15, 25, 35, 45},
        //     {28, 29, 37, 49},
        //     {33, 34, 38, 50}
        // };

        // System.out.println(Arrays.toString(matrixSearch(arr, 37)));
        // System.out.println(Arrays.toString(searchInRecursion(arr, 37, 0, arr.length - 1)));
        
        // for sorted matrix

        // int [][] sortedArr = {
        //     {1, 2, 3, 4},
        //     {5, 6, 7, 8},
        //     {9, 10, 11, 12},
        //     {13, 14, 15, 16}
        // };

        // System.out.println(Arrays.toString(searchInSort(sortedArr, 6)));
    }

    // explanation 
    // https://chat.openai.com/share/5b826a09-e803-43c8-a912-350e72c7b83c

    static int[] matrixSearch(int[][] arr, int target){
        int row = 0;
        int col = arr.length - 1;

        while (row < arr.length && col >= 0 ){
            if (target == arr[row][col]) return new int[] {row, col};
            else if (arr[row][col] < target) row++;
            else col--;
        }

        return new int[] {-1, -1};
    }

    // recursive approach
    static int[] searchInRecursion(int[][] arr, int target, int row, int col){
        if (row >= arr.length || col < 0){
            return new int[] {-1, -1};
        }

        if (target == arr[row][col]) return new int[] {row, col};
        else if (target < arr[row][col]) return searchInRecursion(arr, target, row, col - 1);
        else return searchInRecursion(arr, target, row + 1, col);
    } 

    static int[] searchBinary(int[][] arr, int target, int row, int cStart, int cEnd){
        while (cStart < cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if (arr[row][mid] == target) return new int[] {row, mid};
            else if (arr[row][mid] < target) cStart = mid + 1;
            else cEnd = mid - 1;
        }

        return new int[] {-1, -1};
    }

    //=========================================================================//

    // for sorted array

    static int[] searchInSort(int [][] arr, int target){
        int rows = arr.length;
        int col = arr[0].length;

        if (rows == 1) return searchBinary(arr, target, 0, 0, col - 1);

        // run the loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = rows - 1;
        int midCol = col / 2;

        while ( rStart < rEnd - 1){ // while this is true it will have 2 rows
            int mid = rStart + (rEnd - rStart) / 2;

            if (arr[mid][midCol] == target) return new int[] {mid, midCol};

            if (arr[mid][midCol] < target) rStart = mid;
            else rEnd = mid;
        }

        // now we have two rows remaining.
        //check whether the middle element contains the target or not
        if (arr[rStart][midCol] == target) return new int[] {rStart, midCol};
        else if (arr[rStart + 1][midCol] == target)  return new int[] {rStart + 1, midCol};

        // otherwise the 4 distribution
        // search in 1st half
        if (target <= arr[rStart][midCol - 1]) return searchBinary(arr, target, rStart, 0, midCol - 1);
        // search in 2nd half
        else if (target >= arr[rStart][midCol + 1] && target <= arr[rStart][col - 1]) return searchBinary(arr, target, rStart, midCol + 1, col - 1);
        // search in 3rd half
        else if (target <= arr[rStart + 1][midCol - 1]) return searchBinary(arr, target, rStart + 1, 0, col - 1);
        // search in 4th half
        else return searchBinary(arr, target, rStart + 1, midCol + 1, col - 1); // if (target >= arr[rStart][midCol + 1])

    }
}
