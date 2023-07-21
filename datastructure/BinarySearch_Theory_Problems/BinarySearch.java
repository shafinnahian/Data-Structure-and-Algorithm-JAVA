package BinarySearch_Theory_Problems;

public class BinarySearch {
    public static void main(String[] args) {
        //  //  ascending order
        // int[] arr = {-18, -14, 0, 2, 4, 6, 9, 11, 12, 14, 20, 36, 48};

        // System.out.println(binarySearch(arr, 36));
        // System.out.println(binarySearchRecur(arr, 36, 0, arr.length - 1));
        // System.out.println(orderAgnosticBinSearch(arr, 36));

        //  //  descending order
        // int[] arr2 = {46, 46, 46, 45, 34, 23, 12, 9, 7, 6, 5, 4, 3, 2, 1, 0};
        // System.out.println(orderAgnosticBinSearch(arr2, 0));
    }

    // return the index
    public static int binarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            // find the middle element
            // if we do (start + end) / 2; it may exceed the range of integer in Java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;  // The element does not exist
    }

    // returns index [recursive process]
    public static int binarySearchRecur(int[] arr, int target, int start, int end){
        if (start > end){
            if (target == arr[end]) return end;
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target > arr[mid]) return binarySearchRecur(arr, target, mid + 1, end);
        else if (target < arr[mid]) return binarySearchRecur(arr, target, start, mid - 1);
        else return mid;
    }

    // condition: array is sorted, but we do not know whether in ascending or descending
    // This is a case of Order Agnostic Binary Search
    // Compare first and last idx of arr - avoids the error of repeat
    // if 1st idx < last idx -> ascending. else descending

    static int orderAgnosticBinSearch(int[] arr, int target){
        if (arr[0] < arr[arr.length - 1]) return ascendingBinarySearch(arr, target, 0, arr.length - 1);
        else return descendingBinarySearch(arr, target, 0, arr.length - 1);
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

    // same as binarySearchRecur. Wrote it to practice lmao
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
