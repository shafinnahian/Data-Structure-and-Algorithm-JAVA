package Recursion_Theory_Leetcode.leetcode;

import java.util.Arrays;

//https://www.geeksforgeeks.org/powet-set-lexicographic-order/
// thorough explanation by ChatGPT
//https://chat.openai.com/share/ad8f2afc-5f4e-402b-86da-46d02f8293bb

public class G4GPowSetLexographic {
    public static void main(String[] args) {
        String word = "cab";
        powerSet(word);  // sorts, permutes
        // permutation(word, word.length(), -1, "");   // permutes unsorted
    }
    static void permutation(String word, int len, int idx, String curr){
        if (idx == len) return;

        if (!curr.equals("")) System.out.println(curr);
        for(int i = idx + 1; i < len; i++){
            curr += word.charAt(i);
            permutation(word, len, i, curr);

            curr = curr.substring(0, curr.length() - 1);    // to backtrack; for loop
        }
    }
 
    // Generates power set in lexicographic
    // order.
    static void powerSet(String str)
    {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        permutation(new String(arr), str.length(), -1, "");
    }
}
