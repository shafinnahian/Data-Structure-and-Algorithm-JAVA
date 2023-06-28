package Recursion_Theory_Leetcode.theory.subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iterativeSubseq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};

        List <List<Integer>> ans = subsetNoDupli(arr);

        // List <List<Integer>> ans2 = subset(arr); //comment  out line 12 if this wants to be ran

        // System.out.println(ans);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
    

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {   //for each loop - iterates through the length while num = arr[value];
            int n = outer.size();   //size updates every iteration

            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i)); //creates a new list internal and initializes it with the elements of the subset at index i in the outer list.
                internal.add(num);

                outer.add(internal);    //adds the updated internal list to the outer list, representing a new subset that includes the current element.
            }
            
        }

        return outer;
    }

    static List<List<Integer>> subsetNoDupli(int[] arr){
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {  //for each loop - iterates through the length while num = arr[value];
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) start = end + 1; // if current and previous element is same, s = e + 1;

            end = outer.size() - 1;

            int n = outer.size();   //size updates every iteration

            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j)); //creates a new list internal and initializes it with the elements of the subset at index i in the outer list.
                internal.add(arr[i]);

                outer.add(internal);    //adds the updated internal list to the outer list, representing a new subset that includes the current element.
            }
            
            
        }
        return outer;
    }
}
