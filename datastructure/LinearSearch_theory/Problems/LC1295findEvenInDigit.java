package LinearSearch_theory.Problems;

public class LC1295findEvenInDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int counter = 0;

        for (int num : nums) {
            //for method 1:
            if (even(num)) counter++;

            //for method 2: (logarithmic approach)
            // if (even2(num) % 2 == 0) counter++;
        }

        return counter;
    }

    private static boolean even(int num) {

        int count = 0;
        while (num > 0){
            num = num/ 10;
            count++;
        }
        return count % 2 == 0;
    }

    static int even2(int num){
        return (int)(Math.log10(num)) + 1;
    }
}

