package Recursion_Theory_Leetcode.leetcode;

//https://leetcode.com/problems/fibonacci-number/description/
//https://leetcode.com/problems/fibonacci-number/solutions/3683135/recursive-java-solve-thoroughly-explained/

public class LC509Fibonacci {
    public int fib (int n){
        if (n < 2) return n;

        return fib (n-1) + fib (n-2);
    }
}
