package BinarySearch_Theory_Problems;

// floor = greatest num <= target
//  if target = 15 & arr = {2, 3, 5, 9, 14, 16, 18}
//  ans should be 4 (IDX)

// NOT exaplained correctly, but still a fun gag if you're bored
//https://chat.openai.com/share/ab69d6ae-dc19-48dd-8889-bfffec98262cs


public class FloorOfNum {
    public static void main(String[] args) {
        // int[] arr = {-18, -14, 0, 2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        // System.out.println(isItFlooring(arr, 7, 0, arr.length - 1));

        int[] arr2 = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(isItFlooring(arr2, 15, 0, arr2.length - 1));
    }
    static int isItFlooring(int[] arr, int target, int start, int end){
        if (start > end){
            if (target > arr[end]) return end;  // visualize. At the last iteration, end -> target -> start.
                                                    // this means returning end ensures we are returning
                                                    // THE EXACT PREV element before target i.e. greatest elem <= target

            // return -1;
        }

        int mid = start + (end - start) / 2;

        if (target > arr[mid]) return isItFlooring(arr, target, mid + 1, end);
        else if (target < arr[mid]) return isItFlooring(arr, target, start, mid - 1);
        else return mid;
    }    
}
