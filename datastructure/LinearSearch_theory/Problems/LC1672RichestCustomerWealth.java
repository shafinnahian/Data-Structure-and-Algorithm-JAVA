package LinearSearch_theory.Problems;

public class LC1672RichestCustomerWealth {
    
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < accounts.length; row++){
            int sum = 0;
                for (int i = 0; i < accounts[row].length; i++) {
                sum += accounts[row][i];
            }
            if (max < sum) max = sum;
        }
        return max;
    }
}

