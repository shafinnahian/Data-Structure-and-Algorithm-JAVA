package BinarySearch_Theory_Problems.Problems;

//https://leetcode.com/problems/split-array-largest-sum/
//https://leetcode.com/problems/split-array-largest-sum/solutions/3831286/1ms-runtime-solution-java-thoroughly-explained/

public class LC410SplitArr {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); //by the end of loop, it will hold the max elem
            end += nums[i];
        }

        //binary search
        while (start < end){
            // try for the middle as potential answer
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num: nums){
                if (sum + num > mid){
                    // you cannot add it in this sub array
                    // make new subarray, add it there
                    // sum = num now, ex - 7 + 2 + 5 + 8 > 21 but 8 < 21 so [8] and sum is 8

                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k){
                start = mid + 1;
            } else end = mid;
        }

        return end;
    }
}
