package Recursion_Theory_Leetcode.leetcode;

import java.util.ArrayList;

public class LC17LetterCombination {
    public static void main(String[] args) {
        // pad("", "12");
        System.out.println(padArrList("", "12"));
    }
    
    static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // will convert '2' in 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) { // understand the range with pen - paper
            char ch = (char)('a' + i);

            pad (p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padArrList(String p, String up){
        ArrayList <String> ans = new ArrayList<>();
        if (up.isEmpty()){
            ans.add(p);
            return ans;
        }

        int digit = up.charAt(0) - '0'; // will convert '2' in 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) { // understand the range with pen - paper
            char ch = (char)('a' + i);

            ans.addAll(padArrList(p + ch, up.substring(1)));
        }

        return ans;
    }

}
