package BinarySearch.Problems;


//problem
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

// solution w/ explanation
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/solutions/3802783/beat-100-runtime-java-2-solves-w-thorough-explanations/

public class LC744SmallestNumber {

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end ){
            int mid = start + (end - start) / 2;

            if (target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }

    public char nextGreatestLetterRecur(char[] letter, char target, int start, int end){
        if (start > end){
            return letter[start % letter.length];
        }

        int mid = start + (end - start) / 2;

        if (target < letter[mid]) return nextGreatestLetterRecur(letter, target, start, mid - 1);
        else return nextGreatestLetterRecur(letter, target, mid + 1, end);
    }
}
