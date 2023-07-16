package LinearSearch_theory;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5, 6};
    //     System.out.println(isTrueInt(arr, 8));
    // System.out.println(rangeSearch(arr, 2, 5, 4));
    System.out.println(rangeSearchRecur(arr, 2, 5, 6));

        // System.out.println(isTrueStr("null", 'u'));
    }
    
    
    //  search in the arr: return the index if item found
    // otherwise if item not found return - 1
    static int linearsearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            int element = arr[i];
            if (element == target) return i;
        }

        return -1;
    }

    // search in recursion: return if true/ false (for int)
    static boolean isTrueInt(int[] arr, int target){
        if (arr.length == 1) {
            if (arr[0] == target) return true;
            return false;
        }

        if (arr[0] == target) return true;

        int[] copy = new int [arr.length - 1];
        System.arraycopy(arr,1,copy,0, copy.length);
        // System.out.println(Arrays.toString(copy));

        return isTrueInt(copy, target);
    }

    // search in recursion: return if true/ false (for String)
    static boolean isTrueStr(String word, char target){
        if (word.length() == 0) return false;

        char firstWord = word.charAt(0);
        if (firstWord == target) return true;

        return isTrueStr(word.substring(1), target);
    }

    // search within a range: return true/ false
    static boolean rangeSearch(int[] arr, int startRange, int endRange, int target){
        if (arr.length == 0) return false;

        for (int i = startRange - 1; i < endRange - 1; i++) {
            if (arr[i] == target) return true;
        }
        return false;
    }

    // search within a range (in recursion): return true/ false
    static boolean rangeSearchRecur(int[] arr, int startRange, int endRange, int target){
        if (startRange == endRange) return false;

        if (arr[startRange - 1] == target) return true;

        return rangeSearchRecur(arr, startRange + 1, endRange, target);
    }
}
