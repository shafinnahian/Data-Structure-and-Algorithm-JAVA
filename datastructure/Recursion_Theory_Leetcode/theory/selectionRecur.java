package Recursion_Theory_Leetcode.theory;

import java.util.Arrays;

public class selectionRecur {
     public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3}; 
        
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    
    // FOR REFERENCE OF SELECTION SORT

    //quick visuals:
    //https://www.youtube.com/watch?v=g-PGLbMth_g&ab_channel=MichaelSambol

    // static void selection(int[] arr){
    //     for (int i = arr.length - 1; i > 0; i--){
    //         int max = i;

    //         for (int j = i - 1; j >= 0; j --){
    //             if (arr[j] > arr[max]) max = j;
    //         }

    //         if (max != i){
    //             int temp = arr[max];
    //             arr[max] = arr[i];
    //             arr[i] = temp;
    //         }
    //     }
    // }

    static void selection(int[] arr, int len, int counter, int max){
        if (len == 0) return;

        if (counter < len){
            if (arr[counter] > arr[max]) {
                selection(arr, len, counter + 1, counter);
            } else {
                selection(arr, len, counter + 1, max);
            }
        } else {
            int temp = arr [max]; 
            arr[max] = arr[len - 1];
            arr[len - 1] = temp;

            selection(arr, len - 1, 0, 0);
        }
    }
}
