package Recursion_Theory_Leetcode.theory.subsequence;

import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        // System.out.println(subseqArrRet("", "abc")); // ArrayList

        // subsequenceASCII(" ", "abc");    // ASCII subseq
        System.out.println(subseqArrRetASCII(" ", "abc"));  // ArrayList ASCII subseq
    }

    static void subsequence(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subsequence(processed + ch, unprocessed.substring(1));
        subsequence(processed, unprocessed.substring(1));
    }

    //try solving it with one parameter in the argument and returns a string

    static ArrayList <String> subseqArrRet (String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            ArrayList <String> list = new ArrayList <String> (); // if you don't add <Str> in new Arraylist
                                                                // it will give "\subseq.java uses unchecked or unsafe operations." error; Compiler cannot 
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        ArrayList <String> left = subseqArrRet(processed + ch, unprocessed.substring(1));
        ArrayList <String> right = subseqArrRet(processed, unprocessed.substring(1));

        left.addAll(right);
        return left;
    }

    static void subsequenceASCII(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subsequenceASCII(processed + ch, unprocessed.substring(1));
        subsequenceASCII(processed, unprocessed.substring(1));
        subsequenceASCII(processed + (ch+0), unprocessed.substring(1));
    }

    static ArrayList <String> subseqArrRetASCII (String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            ArrayList <String> list = new ArrayList <String> (); // if you don't add <Str> in new Arraylist
                                                                // it will give "\subseq.java uses unchecked or unsafe operations." error; Compiler cannot 
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        ArrayList <String> first = subseqArrRetASCII(processed + ch, unprocessed.substring(1));
        ArrayList <String> second = subseqArrRetASCII(processed, unprocessed.substring(1));
        ArrayList <String> third = subseqArrRetASCII(processed + (ch + 0), unprocessed.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
