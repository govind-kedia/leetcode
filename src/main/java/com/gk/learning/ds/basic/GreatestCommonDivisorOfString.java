package com.gk.learning.ds.basic;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class GreatestCommonDivisorOfString {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }

    static String gcdOfStrings(String str1, String str2) {
       String s1 =  str1 + str2;
       String s2 =  str2 + str1;
       if(!s1.equals(s2)){
           return "";
       }
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return b;
    }
}
