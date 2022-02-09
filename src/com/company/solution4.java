package com.company;

import java.util.Scanner;

public class solution4 {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] table = new int[26];
        for(int i=0; i<s.length(); i++){
            table[s.charAt(i) - 'a'] ++;
            table[t.charAt(i) - 'a'] --;
        }
        for(int i=0; i<26; i++){
            if(table[i] != 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first string:");
        String s = scan.next();
        System.out.print("Input second string:");
        String t = scan.next();
        scan.close();

        System.out.println(isAnagram(s, t));
        if(isAnagram(s, t) == true){
            System.out.println(t + " is an anagram of "+ s);
        }else{
            System.out.println(t + " is not an anagram of "+ s);
        }
    }
}
