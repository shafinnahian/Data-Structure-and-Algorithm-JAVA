package Recursion_Theory_Leetcode.leetcode;

import java.util.Arrays;

public class G4GInsertionSort {
    public static void main(String[] args) {
        int[] arr = { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
        // insertionStandard(arr);
        // insertionRecur(arr, 0);
        // insertionLast(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionStandard (int [] arr){
        for(int i = 1; i< arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                --j;
            }

            arr[j+1] = key;
        }
    }

    static void insertionRecur(int[] arr, int len){ // sorting starts from idx 0
        if (arr.length <= 1) return; // out of bound exception

        if (len == arr.length) return;

        if (len == 0) {
            insertionRecur(arr, len + 1);
            return;
        }

        int key = arr[len];
        int j = len - 1;

        while (j >= 0 && arr[j] > key){
            arr[j + 1] = arr[j];
            --j;
        }
        arr[++j] = key;

        insertionRecur(arr, len + 1);
    }

    static void insertionLast(int[] arr, int len){  // iterates from last idx to first, then starts to sort
        if (len <= 1) return;

        insertionLast(arr, len - 1);

        int key = arr[len - 1];
        int j = len - 2;

        while (j >= 0 && arr[j] > key){
            arr[j + 1] = arr[j];
            --j;
        }
        arr[++j] = key;
    }
}
