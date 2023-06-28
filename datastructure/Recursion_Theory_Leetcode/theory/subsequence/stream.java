package Recursion_Theory_Leetcode.theory.subsequence;

public class stream {
    public static void main(String[] args) {
        // skip("", "baccad");
        // System.out.println(skipString("baccad"));

        // System.out.println(skipApple("bdaapplejg"));
        System.out.println(skipAppNotApple("bdappapplejg"));
    }
    
    static void skip (String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'a') skip (processed, unprocessed.substring(1));
        else skip (processed + ch,unprocessed.substring(1));
    }

    static String skipString ( String unprocessed){
        if (unprocessed.isEmpty()){
            // System.out.println(processed);
            return "";
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'a') return skipString(unprocessed.substring(1));
        else return ch+ skipString(unprocessed.substring(1));
    }

    static String skipApple (String unprocessed){
        if (unprocessed.isEmpty()) return "";

        if (unprocessed.startsWith("apple")) return skipApple(unprocessed.substring(5));
        else return unprocessed.charAt(0) + skipApple(unprocessed.substring(1));
    }

    static String skipAppNotApple (String unprocessed){
        if (unprocessed.isEmpty()) return "";

        if (unprocessed.startsWith("app") && !unprocessed.startsWith("apple")) return skipAppNotApple(unprocessed.substring(3));
        else return unprocessed.charAt(0) + skipAppNotApple(unprocessed.substring(1));
    }
}
