package others.matrix.MatrixQuestions;

public class Main {
    enum Direction {UP, DOWN, LEFT, RIGHT}; //enumerate
    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3, 4},
//                {12,13,14, 5},
//                {11,16,15, 6},
//                {10, 9, 8, 7},
        //System.out.println(createSpiralMatrix(4)); wrong!!
        int[][] matrix = createSpiralMatrix(5);
        printSpiralMatrix(matrix);

    }

    private static void printSpiralMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = rows * cols;
        int topLimit = 0;
        int bottomLimit = rows - 1;
        int leftLimit = 0;
        int rightLimit = cols - 1;

        int col = 0;
        int row = 0;

        Direction dir = Direction.RIGHT;
        while (count > 0) {
            System.out.printf(matrix[row][col] + ",");
            count--;
            if(dir == Direction.RIGHT){
                col++;
                if(col > rightLimit){
                    col--;//when came to the last one of this direction
                    row++;
                    dir = Direction.DOWN;
                    topLimit ++;
                }
            }else if (dir == Direction.LEFT){
                col--;
                if(col < leftLimit){
                    col++;
                    row--;
                    dir = Direction.UP;
                    bottomLimit --;
                }
            }else if (dir == Direction.UP){
                row--;
                if(row < topLimit){
                    row++;
                    col++;
                    dir = Direction.RIGHT;
                    leftLimit ++;
                }
            }else{
                row++;
                if(row > bottomLimit){
                    row--;
                    col--;
                    dir = Direction.LEFT;
                    rightLimit --;
                }
            }
        }
    }
    //create a matrix
    private static int[][] createSpiralMatrix(int n){
        int rows = n;
        int cols = n;
        int[][] matrix = new int[rows][cols];
        int row = 0;
        int col = 0;
        int count = rows*cols;
        Direction dir = Direction.RIGHT;

        int topLimit = 0;
        int bottomLimit = rows - 1;
        int leftLimit = 0;
        int rightLimit = cols - 1;
        int cur_Val = 1;
        while (count > 0){
            matrix[row][col] = cur_Val;
            cur_Val++;
            count--;
            if(dir == Direction.RIGHT){
                col++;
                if(col > rightLimit){
                    col--;//when came to the last one of this direction
                    row++;
                    dir = Direction.DOWN;
                    topLimit ++;
                }
            }else if (dir == Direction.LEFT){
                col--;
                if(col < leftLimit){
                    col++;
                    row--;
                    dir = Direction.UP;
                    bottomLimit --;
                }
            }else if (dir == Direction.UP){
                row--;
                if(row < topLimit){
                    row++;
                    col++;
                    dir = Direction.RIGHT;
                    leftLimit ++;
                }
            }else{
                row++;
                if(row > bottomLimit){
                    row--;
                    col--;
                    dir = Direction.LEFT;
                    rightLimit --;
                }
            }
        }

        return matrix;
    }
}
