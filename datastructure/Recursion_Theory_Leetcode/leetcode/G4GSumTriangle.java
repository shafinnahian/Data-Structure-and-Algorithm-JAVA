package Recursion_Theory_Leetcode.leetcode;

public class G4GSumTriangle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sumTriangle(arr);
    }
    
    static void sumTriangle(int[] arr){
        if (arr.length == 1){
            System.out.println(arr[0]);
            return;
        }

        int[] arrNew = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++){
            arrNew[i] = arr[i] + arr[i+1];
        }

        sumTriangle(arrNew);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
