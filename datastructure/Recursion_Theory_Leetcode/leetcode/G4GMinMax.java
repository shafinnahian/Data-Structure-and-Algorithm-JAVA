package Recursion_Theory_Leetcode.leetcode;

public class G4GMinMax {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, -5, -4, 8, 6};
        minMax(arr, arr.length - 1, 0, arr[0], arr[0]);
    }
    
    static void minMax (int[] arr, int length, int counter, int min, int max){
        if (length == 0){
            System.out.println(min +" "+ max);
            return;
        }

        if (counter < length){
            if ( arr[counter] < min) minMax(arr, length, counter + 1, arr[counter], max);
            else if (arr[counter] > max) minMax(arr, length , counter + 1, min, arr[counter]);
            else minMax(arr, length, counter + 1, min, max);
        } else minMax(arr, length - 1, 0, min, max);
    }
}
