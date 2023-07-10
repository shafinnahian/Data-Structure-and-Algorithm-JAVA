package Recursion_Theory_Leetcode.leetcode;

import java.util.Scanner;

public class G4GGeekONacci {
    //https://practice.geeksforgeeks.org/problems/geek-onacci-number/0

    public static void main(String[] args) {
        int[] arr = new int[4];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Digit");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(geekONacci(arr, arr[arr.length - 1]));
    }
    
    static int geekONacci(int[] arr, int last){
        last = last - 1;
        int ans = arr[0]+arr[1]+arr[2];

        if (last == 3) return ans;
        else {
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = ans;

            return geekONacci(arr, last);
        }
    }
}
