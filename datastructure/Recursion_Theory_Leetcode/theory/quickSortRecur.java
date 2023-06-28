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

    //Optimized version, with getPivotIndex funciton selecting the median of three value - nullifying the worst case scenario
    
    // static void quickSort(int[] arr, int low, int high) {
    //     if (low >= high) return;

    //     int pivotIndex = getPivotIndex(arr, low, high);
    //     int pivot = arr[pivotIndex];

    //     // Swap pivot with the last element
    //     int temp = arr[pivotIndex];
    //     arr[pivotIndex] = arr[high];
    //     arr[high] = temp;

    //     int i = low - 1;
    //     for (int j = low; j < high; j++) {
    //         if (arr[j] < pivot) {
    //             i++;
    //             // Swap elements at i and j
    //             int temp2 = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp2;
    //         }
    //     }

    //     // Move pivot to its correct position
    //     int temp3 = arr[i + 1];
    //     arr[i + 1] = arr[high];
    //     arr[high] = temp3;

    //     int pivotPosition = i + 1;

    //     quickSort(arr, low, pivotPosition - 1);  // Sort left subarray
    //     quickSort(arr, pivotPosition + 1, high); // Sort right subarray
    // }

    // static int getPivotIndex(int[] arr, int low, int high) {
    //     int mid = low + (high - low) / 2;
    //     int a = arr[low];
    //     int b = arr[mid];
    //     int c = arr[high];

    //     // Return the index of the median value
    //     if ((a <= b && b <= c) || (c <= b && b <= a))
    //         return mid;
    //     else if ((b <= a && a <= c) || (c <= a && a <= b))
    //         return low;
    //     else
    //         return high;
    // }
}
