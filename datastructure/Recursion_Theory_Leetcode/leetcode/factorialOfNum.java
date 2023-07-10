package Recursion_Theory_Leetcode.leetcode;
//https://www.hackerrank.com/challenges/30-recursion/problem

public class factorialOfNum {
    public static void main(String[] args) {
        System.out.println(factOfNum(6));
    }
    static int factOfNum(int num){
        if (num == 1) return num;

        return num * factOfNum(num - 1);
    }
}
