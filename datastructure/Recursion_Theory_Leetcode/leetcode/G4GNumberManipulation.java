package Recursion_Theory_Leetcode.leetcode;


public class G4GNumberManipulation {
    public static void main(String[] args) {
        // int num = 12345;
        // System.out.println(sumInt(num));

        System.out.println(productByMultiplierSum(100, 5));
    }

    //https://www.geeksforgeeks.org/sum-digit-number-using-recursion/
    static int sumInt(int num){
        if (num == 0) return 0;

        return num % 10 + sumInt(num/10);
    }

    //https://www.geeksforgeeks.org/product-2-numbers-using-recursion/
    static int productByMultiplierSum(int multiplicant, int multiplier){
        if (multiplicant < multiplier) return productByMultiplierSum(multiplier, multiplicant);
        else if ( multiplier != 0) return multiplicant + productByMultiplierSum(multiplicant, multiplier - 1);
        else return 0;
    }


}
