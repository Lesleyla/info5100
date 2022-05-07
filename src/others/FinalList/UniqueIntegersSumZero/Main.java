package others.FinalList.UniqueIntegersSumZero;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //leetcode 1304
        int n = 7;
        int arr[] = FindUniqueIntegersSumZero(n);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] FindUniqueIntegersSumZero(int n) {
        int arr[] = new int[n];
        if (n % 2 != 0) { //奇数的情况
            int j = 0;
            for(int i = -n / 2; i <= n / 2; i ++){
                arr[j++] = i;
            }
        }
        else { //偶数的情况
            int j = 0;
            for(int i = -n / 2; i <= n / 2; i ++) {
                if(i != 0) arr[j++] = i;
                //the difference is no 0;
            }
        }
        return arr;
    }

}
