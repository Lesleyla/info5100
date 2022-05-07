package FinalExam.Question1;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "[()]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        int l = s.length();
        if (l % 2 == 1){
            return false;
        }
        Map<Character, Character> pairs = new HashMap<Character, Character>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        Deque<Character> stack = new LinkedList<Character>();
        for(int i = 0; i < l; i ++){
            char ch = s.charAt(i);
            //if the closed brackets appear first:
            if(pairs.containsKey(ch)) {
                if(stack.isEmpty() || stack.peek() != pairs.get(ch)){
                    return false;//Peek: return the first one but not remove it
                }
                stack.pop();
                //Pop: return the first one and remove it
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();//if is valid parentheses stack is empty

    }
}
