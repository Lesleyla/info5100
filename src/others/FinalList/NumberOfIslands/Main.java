package others.FinalList.NumberOfIslands;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,0,1,0},
                {1,1,0,1,0},
                {1,1,0,0,0},
                {0,0,0,0,1}
        };
        System.out.println(NumberOfIslands(matrix));
    }

    private static int NumberOfIslands(int[][] matrix){
        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for(int i = 0; i < rows; i ++){
            for(int j = 0; j < cols; j ++){
                if(matrix[i][j] == 1 && visited[i][j] == false){
                    count++;
                    DFS(matrix, visited, i, j);
                }
            }
        }
        return count;
    }

    private static void DFS(int[][] matrix, boolean[][] visited, int row, int col){

        if(row >= matrix.length || row < 0 || col >= matrix[0].length || col < 0
                || visited[row][col] == true
                || matrix[row][col] == 0){
            return;
        }
        visited[row][col] = true;

        DFS(matrix, visited, row-1, col);
        DFS(matrix, visited, row+1, col);
        DFS(matrix, visited, row, col-1);
        DFS(matrix, visited, row, col+1);
    }
}
