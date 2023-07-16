package LinearSearch_theory;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 8, 9, -9};
        System.out.println(findMinRecur(arr, arr[0]));
    }

    static int findMin (int[] arr){
        if (arr.length == 0) return -1;

        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) ans = arr[i];
        }

        return ans;
    }

    static int findMinRecur(int[] arr, int min){
        if (arr.length <= 1) {
            if (arr[0] < min) min = arr[0];
            return min;
        }

        if (arr[0] <= min) min = arr[0];

        return findMinRecur(Arrays.copyOfRange(arr, 1, arr.length), min);
    }
}

