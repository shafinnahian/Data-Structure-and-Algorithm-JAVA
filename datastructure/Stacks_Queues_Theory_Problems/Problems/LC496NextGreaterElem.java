package Problems;

import java.util.ArrayDeque;
import java.util.Queue;

//https://leetcode.com/problems/next-greater-element-i/description/
public class LC496NextGreaterElem {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Queue<Integer> queue = new ArrayDeque<>();
        int count = -1;
        int arrCount = 0;

        for (int i = 0; i < nums1.length; i++) {
            queue.add(nums1[i]);
        }

        int [] ans = new int[queue.size()];

        while (!queue.isEmpty()){
            int num = queue.remove();

            int i = findIndex(nums2, num);
            for (; i < nums2.length; i++) {
                if (num < nums2[i]){
                    count = nums2[i];
                    break;
                }
            }

            ans[arrCount++] = count;
            count = -1;
        }

        return ans;
    }

    static int findIndex(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }

        return -1;
    }
}
