package BinarySearch_Theory_Problems.Problems;

//amazon
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class ElemInfiniteArr {
    public static void main(String[] args) {
        int[] arr = {3,5, 7 ,9, 10, 90, 100, 130, 140, 160, 170};   // note that this must be infinite arr
                                                                    // since it is not infinite
                                                                    // changing target val = java.lang.ArrayIndexOutOfBoundsException
                                                                    // theoretically the solve is sound
        int target = 10;

        // System.out.println(findingAns(arr, target));
        System.out.println(ansRecur(arr, target, 0, 1));
    }
    static int findingAns(int[] arr, int target){
        // first find the range
        // first start with a box of size 2

        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]){
            int newStart = end + 1;
            // double the box value & update start
            end +=  (end - start + 1) * 2;
            start = newStart;
        }

        return search(arr, target, start, end);
    }

    public static int search(int[] arr, int target, int start, int end){
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

    // complete recursive process

    static int ansRecur(int[] arr, int target, int start, int end){
        if (target < arr[end]) return searchRecur(arr, target, start, end);

        return ansRecur(arr, target, end + 1, (end + (end - (start - 1))*2) );
    }
    private static int searchRecur(int[] arr, int target, int start, int end) {
        if (start > end){
            if (target == arr[end]) return end;
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target < arr[mid]) return searchRecur(arr, target, start, mid - 1);
        else if (target > arr[mid]) return searchRecur(arr, target, mid + 1, end);
        else return mid;
    }
}
