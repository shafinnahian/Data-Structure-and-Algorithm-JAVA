package Recursion_Theory_Leetcode.leetcode;

//solution explanation: ChatGPT
// https://chat.openai.com/share/216525e1-2c58-4957-bf14-6276c0cd99fa

public class G4GRemoveConseqDupli {
    public static void main(String[] args) {
        System.out.println(removeDupli("aaaaabsdffffe"));
    }

    static String removeDupli(String word){
        if (word.length() == 1) return word;

        if (word.charAt(0) == word.charAt(1)){
            return removeDupli(word.substring(1));
        } else {
            return word.charAt(0) + removeDupli(word.substring(1));
        }
    }
}
