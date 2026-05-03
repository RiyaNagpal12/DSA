
// reverse a string using stack 
import java.util.*; 


public class q11 {

    static class stack{
        static ArrayList<Character> list = new ArrayList<>();
        public boolean isempty()
{    if (list.size()==0){
    return true;


}
return false;

}        public void push(char data){
            list.add(data);

        }

        public char pop(){
            if(list.isempty() == true){
                return '\0';
            }
            char top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }


        public char peek(){
            if(list.isEmpty()){
                return '\0';
            }

            char top = list.get(list.size()-1);
        return top;        }


    }


    public static void reversestring(String str   ){

        stack st = new stack();
        int i=0;
        
        while(i< str.length()){

            st.push(str.charAt(i));
            i++;


            


        }
        StringBuilder st1 = new StringBuilder();
        while(st.isempty()== false){
            
        st1.append(st.pop());

        }
        System.out.println(st1.toString());


    }

    public static void main(String[] args){
        String str = "abc";
        reversestring(str);

    }
}
