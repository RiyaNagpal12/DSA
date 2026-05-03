// string containg ( ) { } [ ]

//Check if it is valid:

//Every opening bracket must have a matching closing bracket
//Order must be correct
import java.util.*;

public class q13 {
    public static boolean isvalid(String str){


        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length() ;i++){
            if(str.charAt(i)=='(' ||str.charAt(i)== '{' || str.charAt(i)=='['){
                st.push(str.charAt(i));
            }

            else {
                if(st.isEmpty()){
                    return false;
                }

                if ((st.peek()=='('&& str.charAt(i)== ')' )|| (st.peek()=='{'&& str.charAt(i)=='}')|| (st.peek()=='['&& str.charAt(i)==']')){
                    st.pop();

                }
                else{
                    return false;
                }
            }
           
        }

        if(st.isEmpty()){
            return true;
        }

        return false;

     


    }
    public static void main (String[] args){
        String str = "({[()]})";
        System.out.println(isvalid(str));

    }}
    

