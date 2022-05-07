package others.matrix.UniquePath2;
//leetcode 63
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        System.out.println(numOfUniquePaths(matrix));
    }

    private static int numOfUniquePaths(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int inf = Integer.MIN_VALUE;
        if(matrix[0][0] == 1){
            return 0;
        }//can't walk

        int[][] result = new int[rows][cols];
        result[0][0] = 1;
        //initialize the rows and cols
        for(int i = 1; i < rows; i ++){
            result[i][0] = (result[i-1][0] == inf || matrix[i][0] == 1) ? inf : 1;
        }

        for(int i = 1; i < cols; i ++){
            result[0][i] = (result[0][i-1] == inf || matrix[0][i] == 1) ? inf : 1;
        }

        for(int i = 1; i < rows; i ++){
            for(int j = 1; i < cols; j ++){
                if(matrix[i][j] == 1) {
                    result[i][j] = inf;
                }else if(result[i-1][j] == inf){
                    result[i][j] = result[i][j-1];
                }else if(result[i][j-1] == inf){
                    result[i][j] = result[i-1][j];
                }else{
                    result[i][j] = result[i][j-1] + result[i-1][j];
                }
            }
        }

        return result[rows-1][cols-1];
    }
}
