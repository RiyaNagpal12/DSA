/* * Approach:
 * - Start with "1" in the queue.
 * - For each iteration:
 *   1. Remove the front element from the queue.
 *   2. Print it (this is the next binary number).
 *   3. Add two new elements:
 *        current + "0"
 *        current + "1"
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */


import java.util.LinkedList;
import java.util.Queue;

// generate binary no 
public class q28 {

    public static void generatebinary(int n ){
        Queue <String> q = new LinkedList<>() ;
        q.add("1");

        for(int i=0;i<n ; i++){
            String current = q.remove();
            System.out.println(current);

            q.add(current+"0");
            q.add(current+"1");
        }



    }

    public static void main(String[] args){
        int n=2 ;
        generatebinary(n);

    }
    
    

    
}
