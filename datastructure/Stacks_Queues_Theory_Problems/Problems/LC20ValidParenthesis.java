package Problems;

import java.util.Stack;
//https://leetcode.com/problems/valid-parentheses/submissions/
public class LC20ValidParenthesis {
    public boolean isValid(String s) {
        // if (s.length() == 1) return false;
        Stack <Character> stack = new Stack<>();

        for ( char ch: s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            else{
                if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(' ) return false;
                    // else stack.pop();
                }
                if (ch == '}'){
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    // else stack.pop();
                }
                if (ch == ']'){
                    if (stack.isEmpty() || stack.pop() != '[' ) return false;
                    // else stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
