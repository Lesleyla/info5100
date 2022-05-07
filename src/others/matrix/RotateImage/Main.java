package others.matrix.RotateImage;

import java.util.Arrays;

//leetcode 48
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] rotated = rotate90Degree(matrix);
        printMatrix(rotated);
    }

    private static int[][] rotate90Degree(int[][] matrix){
        int[][] transpose = transpose(matrix);

        for(int i = 0; i < transpose.length; i ++){
            int arr[] = transpose[i];
            rotateArray(arr);
        }
        return transpose;
    }

    private static int[][] transpose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for(int i = 0; i < rows; i ++){
            int[] arr = matrix[i];
            for(int j = 0; j < cols; j ++){
                transpose[j][i] = arr[j];
            }
        }
        return transpose;
    }

    private static void rotateArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    //important!!!
    private static void printMatrix(int[][] matrix){
        int rows = matrix.length;
        for(int i = 0; i < rows; i ++){
            int[] arr = matrix[i];
            System.out.println(Arrays.toString(arr));
        }
    }
}
