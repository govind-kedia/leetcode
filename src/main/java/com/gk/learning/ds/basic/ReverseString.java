package com.gk.learning.ds.basic;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }

    public static String reverseWords(String s) {
        String[] split = s.split("\\s+");
        StringBuilder s1 = new StringBuilder("");
        for(int i = split.length -1 ; i >= 0; i --){
            if(!split[i].isEmpty()) {
                s1.append(split[i]).append(" ");
            }
        }
        return s1.toString().trim();
    }
}
