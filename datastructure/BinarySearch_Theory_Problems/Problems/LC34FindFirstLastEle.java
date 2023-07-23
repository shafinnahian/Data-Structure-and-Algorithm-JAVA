package BinarySearch.Problems;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-numsay/
// facebook question

public class LC34FindFirstLastEle {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // returns the idx val of our target
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = 1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            // find the middle element
            // if we do (start + end) / 2; it may exceed the range of integer in Java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]){
                start = mid + 1;
            } else {    // potential ans found
                ans = mid;
                if (findStartIndex) end = mid - 1;
                else start = mid + 1;
            }
        }

        return ans; 
    }
}
