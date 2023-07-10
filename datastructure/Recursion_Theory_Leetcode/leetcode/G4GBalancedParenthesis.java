package Recursion_Theory_Leetcode.leetcode;

import java.util.Arrays;

// solve explanation: ChatGPT
// https://chat.openai.com/share/9997bdb4-a605-4c4e-b7b1-c7e387b32b1d

public class G4GBalancedParenthesis {
    public static void main (String[] args){
        char[] ch = "{{[()]}}".toCharArray();   // balanced
        //char[] ch = "{{[(]}}".toCharArray(); // unbalanced
        if (check(ch, ch.length)) System.out.println("Balanced");
        else System.out.println("Unbalanced");
    }

    static char findClosing(char c){    //takes a character c representing an opening bracket and returns its corresponding closing bracket.
        if (c == '(') return ')';
        else if (c == '{') return '}';
        else if (c == '[') return ']';

        return '\0';
    }

    static boolean check(char[] expr, int n){
        if (n == 0) return true;
        if (n == 1) return false;   // single bracket left

        if (expr[0] == ')' || expr[0] == '}' || expr[0] == ']') return false;   //If the first character in expr is a closing bracket, return false

        char closebracket = findClosing(expr[0]);   // finding  the corresponding closing bracket for the first opening bracket

        int i, count = 0;   // count is being used to handle cases -> ((()))
                            // it checks for every corresponding closing brackets

        for(i = 1; i < n; i++){
            if (expr[i] == expr[0]) count++;
            if (expr[i] == closebracket){
                if (count == 0) break;  // this helps with the conditino in line 33
                count--;
            }
        }

        if (i == n) return false;   // we did not find a corresponding closing bracket
        if (i == 1) return check(Arrays.copyOfRange(expr, 2, n), n - 2);    // skips the completed brackets at first and-
                                                                                // creates a new arr with (expr + 2) -> pointer skipping two IDX of old arr
        // if closing bracket is in middle of somewhere (at IDX i)
        // the last statement calls two recursion
        // first one: checks the balance of the substring that comes after the opening bracket and before the corresponding closing bracket
        // tailed recursion:  It starts from the index i+1 (right after the closing bracket) and extends up to the end of the array n

        return check(Arrays.copyOfRange(expr, 1, i), i - 1) && check(Arrays.copyOfRange(expr, (i + 1), n), n - i - 1);
    }
}
