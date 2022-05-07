package others.matrix.GetMinPathMatrix;
//leetcode 64
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {4,7,8,6,4},
                {6,7,3,9,2},
                {3,8,1,2,4},
                {7,1,7,3,7},
                {2,9,8,9,3}
        };

        System.out.println(getMinPathMatrix(matrix));
    }

    private static int getMinPathMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[rows][cols];
        result[0][0] = matrix[0][0];

        //initialize first col
        for(int i = 1; i < cols; i ++){
            result[0][i] = matrix[0][i] + result[0][i-1];
        }
        //initialize first row
        for(int i = 1; i < cols; i ++){
            result[i][0] = matrix[i][0] + result[i-1][0];
        }
        for(int i = 1; i < rows; i ++){
            for(int j = 1; j < cols; j ++){
                result[i][j] = matrix[i][j] + Math.min(result[i-1][j], result[i][j-1]);
            }
        }

        //show the path:
        int row = rows - 1;
        int col = cols - 1;
        Stack<Integer> stack = new Stack<>();
        while(row != 0 && col != 0){
            stack.push(matrix[row][col]);

            int val = result[row][col] - matrix[row][col];
            if(row == 0){
                col--;
                continue;
            }
            if(col == 0){
                row--;
                continue;
            }
            if(val == matrix[row-1][col]){
                row--;
            }else{
                col--;
            }
        }
        stack.push(matrix[0][0]);//don't forget to add the initial val
        while(!stack.isEmpty()){
            System.out.println(stack.pop() + "->");
        }
        System.out.println("END");
        return result[rows-1][cols-1];
    }
}
