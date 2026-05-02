import java.util.Stack;

/* You are given an expression (string).
You need to check if it contains duplicate parentheses.

👉 Duplicate parentheses means:

Extra brackets with no meaningful content inside
Example:
"((a+b))" → ❌ Duplicate exists
"(a+(b)/c)" → ✅ No duplicate
"(a+b)" → ✅ No duplicate
"*/

/*Approach (Using Stack)
Traverse the string.
Push characters into stack until ')' is found.
When ')' appears:
Count elements inside the last '('
If count ≤ 1 → Duplicate found
Otherwise → valid */
public class q14 {

    public static boolean isduplicate(String str){
        Stack <Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch !=')'){
                st.push(ch);
            }
            else{
                int count =0;
                while(!st.isEmpty() && st.peek() !='('){
                    st.pop();
                    count++;
                }

                // remving opening bracket 

                if(!st.isEmpty()){
                    st.pop();
                }

                if(count ==0){
                    return true;
                }

            }
        }

        return false;

    }
    public static void main(String[] args) {
         String str = "((a+b)+c)";
        System.out.println(isduplicate(str));

        
    }


    
}
