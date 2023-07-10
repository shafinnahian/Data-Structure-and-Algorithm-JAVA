package Recursion_Theory_Leetcode.leetcode;

//https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/

public class G4GLengthOfString {
    public static void main(String[] args) {
        System.out.println(length("GEEKSFORGEEKS"));
    }
    public static int length(String str){
        if (str.length() == 1) return 1;

        return length(str.substring(1)) + 1;
    }
}
