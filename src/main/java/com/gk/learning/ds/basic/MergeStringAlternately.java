package com.gk.learning.ds.basic;

public class MergeStringAlternately {

    public static void main(String[] args) {
        String mergedString = mergeString("abc", "pq");
        System.out.println(mergedString);


    }

    static String mergeString(String s1, String s2){
        int maxLength = Math.max(s1.length(), s2.length());
        String mergedString = "";
        for( int i = 0 ; i < maxLength; i ++){
            String s1Char = "";
            String s2Char = "";
            if(i < s1.length()){
                s1Char = String.valueOf(s1.charAt(i));
            }
            if(i < s2.length()){
                s2Char = String.valueOf(s2.charAt(i));
            }
            mergedString = mergedString.concat(s1Char).concat(s2Char);
        }
        return mergedString;
    }
}
