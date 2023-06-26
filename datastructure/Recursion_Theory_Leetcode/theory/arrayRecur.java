package Recursion_Theory_Leetcode.theory;

import java.util.ArrayList;

public class arrayRecur {
    
    static boolean sort(int[] arr, int idx){
        if (idx == arr.length - 1) return true;

        return arr[idx] < arr [idx + 1] && sort (arr, idx + 1); //passing the actual array, instead of creating a new object. **Anything that is modified in this array is modified for all recursive process**
    }

    static boolean findTarget(int[] arr, int target, int idx){
        if (idx == arr.length - 1){
            if (arr[idx] == target) return true;
            return false;
        }

        return arr[idx] == target || findTarget(arr, target, ++idx);
    }

    static int findIDX(int[] arr, int target, int idx){
        if (idx == arr.length - 1){
            if (arr[idx] == target) return idx;
            return -1;
        }
        
        return (arr[idx] == target)? idx : findIDX(arr, target, ++idx);
    }

    static int findIDXLast(int[] arr, int target, int idx){
        if (idx == - 1){
            return -1;
        }
        
        return (arr[idx] == target)? idx : findIDX(arr, target, --idx);
    }

    // static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> findAllIdx(int[] arr, int target, int idx, ArrayList<Integer> list){
        if (idx == arr.length -1) return list;
        
        if (arr[idx] == target) list.add(idx);
        
        return findAllIdx(arr, target, ++idx, list);
    }

    static ArrayList<Integer> findAllIdx(int[] arr, int target, int idx){
    
        ArrayList<Integer> list = new ArrayList<>();
        
        if (idx == arr.length -1) return list;
        
        if (arr[idx] == target) list.add(idx);
        
        ArrayList<Integer> answerFromBelow = findAllIdx(arr, target, ++idx);
        list.addAll(answerFromBelow);

        return list;
    }
}
