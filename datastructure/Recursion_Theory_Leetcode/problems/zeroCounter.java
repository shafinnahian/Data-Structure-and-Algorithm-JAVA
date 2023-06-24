package Recursion_Theory_Leetcode.problems;

public class zeroCounter {
        public static void main(String[] args) {
        System.out.println(count(30201));
    }
 
    static int count (int n){
        return helper (n, 0); //VVI for understanding value passing / returning.
    }

    private static int helper (int n, int c){
        if(n == 0) return c;

        int rem = n % 10;
        if (rem == 0) return helper(n/10, ++c);

        return helper(n/10, c);
    }
}
