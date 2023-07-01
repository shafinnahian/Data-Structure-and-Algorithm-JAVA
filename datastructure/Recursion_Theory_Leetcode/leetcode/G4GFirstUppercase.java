package Recursion_Theory_Leetcode.leetcode;

public class G4GFirstUppercase {
    public static void main(String[] args) {
        firstUpper("gEekS");
    }

    static void firstUpper(String word){
        if (word.length() == 0){
            if (Character.isUpperCase(word.charAt(0))){
                System.out.println(word);
                return;
            }
        }

        char ch = word.charAt(0);

        if(Character.isUpperCase(ch)){
            System.out.println(ch);
            return;
        }

        firstUpper(word.substring(1));
    }
}
