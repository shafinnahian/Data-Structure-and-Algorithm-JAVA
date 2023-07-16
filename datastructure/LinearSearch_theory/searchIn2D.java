package LinearSearch_theory;

import java.lang.reflect.Array;
import java.util.Arrays;

public class searchIn2D {
    public static void main(String[] args) {
        int[][] arr= {
        {23, 4, 1}, 
        {18, 12, 3, 9}, 
        {78, 99, 34, 56}, 
        {18, 12}
        };

        // System.out.println(Arrays.toString(searchIn2D(arr, 99)));
        System.out.println(maxIn2D(arr));
    }

    static int[] searchIn2D(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) return new int[] {i, j};
            }
        }

        return new int[] {-1, -1};
    }

    static int maxIn2D(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) max = arr[i][j];
            }
        }

        return max;
    }
}
