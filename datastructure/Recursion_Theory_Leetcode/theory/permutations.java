package Recursion_Theory_Leetcode.theory;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        System.out.println(permutationArrList("", "abc"));

        System.out.println(permutationCount("", "abcd"));
    }

    static void permutation(String processed, String unprocessed){
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        for(int i = 0; i<= processed.length(); i++){
            String first = processed.substring(0, i);
            String last = processed.substring(i, processed.length());

            permutation(first + ch + last, unprocessed.substring(1));
        }
    }

    static ArrayList<String> permutationArrList(String processed, String unprocessed){
        
        ArrayList <String> ans = new ArrayList<>();
        
        if (unprocessed.isEmpty()) {
            ans.add(processed);
            return ans;
        }

        char ch = unprocessed.charAt(0);

        for(int i = 0; i<= processed.length(); i++){
            String first = processed.substring(0, i);
            String last = processed.substring(i, processed.length());

            ans.addAll(permutationArrList(first + ch + last, unprocessed.substring(1)));
        }

        return ans;
    }

    static int permutationCount(String processed, String unprocessed){
        if (unprocessed.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = unprocessed.charAt(0);

        for(int i = 0; i<= processed.length(); i++){
            String first = processed.substring(0, i);
            String last = processed.substring(i, processed.length());

            count += permutationCount(first + ch + last, unprocessed.substring(1));
        }

        return count;
    }

}
