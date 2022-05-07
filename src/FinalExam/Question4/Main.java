package FinalExam.Question4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = FindUniqueIntegersSumZero(n);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] FindUniqueIntegersSumZero(int n) {
        int arr[] = new int[n];
        if (n % 2 != 0) { //sum number is odd number
            int j = 0;
            for(int i = -n / 2; i <= n / 2; i ++){
                arr[j++] = i;
            }
        }
        else { //even number
            int j = 0;
            for(int i = -n / 2; i <= n / 2; i ++) {
                if(i != 0) arr[j++] = i;
                //the difference is adding 0 or not;
            }
        }
        return arr;
    }

}
