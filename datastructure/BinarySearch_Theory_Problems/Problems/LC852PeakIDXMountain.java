package BinarySearch_Theory_Problems.Problems;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/s
// Solution:
//https://leetcode.com/problems/peak-index-in-a-mountain-array/solutions/3803198/beat-100-runtime-java-solve-w-thorough-explanation/

public class LC852PeakIDXMountain {
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

    // recursive solution
    static int peakaboo(int[] arr, int start, int end){
        if (start == end) return start;

        int mid = start + (end - start) / 2;

        if (arr[mid] > arr[mid + 1]) return peakaboo(arr, start, mid);
        else if (arr[mid] < arr[mid + 1]) return peakaboo(arr, mid + 1, end);

        return start;
    }
    // public int peakIndexInMountainArray(int[] arr) {
    //     return peakaboo(arr, 0, arr.length - 1);
    // }
}
