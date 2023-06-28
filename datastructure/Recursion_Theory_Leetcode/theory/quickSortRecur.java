package Recursion_Theory_Leetcode.theory;

import java.util.Arrays;

public class quickSortRecur {
        public static void main(String[] args) {
        int [] arr = {2, 4, 3, 5, 1};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // Conditions:
    // all the elements < pivot must be at LHS
    // all the elements > pivot must be at RHS
    
    static void quickSort(int[] arr, int low, int high){
        if (low >= high) return;

        int s = low;
        int e = high;

        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while (s <= e){ // positioning the two indexes till the violation of condition takes place
            while (arr[s] < pivot) {
                s += 1;
            }

            while (arr[e] > pivot) {
                e -= 1;
            }

            if (s <= e){    // if quicksort violation takes place, swap
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
        }



        // The pivot is at correct index. Sort the two halves in recursion
        quickSort(arr, low, e);     //LHS
        quickSort(arr, s, high);    //RHS
    }
}
