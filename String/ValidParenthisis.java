// Valid Parenthesis 
import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String str) {

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // opening brackets
            if(ch == '(' || ch == '[' || ch == '{') {

                st.push(ch);
            }

            // closing brackets
            else {

                if(st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                if((ch == ')' && top != '(') ||
                   (ch == ']' && top != '[') ||
                   (ch == '}' && top != '{')) {

                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {

        String str = "{[()]}";

        System.out.println(isValid(str));
    }
}
