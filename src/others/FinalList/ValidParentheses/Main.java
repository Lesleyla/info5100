package others.FinalList.ValidParentheses;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        String s = "[()]";
        System.out.println(isValidParentheses(s));
    }

    public static boolean isValidParentheses(String s){
        int l = s.length();
        if (l % 2 == 1){
            return false;
        }
        Map<Character, Character> pairs = new HashMap<Character, Character>();
        pairs.put(')', '(');//注意key和value的顺序
        pairs.put(']', '[');
        pairs.put('}', '{');
//        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
//            put(')', '(');
//            put(']', '[');
//            put('}', '{');
//        }};
        Deque<Character> stack = new LinkedList<Character>();
        for(int i = 0; i < l; i ++){
            char ch = s.charAt(i);
            //if the closed brackets appear first:
            if(pairs.containsKey(ch)) {
                if(stack.isEmpty() || stack.peek() != pairs.get(ch)){
                    return false;//Peek: return the first one but not remove it
                }
                //配对成功：
                stack.pop();
                //Pop: return the first one and remove it
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();//如果都配对成功 stack is empty

    }
}
