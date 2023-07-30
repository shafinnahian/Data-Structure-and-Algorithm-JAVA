package Problems;

import java.util.Arrays;

//https://www.hackerrank.com/challenges/game-of-two-stacks/problem
public class HRGameTwoStacks {
    public static void main(String[] args) {
        int[] a = {4, 2, 4, 6, 1};
        int[] b = {2, 1, 8, 5};

        System.out.println(twoStacks(10, a, b));
    }
    static int twoStacks(int target, int[] a, int[] b){
        return twoStacks(target, a, b, 0, 0) - 1;
    }

    private static int twoStacks(int target, int [] a, int[] b, int sum, int count) {
        if (sum > target) return count;

        if (a.length == 0 || b.length == 0) return count;

        int ans1 = twoStacks(target, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(target, a, Arrays.copyOfRange(b, 1, a.length), sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }
}
