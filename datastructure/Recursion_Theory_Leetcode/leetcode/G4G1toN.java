package Recursion_Theory_Leetcode.leetcode;

// https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1

public class G4G1toN {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        counter(1, n);
    }
    private static void counter(int count, int n){
        if (count == n){
            System.out.print(count);
            return;
        }

        System.out.print(count + " ");
        counter(count + 1, n);
    }
}

