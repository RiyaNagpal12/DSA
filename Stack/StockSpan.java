/*
Stock Span Problem:
Finds the number of consecutive days before today 
for which the stock price was less than or equal to today's price.
Uses a stack for efficient computation in O(n) time.
*/
import java.util.*;

//stock span problem " no of consecutive days when price  <= todays price "
// formualla : i-prevhigh
public class StockSpan{
  
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
