package others.FinalList.MinimumDeletion;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "aaabbbcc";
        System.out.println(minDeletions(s));
    }

    private static int minDeletions(String s) {
        int freq[] = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq); //freq=0000...0000233
        int keep = freq[25];
        int prev = keep;
        for (int i = 24; i >= 0 && freq[i] != 0 && prev != 0; i --) {
            prev = Math.min(freq[i], prev - 1);
            keep += prev;
        }
        //prev != 0 记得写 可以少跑几次
        return s.length() - keep;
    }

}
