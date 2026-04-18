/* Solved the "Find All Disappeared Numbers in an Array" problem using an efficient in-place approach.

Used index mapping (value - 1) to mark visited elements by making them negative. 
Finally, collected indices with positive values to identify missing numbers.

Time Complexity: O(n)
Space Complexity: O(1) (excluding output list) */

import java.util.*;
public class DisapperedElement {
  public static List<Integer> FindDiaspperedElement (int nums[]){
    // mark  negative for visited 
    for (int i =0;i<nums.length ;i++){
      int index = Math.abs(nums[i])-1;
      if(nums[index]>0){
        nums[index]= -nums[index];
      }

    }

    List<Integer> result = new ArrayList<>();

    // check non visited elements 
    for(int i =0;i<nums .length ;i++){
      if(nums[i]>0){
        result.add(i+1);
      }
    }
    return result ; 
  }
  public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        
        List<Integer> missing =FindDiaspperedElement(arr);
        
        System.out.println("Missing numbers: " + missing);
    }
}
        
      
