package others.FinalList.LetterCombinationsPhoneNumber;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        String inputDigits = "236";
        System.out.println(letterCombinations(inputDigits));
    }

    private static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        String digitLetters[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combinations.add("");//initialize the combination, let the first digit input work well with combine method
        for (int i = 0; i < digits.length(); i ++){
            combinations = combine(digitLetters[digits.charAt(i) - '0'], combinations);
        }
        return combinations;
    }

    private static List<String> combine(String digitsLetter, List<String> combinations){
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < digitsLetter.length(); i ++){
            for (String n : combinations){
                result.add(n + digitsLetter.charAt(i));
            }
        }
        return result;
    }
}
