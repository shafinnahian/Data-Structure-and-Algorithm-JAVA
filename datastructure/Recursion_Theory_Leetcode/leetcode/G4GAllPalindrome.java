package Recursion_Theory_Leetcode.leetcode;

// solve explanation: ChatGPT
// https://chat.openai.com/share/a86c0a3a-e651-4863-a7a4-3102c768ca5e

public class G4GAllPalindrome {
    public static void main(String[] args) {
        soln("abaaba", "");
    }

    static void soln(String word, String asf){
        if (word.isEmpty()){
            System.out.println(asf);
            return;
        }

        for(int i = 0; i < word.length(); i++){
            String prefix = word.substring(0, i + 1);
            String rem = word.substring(i + 1);

            if (isPalindrome(prefix)){
                soln(rem, asf+"("+ prefix + ") ");
            }
        }
    }

    private static boolean isPalindrome(String prefix) {
        int leftIDX = 0;
        int rightIDX = prefix.length() - 1;

        while (leftIDX < rightIDX) {
            char leftCh = prefix.charAt(leftIDX);
            char rightCh = prefix.charAt(rightIDX);

            if (leftCh != rightCh) return false;

            rightIDX--;
            leftIDX++;
        }
        return true;
    }
}
