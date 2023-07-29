package BinarySearch_Theory_Problems.Problems;

//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class G4GCountRotateArr {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 0, 1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 0};   // run this while debugging too
        // System.out.println(countRotate(arr));
        System.out.println(countInRecur(arr, 0, arr.length - 1));
    }
    
    // It is the same as finding pivot
    // except need to add +1 when returning pivot IDX
    // since we have to return the total rotation numbers
    // each rotation pivot IDX += 1, but IDX starts from 0
    // hence count = (pivot IDX) + 1

    static int countRotate(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) return (mid) + 1; // +1 cause counting rotation
            else if (mid > start && arr[mid] < arr[mid - 1]) return (mid - 1) + 1;  // +1 cause counting rotation

            if (arr[start] >= arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return 0;
    }

    //recursive method
    static int countInRecur(int[] arr, int start, int end){
        if (start > end) return 0;
        int mid = start + (end - start) / 2;

        if (mid < end && arr[mid] > arr[mid + 1]) return (mid) + 1; // +1 cause counting rotation
        else if (mid > start && arr[mid] < arr[mid - 1]) return (mid - 1) + 1;  // +1 cause counting rotation

        if (arr[start] >= arr[mid]) return countInRecur(arr, start, mid - 1);
        else return countInRecur(arr, mid + 1, end);
    }
}
