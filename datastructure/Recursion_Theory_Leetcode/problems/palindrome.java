package Recursion_Theory_Leetcode.problems;

public class palindrome {
    public static void main(String[] args) {
    System.out.println(palin(18244281));

    System.out.println(rev(9876));
    }

    static boolean palin(int n){
    return n == rev(n);
    }

    static int rev (int n){
        if (n == 0) return n;

        int digit = (int)(Math.log10(n)+1);

        return helper(n, digit);
    }

    static int helper(int n, int digit){
        if (n % 10 == n) return n;

        int rem = n % 10;
        return rem * (int)(Math.pow(10, digit - 1)) + helper (n / 10, digit - 1);
    }
}
