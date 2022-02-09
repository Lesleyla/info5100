package com.company;

import java.util.Scanner;
public class solution2 {
    public static boolean isUnique(String s) {
        long left = 0;
        long right = 0;
        for (char c : s.toCharArray()) {
            if (c >= 64) {
                long bitIndex = 1L << (c - 64);     //ASCII 0-63
                if ((right & bitIndex) != 0) {
                    return false;
                }
                right |= bitIndex;
            } else {
                long bitIndex = 1L << c;         //64-127
                if ((left & bitIndex) != 0) {
                    return false;
                }
                left |= bitIndex;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a string: if string has all unique characters, it will return true, otherwise false.");
        String s = scan.next();
        scan.close();

        System.out.println(isUnique(s));
    }
}