package others.matrix.WordSearch2;

import others.matrix.WordSearch.BoxValue;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[][] matrix = {
                {"o", "a", "a", "n"},
                {"e", "t", "a", "e"},
                {"i", "h", "k", "r"},
                {"i", "f", "l", "v"},
        };
        String[] words = {"oath","pea","eat","rain"};
        for (String word : getWordsOnBoard(matrix, words)){
            System.out.println(word);
        }
    }

    private static ArrayList<String> getWordsOnBoard(String[][] matrix, String[] words){
        ArrayList<String> wordsOnBoard = new ArrayList<>();
        for (String word : words){
            if(searchWordInMatrix(matrix, word) == true){
                wordsOnBoard.add(word);
            }
        }
        return wordsOnBoard;
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
        //chack if we are in bounds, if current char is same as the current value in the word
        //or we have already visited this return

        if(row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length ||
                !matrix[row][col].equals(Character.toString(word.charAt(index))) ||
                visited[row][col] == true){
            return;
        }

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
