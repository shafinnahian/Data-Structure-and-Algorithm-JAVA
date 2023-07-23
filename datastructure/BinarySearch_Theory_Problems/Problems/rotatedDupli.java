package BinarySearch_Theory_Problems.Problems;

public class rotatedDupli {
    public static void main(String[] args) {
        int[] arr= {2, 3, 2, 4, 2, 5, 2, 6, 2}; //remove the last elem and check again
                                                // debug if needed
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

            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                // if elem[start] == elem[mid] == elem[end], skip duplis
                // NOTE: What if start/ end is the pivot?
                if (arr[start] > arr[start + 1]) start++;
                if (arr[end] < arr[end - 1] ) return end - 1;
                end--;                
            }
            // left side is sorted, so pivot right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid + 1;
            }

        }
        return -1;
    }
}
