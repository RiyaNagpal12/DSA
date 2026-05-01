import java.util.ArrayDeque;
import java.util.Deque;

// Reversing first k element of queue


public class q27 {

    public static void reverse(int n , Deque<Integer> d){
          Deque<Integer> dq = new ArrayDeque<>();
        for(int i =0;i<n ;i++){
            dq.addFirst(d.removeFirst());


        }

        
        while(!dq.isEmpty()){
            d.addFirst(dq.removeLast());
        }
           System.out.println(dq);
        System.out.println(d);


    }

    public static void main(String[] args) {
         Deque<Integer> d= new ArrayDeque<>();
         d.addLast(10);
         d.addLast(20);
         d.addLast(30);
         d.addLast(40);
         d.addLast(50);
         d.addLast(60);
         d.addLast(70);
         d.addLast(80);
         d.addLast(90);
         d.addLast(100);
         reverse(5 , d);

        
    }
    
}
