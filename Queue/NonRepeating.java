/* /*
 * First Non-Repeating Character in a Stream
 *
 * This program finds the first non-repeating character at each step 
 * while processing a string as a stream of characters.
 *
 * Approach:
 * - A Queue is used to maintain the order of characters.
 * - A frequency array keeps track of how many times each character appears.
 * - For every new character:
 *   1. Add it to the queue and update its frequency.
 *   2. Remove characters from the front of the queue if they repeat.
 *   3. The front of the queue gives the first non-repeating character.
 *   4. If the queue becomes empty, no non-repeating character exists.
 *
 * Example:
 * Input:  "aabccxb"
 * Output: a empty b b b b x
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.LinkedList;
import java.util.Queue;

// first non repeating characters in stream of character 

public class q33 {
    public static void find(String str ){
        Queue <Character> q = new LinkedList<>();
        int freq[]= new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty()&& freq[q.peek()-'a']>1){
                q.remove();

            }

            if(q.isEmpty()){
                System.out.println("empty");
            }
            else{
                System.out.println(q.peek()+"");
            }


        }



    }

    public static void main(String[] args) {
        String str = "aabccxb";
        find(str);
    }
    
}
