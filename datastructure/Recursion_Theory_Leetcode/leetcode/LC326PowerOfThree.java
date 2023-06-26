package Recursion_Theory_Leetcode.leetcode;

//https://leetcode.com/problems/power-of-three/description/

public class LC326PowerOfThree {
        public boolean isPowerOfThree(int n) {
        if (n == 1) {return true;}

        if(n % 3 != 0 || n <= 0) {return false;}
        return isPowerOfThree(n/3);
    }
}
