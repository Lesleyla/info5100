package assignment1;

import java.util.Scanner;

public class solution7 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            cnt[c - 'a']--;
            if(cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input string ransomNote:");
        String ransomNote = scan.next();
        System.out.print("Input string magazine:");
        String magazine = scan.next();
        scan.close();

        System.out.println(canConstruct(ransomNote, magazine));
        if(canConstruct(ransomNote, magazine) == true){
            System.out.println("ransomNote can be constructed from magazine");
        }else{
            System.out.println("ransomNote can not be constructed from magazine");
        }
    }
}
