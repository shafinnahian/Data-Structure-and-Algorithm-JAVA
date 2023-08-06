package Problems;

import java.util.Arrays;
import java.util.Stack;
//https://leetcode.com/problems/remove-outermost-parentheses/description/

public class LC1021RemoveOuterParenthesis {
    public String removeOuterParentheses(String s) {
        char[] arr = s.toCharArray();
        if (arr.length <= 2){
            return "";
        }

        StringBuilder ans = new StringBuilder();
        Stack<Character> brackets = new Stack<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == '('){

                if (brackets.size() > 0) {
                    ans.append("(");
                }
                brackets.push(arr[j]);
            } else {
                brackets.pop();
                if (brackets.size() > 0) {
                    ans.append(")");
                }
            }
        }

        return ans.toString();
    }
}
