import java.util.*;

class Solution {
    public int[] nextlargest(int[] nums) {
        
        int[] nge = new int[nums.length];
        Stack<Integer> st = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {

       
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }

            
            if (st.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }

            // Current element ko stack mein daalo
            st.push(nums[i]);
        }

        return nge;
    }
}
      
