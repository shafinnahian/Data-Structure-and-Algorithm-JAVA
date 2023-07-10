package Recursion_Theory_Leetcode.leetcode;

import java.util.Scanner;

//https://www.geeksforgeeks.org/recursive-program-prime-number/
public class G4GPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        if (isPrime(sc.nextInt(), 2)) System.out.println("Yes");
        else System.out.println("No");
    }
    
    static boolean isPrime(int num, int multiplier){
        if (num <= 2){
            return (num == 2) ? true : false;
        }
        if (num == multiplier) return true;
        
        if (num % multiplier == 0) return false;

        return isPrime(num, multiplier + 1);
    }
}
