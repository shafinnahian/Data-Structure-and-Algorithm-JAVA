package Recursion_Theory_Leetcode.leetcode;

//https://leetcode.com/problems/power-of-two/description/

public class LC231PowOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
    
    static boolean isPowerOfTwo(int n){
        if (n == 1) return true;    // means 2/2 == 1, being n (specifically 2^0 == 1)
        if (n == 0) return false;  // any power of two > 0
        if (n % 2 != 0) return false;  // main checker
        
        return isPowerOfTwo(n/2);   // call continues till n = 1 or 0
    }
}
