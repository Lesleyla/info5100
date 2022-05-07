package others.CountOfIslands;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,1,0,0},
                {0,0,0,1,1}
        };

        int numIslands = countIslands(matrix);
        System.out.println("Number of Islands: " + numIslands);
    }

    public static int countIslands(int[][] matrix){
        int count = 0;//count of islands
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 1 && visited[i][j] == false){
                    //if i have not visited this place and the matrix here is 1
                    count++;
                    visitNeighbors(matrix, visited, i, j);
                }
            }
        }
        return count;
    };

    private static void visitNeighbors(int[][] matrix, boolean[][] visited, int row, int col){
        //if the value of current one is 0
        //or we have visited this place earlier we just return
        if(row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length ||
         matrix[row][col] == 0 || visited[row][col] == true){
            return;
        }
        visited[row][col] = true;
        visitNeighbors(matrix, visited, row - 1, col);//top
        visitNeighbors(matrix, visited, row + 1, col);//bottom
        visitNeighbors(matrix, visited, row, col - 1);//left
        visitNeighbors(matrix, visited, row, col + 1);//right
    }
}
