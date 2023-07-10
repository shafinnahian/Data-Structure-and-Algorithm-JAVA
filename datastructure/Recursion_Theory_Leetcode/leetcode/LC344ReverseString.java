package Recursion_Theory_Leetcode.leetcode;

//https://leetcode.com/problems/reverse-string/description/

public class LC344ReverseString {
    static void reverseString (char[] s){
        reverse (s, 0, s.length - 1);
    }

    private static char[] reverse(char[] s, int start, int end) {
        if (start > end) return s;

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        reverse(s, start++, end--);
        return s;
    }
}
