package Recursion_Theory_Leetcode.theory;

import java.util.Arrays;

public class mergeRecursion {
    public static void main(String[] args) {
        int[] arr ={8, 3, 4, 12, 5, 6};
        
        arr= mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //quick visuals:
    //https://www.youtube.com/watch?v=4VqmGXwpLqc&ab_channel=MichaelSambol


    static int[] mergeSort(int[] arr){
        if (arr.length == 1) return arr;

        int mid = arr.length / 2;

        int [] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); //creating a different object, original array is not modified
        int [] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)); //creating a different object, original array is not modified

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //if there are elements left in the array
        //copy the remaining elements

        while (i < first.length ){
            mix[k] = first [i];
            i++;
            k++;
        }

        while ( j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
