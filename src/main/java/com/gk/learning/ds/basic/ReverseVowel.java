package com.gk.learning.ds.basic;

public class ReverseVowel {

    public static final String VOWELS = "aieou";
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);

        int i = 0;
        int j = s.length() -1;
        while(i <= j) {
            while (i < j && !VOWELS.contains(String.valueOf(s.charAt(i)))) {
                i++;
            }
            while (i < j && !VOWELS.contains(String.valueOf(s.charAt(j)))) {
                j--;
            }
            stringBuilder.setCharAt(i, s.charAt(j));
            stringBuilder.setCharAt(j, s.charAt(i));
            i++;
            j--;
        }
        return stringBuilder.toString();

    }
}
