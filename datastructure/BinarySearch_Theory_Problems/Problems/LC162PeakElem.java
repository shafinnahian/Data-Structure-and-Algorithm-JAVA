package BinarySearch_Theory_Problems.Problems;
//https://leetcode.com/problems/find-peak-element/description/

// solve:
//https://leetcode.com/problems/find-peak-element/solutions/3803208/beat-100-runtime-java-w-thorough-explanation-easier-than-boiling-an-egg/

public class LC162PeakElem {
    public int findPeakElement(int[] nums) {
        return peakaboo(nums, 0, nums.length - 1);
    }
    public int peakaboo(int[] arr, int start, int end){
        if (start == end) return start;

        int mid = start + (end - start) / 2;

        if (arr[mid] > arr[mid + 1]) return peakaboo(arr, start, mid);
        else if (arr[mid] < arr[mid + 1]) return peakaboo(arr, mid + 1, end);

        return start;
    }
}
