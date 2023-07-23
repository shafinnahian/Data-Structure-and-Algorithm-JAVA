package BinarySearch_Theory_Problems.Problems;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
//https://leetcode.com/problems/search-in-rotated-sorted-array/solutions/3803420/beat-100-users-java-w-binary-recursive-explained/

public class LC33SearchInRotatedArr {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;
            if (arr[mid] <= arr[start]) end = mid - 1;
            else start = mid + 1;
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) return binarySearchRecur(nums, target, 0, nums.length - 1);

        if (nums[pivot] == target) return pivot;
        if (nums[0] <= target) return binarySearchRecur(nums, target, 0, pivot - 1);
        else return binarySearchRecur(nums, target, pivot + 1, nums.length - 1);
    }

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
}
