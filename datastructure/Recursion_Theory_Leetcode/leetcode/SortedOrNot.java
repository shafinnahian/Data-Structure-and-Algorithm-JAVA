package Recursion_Theory_Leetcode.leetcode;

//https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/

public class SortedOrNot {
    public static void main(String[] args) {
        // int[] arr = { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18};    // unsorted
        int[] arr = {7, 10, 11, 14, 16, 18, 25, 28, 30, 50};    //sorted
        System.out.println(isSorted(arr, arr.length));
    }
    
    static boolean isSorted(int[] arr, int len){
        if (len <= 1) return true;

        if (arr[len - 1] < arr[len - 2]) return false;

        return isSorted(arr, len - 1);
    }
}
