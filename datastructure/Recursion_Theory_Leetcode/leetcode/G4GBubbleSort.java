package Recursion_Theory_Leetcode.leetcode;

import java.util.Arrays;

public class G4GBubbleSort {
    public static void main(String[] args) {
        int[] arr = { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }
    
    static void bubble(int[] arr, int len, int count){
        if (len == 0) return; // i >= 0

        if (count < len){   // j < i
            if (arr[count] > arr [count + 1]){
                int temp = arr[count];
                arr[count] = arr[count + 1];
                arr[count + 1] = temp;
            }
            bubble(arr, len, count+1);  // j++
        }
        else bubble(arr, len - 1, 0);   // i--, j resetting
    }
}
