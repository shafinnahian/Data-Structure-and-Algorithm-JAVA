package BinarySearch_Theory_Problems;

public class CeilingOfNum {
//  Ceiling = smallest elem in arr that is >= target
//  if target = 15 & arr = {2, 3, 5, 9, 14, 16, 18}
//  ans should be 5 (IDX)

// thorough explanation w/ simulations [ChatGPT]
//https://chat.openai.com/share/adf79d8c-67d2-4715-a44b-defd7319a711

    public static void main(String[] args) {
        int[] arr = {-18, -14, 0, 2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        System.out.println(isItCeiling(arr, 7, 0, arr.length - 1));

        // int[] arr2 = {2, 3, 5, 9, 14, 16, 17, 17, 18};
        // System.out.println(isItCeiling(arr2, 10, 0, arr2.length - 1));
    }
    

    static int isItCeiling(int[] arr, int target, int start, int end){
        if (start > end){
            if (target < arr[start]) return start;  // visualize. At the last iteration, end -> target -> start.
                                                    // this means returning start ensures we are returning
                                                    // THE VERY NEXT element after target

            // return -1;
        }

        int mid = start + (end - start) / 2;

        if (target > arr[mid]) return isItCeiling(arr, target, mid + 1, end);
        else if (target < arr[mid]) return isItCeiling(arr, target, start, mid - 1);
        else return mid;
    }
}
