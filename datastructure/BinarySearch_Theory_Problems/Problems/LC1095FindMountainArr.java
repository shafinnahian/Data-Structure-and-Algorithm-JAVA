package BinarySearch_Theory_Problems.Problems;

//https://leetcode.com/problems/find-in-mountain-array/
// solve explained [by ChatGPT]
//https://chat.openai.com/share/0590280c-3e1c-4f11-ba0d-34a0679b0a3c

public class LC1095FindMountainArr {
    int search (int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinSearch(arr, target, 0, peak);
        if (firstTry != -1) return firstTry;

        // try to search in second half
        return orderAgnosticBinSearch(arr, target, peak + 1, arr.length - 1);
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) end = mid;
            else if (arr[mid] < arr[mid + 1]) start = mid + 1;
        }
        return start;
    }
    static int peakaboo(int[] arr, int start, int end){
        if (start == end) return start;

        int mid = start + (end - start) / 2;

        if (arr[mid] > arr[mid + 1]) return peakaboo(arr, start, mid);
        else if (arr[mid] < arr[mid + 1]) return peakaboo(arr, mid + 1, end);

        return start;
    }

    // order agnostic binary search
    static int orderAgnosticBinSearch(int[] arr, int target, int start, int end){
        if (arr[0] < arr[arr.length - 1]) return ascendingBinarySearch(arr, target, start, end);
        else return descendingBinarySearch(arr, target, start, end);
    }

    private static int descendingBinarySearch(int[] arr, int target, int start, int end) {
        if (start >= end){
            if (target == arr[end]) return end;
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target < arr[mid]) return descendingBinarySearch(arr, target, mid + 1, end);    // will choose RHS
        else if (target > arr[mid]) return descendingBinarySearch(arr, target, start, mid - 1 );    // will choose LHS
        else return mid;    // target == arr[mid]. Ans found.
    }

    private static int ascendingBinarySearch(int[] arr, int target, int start, int end) {
        if (start >= end) {
            if (target == arr[end]) return end;
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target > arr[mid]) return ascendingBinarySearch(arr, target, mid + 1, end); //  will choose RHS
        else if (target < arr [mid]) return ascendingBinarySearch(arr, target, start, mid - 1); //  will choose LHS
        else return mid;    //  target == arr[mid]. Ans found.
    }

}
