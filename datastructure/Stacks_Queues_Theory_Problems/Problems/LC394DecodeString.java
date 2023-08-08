package Problems;

import java.util.Stack;

public class LC394DecodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }
    public static String decodeString(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int digitCounter = 0;

        int bracketCounter = 0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])){
                digitCounter = ch[i] - 48;
                bracketCounter = i + 2;
                while (ch[bracketCounter] != ']'){
                    stack.push(ch[bracketCounter++]);
                }
                s = "";
                while (!stack.isEmpty()) s= stack.pop() + s;

                while (digitCounter != 0){
                    ans.append(s);
                    digitCounter--;
                }
                i = bracketCounter;
            }
        }
        return ans.toString();
    }
}
