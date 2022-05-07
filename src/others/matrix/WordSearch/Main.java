package others.matrix.WordSearch;

public class Main {
    public static void main(String[] args) {
        String[][] matrix = {
                {"A", "B", "C", "E"},
                {"S", "F", "C", "S"},
                {"A", "D", "E", "E"}
        };
        String word = "ABCCED";
        System.out.println(searchWordInMatrix(matrix, word));
    }
    private static boolean searchWordInMatrix(String[][] matrix, String word){
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int index = 0;
        BoxValue<Boolean> bFound = new BoxValue<>(false);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows; j++){
                visitNeighbors(matrix, visited, i, j, index, word, bFound);
                if(bFound.data == true){
                    return true;
                }
            }
        }
        return false;
    }

    private static void visitNeighbors(String[][] matrix,
                                       boolean[][] visited,
                                       int row,
                                       int col,
                                       int index,
                                       String word,
                                       BoxValue<Boolean> bFound){
        //check if we are in bounds, if current char is same as the current value in the word
        //or we have already visited this return

        if(row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length ||
                !matrix[row][col].equals(Character.toString(word.charAt(index))) ||
                visited[row][col] == true){
            return;
        }
        System.out.println(matrix[row][col]);
        //print在上一个if语句之前就有问题 index会有-1；print在下一个if语句之后也有问题，最后一个字母不print
        //if this is the last word
        if(index == word.length() - 1){
            bFound.data = true;
            return;
        }

        visited[row][col] = true;
        visitNeighbors(matrix, visited, row - 1, col, index + 1, word, bFound);//top
        visitNeighbors(matrix, visited, row, col + 1, index + 1, word, bFound);//right
        visitNeighbors(matrix, visited, row + 1, col, index + 1, word, bFound);//bottom
        visitNeighbors(matrix, visited, row, col - 1, index + 1, word, bFound);//left
    }
}
