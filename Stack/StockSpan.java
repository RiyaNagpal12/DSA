import java.util.*;

//stock span problem " no of consecutive days when price  <= todays price "
// formualla : i-prevhigh
public class q12 {
  
    public static void stockspan(int stock[] , int span[]){
        Stack<Integer> st =new Stack<>();
        span[0]=1;
        st.push(0);
        for(int i=1 ;i< stock.length ;i++){
            int current = stock[i];
            while(!st.isEmpty() && current> stock[st.peek()]){

                st.pop();



            }
            if(st.isEmpty()){
                span[i]=i+1;
            }
            else {
               int  prevhigh = st.peek();
               span[i]= i-prevhigh;
            }
            st.push(i);
        }
        
    }


    public static void main(String[] args) {;
        
        int stock[] ={ 100 , 80 ,60,70 ,60,85,100};
        int span[] = new int[stock.length];
        stockspan(stock, span);
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }

    }
    
}
