import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        while (i < s.length()) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
                i++;
            } else if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']' ) {
                if ( st.empty() ||st.peek() != map.get(s.charAt(i))) {
                    return false;
                }
                else{
                    st.pop();
                    i++;
                }
            }
        }
        if(st.empty())

            return true;
        return false;

    }
}

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "}}}}";
        Solution obj = new Solution();
        boolean res = obj.isValid(s);
        System.out.println(res);
    }
}
