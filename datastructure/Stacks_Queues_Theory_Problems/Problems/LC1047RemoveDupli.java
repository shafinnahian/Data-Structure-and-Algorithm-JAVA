package Problems;

import java.util.Stack;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class LC1047RemoveDupli {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        stack.add(ch[0]);

        for (int i = 1; i < ch.length; i++) {
            if (!stack.isEmpty() && stack.peek() == ch[i]) stack.pop();
            else stack.add(ch[i]);
        }

        String ans = "";
        while (!stack.isEmpty()) {
            ans = stack.pop() + ans;
        }

        return ans;
    }
}
