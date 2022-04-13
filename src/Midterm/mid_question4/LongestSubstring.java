package Midterm.mid_question4;
import java.util.LinkedHashMap;

public class LongestSubstring {
    static void longestSubstring(String s) {

        char[] charArray = s.toCharArray();
        String longestSubstring = null; // initialize
        int maxLength = 0;
        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if(!charMap.containsKey(ch)) {
                charMap.put(ch, i);
            }

            else {
                i = charMap.get(ch);
                charMap.clear();
            }

            if(charMap.size() > maxLength) {
                maxLength = charMap.size();
                longestSubstring = charMap.keySet().toString();
            }
        }

        System.out.println("Input String : "+ s);
        System.out.println("The longest substring : "+longestSubstring);
    }

    public static void main(String[] args) {
        longestSubstring("abcabcbb");
        longestSubstring("");
    }
}