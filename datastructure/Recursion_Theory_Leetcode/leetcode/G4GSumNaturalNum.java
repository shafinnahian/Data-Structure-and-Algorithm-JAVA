package Recursion_Theory_Leetcode.leetcode;

//https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/

public class G4GSumNaturalNum {
    public static void main(String[] args) {
        System.out.println(sumNatural(6));
    }
    
    static int sumNatural(int num){
        if (num == 0) return 0;

        return num + sumNatural(num - 1);
    }
}
